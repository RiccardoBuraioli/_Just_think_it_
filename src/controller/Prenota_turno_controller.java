package controller;


import java.net.URL;
import java.util.ResourceBundle;

import dao.Evento_dao;
import dao.Prenota_dao;
import entity.Partecipa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Prenota_turno_controller {

	private int id_utente;

	private int id_caritas;

	private TextField textFields[];
	
	private Partecipa partecipazione;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<?> Turni;

    @FXML
    private ChoiceBox<?> ora_inizio;

    @FXML
    private ChoiceBox<?> ora_fine;

    @FXML
    private TextField CV;

    @FXML
    private Button indietro;

    @FXML
    private Button prenota;


    @FXML
    void indietro(ActionEvent event) {

    }

    
 public boolean checker() {
    	
    	 
		//Controlla che non ci siano campi lasciati vuoti
    	for (int i = 0; i < textFields.length; i++) {
			if (textFields[i].getText().isEmpty()) {
				
				return false;
			}
	
		}
		return true;
    	
  }
    
    
    
    
    @FXML
    boolean prenota_turno(ActionEvent event) {
	boolean error;
    	
    	error = checker();
    	
    	
    	
    	
   
    	
    	Prenota_dao partecipazione = new Prenota_dao();
    	
    	
    	
    	return error;

  

    }
    
    
    
  public void setData(int id_car, int id_ute) {
  	this.id_caritas = id_car;
  	this.id_utente = id_ute;
  }
  

    @FXML
    void initialize() {
        assert Turni != null : "fx:id=\"Turni\" was not injected: check your FXML file 'Prenota_turno_volontariato.fxml'.";
        assert ora_inizio != null : "fx:id=\"ora_inizio\" was not injected: check your FXML file 'Prenota_turno_volontariato.fxml'.";
        assert ora_fine != null : "fx:id=\"ora_fine\" was not injected: check your FXML file 'Prenota_turno_volontariato.fxml'.";
        assert CV != null : "fx:id=\"CV\" was not injected: check your FXML file 'Prenota_turno_volontariato.fxml'.";
        assert indietro != null : "fx:id=\"indietro\" was not injected: check your FXML file 'Prenota_turno_volontariato.fxml'.";
        assert prenota != null : "fx:id=\"prenota\" was not injected: check your FXML file 'Prenota_turno_volontariato.fxml'.";

    }
}




