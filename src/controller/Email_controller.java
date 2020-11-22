package controller;


import dao.Email_dao;
import entity.Email_entity;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Email_controller {

	private Email_dao email_d;
	private Email_entity email_e;
	private int id_caritas;
	private int id_utente;
	
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
    	
    	int i=0;
    	email_e = new Email_entity(destinatario.getText(), destinatario.getText(), messaggio.getText(), oggetto.getText());

    	email_d = new Email_dao();
    	i = email_d.invia_email(email_e);
    	return i;
    	
    }
    
    
    
    
    
}
	
