package enviaremail;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {
private StringProperty servidor=new SimpleStringProperty();
private IntegerProperty puerto=new SimpleIntegerProperty();
private BooleanProperty ssl=new SimpleBooleanProperty();
private StringProperty remitente=new SimpleStringProperty();
private StringProperty password=new SimpleStringProperty();
private StringProperty destinatario=new SimpleStringProperty();
private StringProperty asunto=new SimpleStringProperty();
private StringProperty mensaje=new SimpleStringProperty();
public StringProperty servidorProperty() {
	return this.servidor;
}

public String getServidor() {
	return this.servidorProperty().get();
}

public void setServidor(final String servidor) {
	this.servidorProperty().set(servidor);
}

public IntegerProperty puertoProperty() {
	return this.puerto;
}

public int getPuerto() {
	return this.puertoProperty().get();
}

public void setPuerto(final int puerto) {
	this.puertoProperty().set(puerto);
}

public BooleanProperty sslProperty() {
	return this.ssl;
}

public boolean isSsl() {
	return this.sslProperty().get();
}

public void setSsl(final boolean ssl) {
	this.sslProperty().set(ssl);
}

public StringProperty remitenteProperty() {
	return this.remitente;
}

public String getRemitente() {
	return this.remitenteProperty().get();
}

public void setRemitente(final String remitente) {
	this.remitenteProperty().set(remitente);
}

public StringProperty passwordProperty() {
	return this.password;
}

public String getPassword() {
	return this.passwordProperty().get();
}

public void setPassword(final String password) {
	this.passwordProperty().set(password);
}

public StringProperty destinatarioProperty() {
	return this.destinatario;
}

public String getDestinatario() {
	return this.destinatarioProperty().get();
}

public void setDestinatario(final String destinatario) {
	this.destinatarioProperty().set(destinatario);
}

public StringProperty asuntoProperty() {
	return this.asunto;
}

public String getAsunto() {
	return this.asuntoProperty().get();
}

public void setAsunto(final String asunto) {
	this.asuntoProperty().set(asunto);
}

public StringProperty mensajeProperty() {
	return this.mensaje;
}

public String getMensaje() {
	return this.mensajeProperty().get();
}

public void setMensaje(final String mensaje) {
	this.mensajeProperty().set(mensaje);
}

}
