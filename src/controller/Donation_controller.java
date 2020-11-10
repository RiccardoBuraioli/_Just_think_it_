package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dao.Donation_dao;
import entity.Donazione;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Donation_controller implements Initializable {
	TextField[] textFields;
	private int id_caritas;
	private int id_utente;
	private int tipo;

    @FXML
    private RadioButton vestiti;

    @FXML
    private RadioButton cibo;

    @FXML
    private Button donazione;

    @FXML
    private Button indietro;

    @FXML
    private TextField descrizione;

    @FXML
    private TextField indirizzo;

    @FXML
    void Back(MouseEvent event) {

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
    	
    	error = checker();
    	
    	Donazione dono = new Donazione(descrizione.getText(), indirizzo.getText(),id_caritas, id_utente, null, tipo);
    	
    	Donation_dao donosql = new Donation_dao();
    	
    	error = donosql.crea_donazione(dono);
    	
    	return error;
    	
    }
    
    
       
    public void setData(int id_car, int id_ute) {
    	this.id_caritas = id_car;
    	this.id_utente = id_ute;
    	System.out.println(id_ute);
    	System.out.println(id_car);
    }
    
    
    
public void initialize(URL location, ResourceBundle resources) {
		
		
		textFields = new TextField[] {descrizione, indirizzo};
		
		
	}

}
