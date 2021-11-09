package enviaremail;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable{
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

	    }

	    @FXML
	    void onEnviarButton(ActionEvent event) {

	    }

	    @FXML
	    void onLimpiarButton(ActionEvent event) {

	    }


public void initialize(URL location, ResourceBundle resources) {
	// TODO Auto-generated method stub
	
}
public GridPane getView() {
	return view;
}
}
