package bean;

import controller.Profile_Controller;
import entity.VolunteerUser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;


public class Profile_Boundary {
	
	private VolunteerUser currentUser;

  

	private Profile_Controller Prof_c;
	
	@FXML
    private ImageView profileImageEdit;

    @FXML
    private Button backHomeButton;

    @FXML
    private Button editButton;

    @FXML
    private ImageView donazioniImage;

    @FXML
    private ImageView eventiImage;

    @FXML
    private Text nomeCognomeEdit;

    @FXML
    private Text emailEdit;

    @FXML
    private Text cittaEdit;

    @FXML
    private Text telefonoEdit;
    
 @FXML  
 void backHomeButtonPressed(ActionEvent event) {
	 Prof_c.backHomeButtonPressed(backHomeButton.getScene().getWindow());

    }

 @FXML
 void editButtonPressed(ActionEvent event) {

 }

 public VolunteerUser getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(VolunteerUser currentUser) {
		this.currentUser = currentUser;
	}
 
 public void initData(VolunteerUser user) {
 	setCurrentUser(user);
 	cittaEdit.setText(user.getIndirizzo());
 	telefonoEdit.setText(user.getRecapitoTel());
 	nomeCognomeEdit.setText(user.getNome() + " " + user.getCognome());
 }

 
}
