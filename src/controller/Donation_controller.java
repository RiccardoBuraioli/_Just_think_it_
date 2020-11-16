package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dao.Donation_dao;
import entity.Donazione;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.input.MouseEvent;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Donation_controller implements Initializable {
	TextField[] textFields;
	private int id_caritas;
	private int id_utente;
	private int tipo;
	Donazione dono;

    @FXML
    private RadioButton vestiti;

    @FXML
    private RadioButton cibo;

    @FXML
    private Button donazione;

    @FXML
    private Button indietro;

    @FXML
    private TextField indirizzo;

    @FXML
    private TextArea descrizione;

    @FXML
    void Back(MouseEvent event) {

    }

    
    
   
    
  public Donation_controller() {
		super();
		dono = new Donazione();
	}





public int checker() {
    	
    	//Controlla che non ci siano campi lasciati vuoti
    	for (int i = 0; i < textFields.length; i++) {
			if (textFields[i].getText().isEmpty()) {
				
				return -1;
			}
		//	else if (type.isSelected() || type2.isSelected()) {
			else if(cibo.isSelected()) {
				 tipo = 1;
	    		return 0; //Almeno uno dei tipi deve essere selezionato
	    		
	    		
			}else if(vestiti.isSelected()) {
				tipo = 2;
				
				return 1; //Almeno uno dei tipi deve essere selezionato
			}
		}
		return 0;
    	
  }


    @FXML
    public int creaDonazione(ActionEvent event) {
    	int error;
    	Donation_dao donosql = new Donation_dao();
    	error = checker();
    	
    
    	dono.setIndirizzo(indirizzo.getText());
    	dono.setDescrizione(descrizione.getText());
    	
    	dono.setId_caritas(id_caritas);
    	dono.setId_utente(id_utente);
    	dono.setTipologia(tipo);
    	error = donosql.crea_donazione(dono);
    	
    	return error;
    	
    }
    
    
       
    public void setData(int id_car, int id_ute) {
    	this.id_caritas = id_car;
    	this.id_utente = id_ute;
    }
    
    
    
public void initialize(URL location, ResourceBundle resources) {
		
		
		textFields = new TextField[] {indirizzo};
		
		
	}

}
