package enviaremail;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.util.converter.NumberStringConverter;

public class Controller implements Initializable{
	private Model model=new Model();
	public Controller() throws IOException {
		FXMLLoader loader=new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}

	 @FXML
	    private GridPane view;

	    @FXML
	    private TextField servidorText;

	    @FXML
	    private TextField puertoText;

	    @FXML
	    private TextField destinatarioText;

	    @FXML
	    private TextField asuntoText;

	    @FXML
	    private TextArea mensajeText;

	    @FXML
	    private CheckBox sslCheck;

	    @FXML
	    private TextField remitenteText;

	    @FXML
	    private PasswordField contraText;

	    @FXML
	    private Button enviarButton;

	    @FXML
	    private Button limpiarButton;

	    @FXML
	    private Button cerrarButton;

	    @FXML
	    void onCerrarButton(ActionEvent event) {
Platform.exit();
	    }

	    @FXML
	    void onEnviarButton(ActionEvent event)throws EmailException {
	    	int puerto=model.getPuerto();
	    	Alert enviado = new Alert(AlertType.CONFIRMATION);
	    	Alert noEnviado = new Alert(AlertType.ERROR);
	    	
try {
	Email email = new SimpleEmail();
	email.setHostName(model.getServidor());
	email.setSmtpPort(puerto);
	email.setAuthenticator(new DefaultAuthenticator(model.getRemitente(), model.getPassword()));
	email.setSSLOnConnect(model.isSsl());
	email.setFrom(model.getRemitente());
	email.setSubject(model.getAsunto());
	email.setMsg(model.getMensaje());
	email.addTo(model.getDestinatario());
	email.send();
	
	enviado.setTitle("Mensaje enviado");
	enviado.setContentText("Mensaje enviado a "+model.getDestinatario());
	enviado.showAndWait();
	
	destinatarioText.clear();
	asuntoText.clear();
	mensajeText.clear();
} catch (Exception e) {
	noEnviado.setTitle("Error");
	noEnviado.setContentText(e.getMessage());
	noEnviado.setHeaderText("Error al enviar el mensaje");
	noEnviado.showAndWait();
}
	    }

	    @FXML
	    void onLimpiarButton(ActionEvent event) {
	    	
	    	servidorText.clear();
	    	puertoText.clear();
	    	sslCheck.setSelected(false);
	    	remitenteText.clear();
	    	contraText.clear();
	    	destinatarioText.clear();
	    	asuntoText.clear();
	    	mensajeText.clear();
	    }


public void initialize(URL location, ResourceBundle resources) {
	Bindings.bindBidirectional(puertoText.textProperty(),model.puertoProperty(), new NumberStringConverter());
	
	model.servidorProperty().bindBidirectional(servidorText.textProperty());
	model.sslProperty().bindBidirectional(sslCheck.selectedProperty());
	model.remitenteProperty().bindBidirectional(remitenteText.textProperty());
	model.passwordProperty().bindBidirectional(contraText.textProperty());
	model.destinatarioProperty().bindBidirectional(destinatarioText.textProperty());
	model.asuntoProperty().bindBidirectional(asuntoText.textProperty());
	model.mensajeProperty().bindBidirectional(mensajeText.textProperty());
	
}
public GridPane getView() {
	return view;
}
}
