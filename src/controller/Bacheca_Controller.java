package controller;


import java.io.IOException;
import java.util.List;

import dao.Bacheca_dao;
import entity.Necessità;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Bacheca_Controller  {

	private int id_caritas;
	private int id_utente;
	private Donation_controller donationController;
	private List<Necessità> necessità;
	private Bacheca_dao bacheca;
	private Email_controller email_c;

	@FXML
	private Text nomeCaritas;

	@FXML
	private TextArea cibo;

	@FXML
	private TextArea varie;

	@FXML
	private TextArea vestiti;

	@FXML
	void crea_donazione(ActionEvent event) {
		try {

	        FXMLLoader fxmlLoader = new FXMLLoader();
	        Parent rootNode = fxmlLoader.load(getClass().getResourceAsStream("/boundary/Donation.fxml"));
	       
	        donationController = fxmlLoader.getController();
	        
	        Stage stage = new Stage();
    		stage.setTitle("Donazione");
    		donationController.setData(id_caritas, id_utente);
    		stage.setScene(new Scene(rootNode, 800, 500));
    		stage.setResizable(false);
    		stage.show();
    		
    		
    		
    		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@FXML
	void crea_email(ActionEvent event) {
    	try {     
	        FXMLLoader fxmlLoader = new FXMLLoader();

	        Parent rootNode = fxmlLoader.load(getClass().getResourceAsStream("/boundary/Email.fxml"));
	        
	        email_c = fxmlLoader.getController();
	        
	        Stage stage = new Stage();
    		stage.setTitle("Email");
    		
    		stage.setScene(new Scene(rootNode, 800, 500));
    		stage.setResizable(false);
    	
    		
    		
    		 
    		stage.show();
    		
    		
    		
    		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	@FXML
	void indietro(ActionEvent event) {

	}

	@FXML
	void initialize() {

		bacheca = new Bacheca_dao();
		
	}


	
	
	public void loadForm(int id_car, int id_ute) {
		necessità = bacheca.visualizza_necessità(id_car);
		this.id_caritas = id_car;
		this.id_utente = id_ute;
			
		for (int i = 0; i < necessità.size(); i++) {
			Necessità tmp = necessità.get(i);
			
			switch (tmp.getTipologia()) {
				case "Vestiti":
					vestiti.setText(tmp.getDescrizione());
					break;
	
				case "Cibo":
					cibo.setText(tmp.getDescrizione());
	
				case "Varie":
					varie.setText(tmp.getDescrizione());
					break;
	
				default:
					break;

			}

		}

	}
}
