package bean;

import controller.Email_controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EmailBoundary {
	
	private Email_controller email_c;

	@FXML
    private TextArea messaggio;

    @FXML
    private TextField oggetto;

    @FXML
    private TextField destinatario;

    @FXML
    private TextField mittente;

    @FXML
    private Button invia;

    @FXML
    public int send_message(ActionEvent event) {
    	int i = 0;
    	
   	i =email_c.send_message_controller(destinatario.getText(), destinatario.getText(), messaggio.getText(), oggetto.getText());

   
  	return i;
    	
    }
    
	@FXML
	void initialize() {
	
		email_c = new Email_controller();
		
	}
	
	
	public EmailBoundary() {
		
	}
	
	
}
