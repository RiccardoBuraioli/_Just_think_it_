package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Registrazione_Menu_Controller {

    
    public Registrazione_Menu_Controller() {
    	
    }
    

 
   public void caritasButtonPressed(Window window) {
    	
	    try {
			Parent root = FXMLLoader.load(getClass().getResource("/boundary/RegistrazioneCaritas.fxml"));
			Stage signUp = (Stage) window.getScene().getWindow();
			Scene scene = new Scene(root,600,450);
			signUp.setScene(scene);
			signUp.show();
			signUp.setResizable(false);
		} catch (IOException e) {
			e.printStackTrace();
		}

    }

    
   public void negozioButtonPressed(Window window) {
    	
	    try {
			Parent root = FXMLLoader.load(getClass().getResource("/boundary/RegistrazioneShopManager.fxml"));
			Stage signUp = (Stage) window.getScene().getWindow();
			Scene scene = new Scene(root,600,450);
			signUp.setScene(scene);
			signUp.show();
			signUp.setResizable(false);
		} catch (IOException e) {
			e.printStackTrace();
		}

    }

   
    public void volontarioButtonPressed(Window window) {
    	
	    try {
			Parent root = FXMLLoader.load(getClass().getResource("/boundary/RegistrazioneVolontario.fxml"));
			Stage signUp = (Stage) window.getScene().getWindow();
			Scene scene = new Scene(root,600,450);
			signUp.setScene(scene);
			signUp.show();
			signUp.setResizable(false);
		} catch (IOException e) {
			e.printStackTrace();
		}

    }
	
		
	
	public void backButtonPressed(Window window) {
		
	    try {
			Parent root = FXMLLoader.load(getClass().getResource("../boundary/Login_boundary.fxml"));
			Stage signUp = (Stage) window.getScene().getWindow();
			Scene scene = new Scene(root,600,380);
			signUp.setScene(scene);
			signUp.show();
			signUp.setResizable(false);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
    public void dettagliCaritasPressed(Window window) {
		
	    try {
			Parent root = FXMLLoader.load(getClass().getResource("/buondary/Details.fxml"));
			Stage signUp = (Stage) window.getScene().getWindow();
			Scene scene = new Scene(root,600,400);
			signUp.setScene(scene);
			signUp.show();
			signUp.setResizable(false);
		} catch (IOException e) {
			e.printStackTrace();
		}

    }

    
    public void dettagliNegozioPressed(Window window) {
    	
	    try {
			Parent root = FXMLLoader.load(getClass().getResource("/boundary/Details.fxml"));
			Stage signUp = (Stage) window.getScene().getWindow();
			Scene scene = new Scene(root,600,400);
			signUp.setScene(scene);
			signUp.show();
			signUp.setResizable(false);
		} catch (IOException e) {
			e.printStackTrace();
		}

    }

   
    public void dettagliVolontarioPressed(Window window) {
    	
	    try {
			Parent root = FXMLLoader.load(getClass().getResource("/boundary/Details.fxml"));
			Stage signUp = (Stage) window.getScene().getWindow();
			Scene scene = new Scene(root,600,400);
			signUp.setScene(scene);
			signUp.show();
			signUp.setResizable(false);
		} catch (IOException e) {
			e.printStackTrace();
		}

    }

}
