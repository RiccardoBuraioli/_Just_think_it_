package controller;

import java.io.IOException;
import com.sothawo.mapjfx.Projection;
//import com.sothawo.mapjfxdemo.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;
import entity.VolunteerUser;






public  class User_Home_Controller{
	
	private VolunteerUser currentUser;
	
	
	private int idUtente;
	

	
	public VolunteerUser getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(VolunteerUser currentUser) {
		this.currentUser = currentUser;
	}
	
	
	
	public User_Home_Controller() {
		
	}
	
	
    public void deleteAccountButtonPressed(Window event) {

    }

   
   public void profileButtonPressed(Window event) {
    	
    	try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/boundary/UserProfilePage.fxml"));
			Parent root = loader.load();
			Profile_Controller profileController = loader.getController();
			profileController.initData(getCurrentUser());
			Stage home = (Stage) event.getScene().getWindow();
			home.setScene(new Scene(root, 800, 600));
			
			home.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

    }

    
   public void helpButtonPressed(Window event) {

    }

 
    
    public void logoutButtonPressed(Window event) {
    	
    	try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/boundary/Login_boundary.fxml"));
			Parent root = loader.load();
			Stage home = (Stage) event.getScene().getWindow();
			home.setScene(new Scene(root, 600, 385));
			home.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


  
    public void searchCaritasButtonPressed(Window event) {
    	
    	try {

    	    		
    	        String fxmlFile = "/boundary/Cerca_caritas.fxml";
    	      
    	        FXMLLoader fxmlLoader = new FXMLLoader();
    	        Parent rootNode = fxmlLoader.load(getClass().getResourceAsStream(fxmlFile));
    	       
    	        final Cerca_caritas controller = fxmlLoader.getController();
    	        final Projection projection = /*getParameters().getUnnamed().contains("wgs84")
    	            ? Projection.WGS_84 : */Projection.WEB_MERCATOR;
    	        controller.initMapAndControls(projection);
    	        controller.setIdUtente(this.idUtente);

    	        Scene scene = new Scene(rootNode);
    	        Stage primaryStage = (Stage) event.getScene().getWindow();

    	        primaryStage.setTitle("sothawo mapjfx demo application");
    	        primaryStage.setScene(scene);
    	      
    	        primaryStage.show();
    	        
    	        
    	        

    	     
    		
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
      
   
    }
 


    public void creadonazione(Window event) {
    	
    	
      	try {
    			FXMLLoader loader = new FXMLLoader(getClass().getResource("/boundary/donation.fxml"));
    			Parent root = loader.load();
    			Stage home = (Stage) event.getScene().getWindow();
    			home.setScene(new Scene(root,825, 550));
    			home.show();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}

    
    }
    


	public void setIdUtente(int id_utente) {
		this.idUtente = id_utente;
		
	}

}
