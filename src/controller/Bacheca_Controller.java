package controller;


import java.io.IOException;
import java.util.List;

import bean.DonationBoundary;
import bean.EmailBoundary;
import dao.Bacheca_dao;
import entity.Bacheca_entity;
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
	private DonationBoundary donationBoundary;
	private List<Necessità> necessità;
	private Bacheca_dao bacheca;
	private EmailBoundary email_c;
	
	private Bacheca_entity bacheca_entity;
	

	
	public Bacheca_Controller() {
		this.email_c = new EmailBoundary();
	}
	

	
	public void crea_donazione() {
		try {

	        FXMLLoader fxmlLoader = new FXMLLoader();
	        Parent rootNode = fxmlLoader.load(getClass().getResourceAsStream("/boundary/Donation.fxml"));
	       
	        donationBoundary = fxmlLoader.getController();
	        
	        Stage stage = new Stage();
    		stage.setTitle("Donazione");
    		donationBoundary.initBoundary(id_caritas, id_utente);
    		stage.setScene(new Scene(rootNode, 800, 500));
    		stage.setResizable(false);
    		stage.show();
    		
    		
    		
    		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void crea_email() {
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




	
	public List<Necessità> loadForm(int id_car, int id_ute) {
		bacheca = new Bacheca_dao();
		bacheca_entity = new Bacheca_entity();
		necessità = bacheca.visualizza_necessità(id_car);
		bacheca_entity.setNecessità(necessità);
		this.id_caritas = id_car;
		this.id_utente = id_ute;
		return bacheca_entity.getNecessità();
			
		
		}
}
