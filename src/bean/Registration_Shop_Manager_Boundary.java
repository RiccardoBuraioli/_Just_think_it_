package bean;

import java.net.URL;
import java.util.ResourceBundle;

import controller.Registration_Shop_Manager_Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Registration_Shop_Manager_Boundary {

	private Registration_Shop_Manager_Controller reg;
	private TextField[] textFields;	
	private int tipo;
	
    @FXML
    private TextField cittaResNeg;

    @FXML
    private TextField viaNeg;

    @FXML
    private TextField civicoNeg;

    @FXML
    private TextField telNeg;

    @FXML
    private TextField nomeNegzio;

    @FXML
    private TextField mailNeg;

    @FXML
    private CheckBox typeCiboNeg;

    @FXML
    private CheckBox typeVestNeg;

    @FXML
    private TextField nomeNeg;

    @FXML
    private TextField cognomeNeg;

    @FXML
    private Button registraNegozio;

    @FXML
    private TextField codiceFiscNeg;

    @FXML
    private Button backButtonNeg;

    @FXML
    private PasswordField passwordNeg;

    @FXML
    private PasswordField confermaPassNeg;

    @FXML
    private Text passwordMatch;

    @FXML
    void backButtonNegPressed(ActionEvent event) {
    	
    	
    	reg.backButtonNegPressed(backButtonNeg.getScene().getWindow());
    }

    @FXML
    void registraNegozioPressed(ActionEvent event) {
    	int i = checker();
    	if ( i == -1) {
    		System.out.println("errore fratello");
    	}else {
    	reg.registraNegozioPressed(registraNegozio.getScene().getWindow(), tipo , nomeNeg.getText(), passwordNeg.getText(), viaNeg.getText() + " "+civicoNeg.getText() , telNeg.getText(), mailNeg.getText(), cittaResNeg.getText());
    	
    	}
    }
    
   public int checker() {
	   
	   
    	
    	//Controlla che non ci siano campi lasciati vuoti
    	for (int i = 0; i < textFields.length; i++) {
			if (textFields[i].getText().isEmpty()) {
				passwordMatch.setText("Alcuni campi sono vuoti");
				passwordMatch.setVisible(true);
				return -1;
			}
		//	else if (type.isSelected() || type2.isSelected()) {
			else if(typeCiboNeg.isSelected()) {
				 tipo = 1;
	    		return 0; //Almeno uno dei tipi deve essere selezionato
	    		
	    		
			}else if(typeVestNeg.isSelected()) {
				tipo = 2;
				
				return 1; //Almeno uno dei tipi deve essere selezionato
			}else {
				passwordMatch.setText("Alcuni campi sono vuoti 2");
				passwordMatch.setVisible(true);
				return -1;
			}
  
		}
    	
    	
    	//Valida che i campi password e conferma password siano uguali
    	
    	if (passwordNeg.getText().equals(confermaPassNeg.getText())) {
    		passwordMatch.setVisible(true);
    		System.out.println("Password confirmed");
    		return 0;
    	}
    	else {
    		passwordMatch.setText("Le password non corrispondono");
    		passwordMatch.setVisible(true);
    		return -1;
    	}
    }
    

	public void initialize(URL location, ResourceBundle resources) {
		
		passwordMatch.setVisible(false);
		textFields = new TextField[] {cittaResNeg,viaNeg,civicoNeg,telNeg,nomeNegzio,mailNeg,nomeNeg,cognomeNeg};
		
		
	}
    

}
