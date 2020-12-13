package bean;

import java.io.IOException;

import controller.Login_Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginBoundary {

	private Login_Controller login_c = new Login_Controller();

	
	@FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button registerButton;
    
    @FXML
    void loginPressed(ActionEvent event) {
    
    	login_c.LoginAccess(loginButton.getScene().getWindow(), usernameField.getText(), passwordField.getText());
    	
    	
    	
    }
    
    @FXML
    void registrazionePressed(ActionEvent event) {
    	
     	try {
			Parent root = FXMLLoader.load(getClass().getResource("/boundary/RegistrazioneMenu.fxml"));
			Stage signUp = (Stage) registerButton.getScene().getWindow();
			Scene scene = new Scene(root,600,400);
			signUp.setScene(scene);
			signUp.show();
			signUp.setResizable(false);
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    }
	

}
