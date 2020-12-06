package bean;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

import com.sothawo.mapjfx.Projection;

import controller.Cerca_caritas;
import controller.Profile_Controller;
import controller.User_Home_Controller;
import entity.VolunteerUser;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class User_Home_Boundary extends Application implements Initializable{
private VolunteerUser currentUser;
	
	private User_Home_Controller user_c ;
	private int idUtente;
	
	//Images slideshow
	private Image img1 ;
	private Image img2;
	private Image img3;
	private Image[] images = {img1, img2, img3};
	private int currentImage;
	
	public VolunteerUser getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(VolunteerUser currentUser) {
		this.currentUser = currentUser;
	}
	
	
	
	public User_Home_Boundary() {
		img1 = new Image("file:/C:/Users/PRX/Desktop/TZEDAKAH/DragoInizio/DragoForestain.PNG");
		 img2 = new Image("file:/C:/Users/PRX/Desktop/TZEDAKAH/DragoInizio/PelleDrago.PNG");
		 img3 = new Image("file:/C:/Users/PRX/Desktop/TZEDAKAH/DragoInizio/DragoForestaIniz.PNG");
		 currentImage = 0;
		 user_c = new User_Home_Controller();
	
	}
	
	@FXML
    private Text nomeCognome;
	
	@FXML 
	private Button CreaPacco;

	@FXML
    private Button profileButton;

    @FXML
    private Button helpButton;

    @FXML
    private Button deleteAccountButton;

    @FXML
    private ImageView imagePresentation;
    
    @FXML
    private ImageView profileImage;
    
    @FXML
    private Button searchCaritasButton;

    @FXML
    private Button logoutButton;
    
    @FXML
    private Button leftArrowButton;

    @FXML
    private Button rightArrowButton;

    @FXML
    void deleteAccountButtonPressed(ActionEvent event) {

    }

    @FXML
    void profileButtonPressed(ActionEvent event) {
    	
    	user_c.profileButtonPressed(profileButton.getScene().getWindow());
    }

    @FXML
    void helpButtonPressed(ActionEvent event) {
    	user_c.helpButtonPressed(helpButton.getScene().getWindow());
    }

    @FXML
    void leftArrowPressed(ActionEvent event) {
    	
    	//Se è la prima riparti dall'ultima
    	if (currentImage == 0) {
    		currentImage = 2;
    		imagePresentation.setImage(images[currentImage]);
    	} else {
    		currentImage--;
    		imagePresentation.setImage(images[currentImage]);
    	}
    }

    @FXML
    void logoutButtonPressed(ActionEvent event) {
    	
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Logout");
    	alert.setHeaderText("Dovrai accedere di nuovo se vuoi tornare alla home");
    	alert.setContentText("Sei sicuro di voler eseguire il logout?");

    	Optional<ButtonType> result = alert.showAndWait();
    	if (result.get() == ButtonType.OK){
    		user_c.logoutButtonPressed(logoutButton.getScene().getWindow());
        	
    	} else {
    	    //nothing
    	}
    	
	}

    @FXML
    void rightArrowPressed(ActionEvent event) {
    	
    	//Se è l'ultima riparti dalla prima
    	if (currentImage == 2) {
    		currentImage = 0;
    		imagePresentation.setImage(images[currentImage]);
    	} else {
    		currentImage++;
    		imagePresentation.setImage(images[currentImage]);
    	}
    }

    @FXML
    void searchCaritasButtonPressed(ActionEvent event) {
    	
    	user_c.searchCaritasButtonPressed(searchCaritasButton.getScene().getWindow());

   
    }
 

	public void initData(VolunteerUser user) {
    	setCurrentUser(user);
    	nomeCognome.setText(user.getNome() + " "+ user.getCognome());
    	final Circle clip = new Circle();
    	clip.setCenterX(25);
    	clip.setCenterY(58);
    	clip.setRadius(200);
        profileImage.setClip(clip);
    	long delay = 3000; //update once per 3 seconds.
    	new Timer().schedule(new TimerTask() {

    	    @Override
    	    public void run() {
    	        imagePresentation.setImage(images[currentImage++]);
    	        if (currentImage >= images.length) {
    	            currentImage = 0;
    	        }
    	    }
    	}, 0, delay);
    }
    
    public void creadonazione(ActionEvent event) {
    	
    	user_c.creadonazione(CreaPacco.getScene().getWindow());

    
    }
    


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void setIdUtente(int id_utente) {
		this.idUtente = id_utente;
		
	}

}


