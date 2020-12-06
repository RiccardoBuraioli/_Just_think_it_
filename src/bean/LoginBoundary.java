package bean;

import controller.Login_Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
    	
    	login_c.registrazionePressed(registerButton.getScene().getWindow());
    	
    }
	

}
