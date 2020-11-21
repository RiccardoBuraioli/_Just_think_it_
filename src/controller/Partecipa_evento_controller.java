package controller;
import entity.VolunteerUser;
import entity.partecipa_evento;
import entity.Donazione;
import entity.ShopUser;

import java.net.URL;
import java.util.ResourceBundle;

import dao.Donation_dao;
import dao.Evento_dao;
import dao.Prenota_dao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Partecipa_evento_controller {
	TextField[] textFields;
	partecipa_evento partecipaz;
	
	
    @FXML
    private ResourceBundle resources;


    @FXML
    private TextField importo;

    @FXML
    private TextField cdc;

    @FXML
    private ImageView imgEvento;

    @FXML
    private Button partecipa;

    @FXML
    private Button indietro;

    @FXML
    void indietro(ActionEvent event) {

    }
    
    
  public int checker() {
    	
    	//Controlla che non ci siano campi lasciati vuoti
    	for (int i = 0; i < textFields.length; i++) {
			if (textFields[i].getText().isEmpty()) {
				
				return -1;
			}
	
		}
		return 0;
    	
  }


    @FXML
    int partecipa_evento(ActionEvent event) {
    	
	int error;
    	
    	error = checker();
    	float f = Float.parseFloat(importo.getText());
    	
    	
    	
    	partecipaz.setImport(f);
    	
    	Evento_dao partecipazione = new Evento_dao();
    	partecipazione.Crea_partecipazione(partecipaz);
    	
    	
    	return error;

    }


    
    
    public void setData(int id_evento, int id_volontario) {
    	 partecipaz =  new partecipa_evento(id_evento,id_volontario);

    	
    }
    
    
    
 


	public void initialize(URL location, ResourceBundle resources) {
		
		
		textFields = new TextField[] {importo, cdc};
		
		
	}
    
    
    
}
