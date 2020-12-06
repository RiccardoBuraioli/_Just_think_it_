package bean;

import controller.Registrazione_Menu_Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Registrazione_menu_Boundary {
	
	
	private Registrazione_Menu_Controller reg;

    @FXML
    private Button caritasButton;

    @FXML
    private Button volontarioButton;

    @FXML
    private Button negozioButton;

    @FXML
    private Button backButton;

    @FXML
    private Button dettagliCaritas;

    @FXML
    private Button dettagliVolontario;

    @FXML
    private Button dettagliNegozio;

    @FXML
    void backButtonPressed(ActionEvent event) {
    	reg.backButtonPressed(backButton.getScene().getWindow());
    }

    @FXML
    void caritasButtonPressed(ActionEvent event) {
    	reg.caritasButtonPressed(caritasButton.getScene().getWindow());
    }

    @FXML
    void dettagliCaritasPressed(ActionEvent event) {
    	reg.dettagliCaritasPressed(dettagliCaritas.getScene().getWindow());
    }

    @FXML
    void dettagliNegozioPressed(ActionEvent event) {
    	reg.dettagliNegozioPressed(dettagliNegozio.getScene().getWindow());
    }

    @FXML
    void dettagliVolontarioPressed(ActionEvent event) {
    	reg.dettagliVolontarioPressed(dettagliVolontario.getScene().getWindow());
    }

    @FXML
    void negozioButtonPressed(ActionEvent event) {
    	reg.negozioButtonPressed(negozioButton.getScene().getWindow());
    }

    @FXML
    void volontarioButtonPressed(ActionEvent event) {
    	reg.volontarioButtonPressed(volontarioButton.getScene().getWindow());
    }
    
    public Registrazione_menu_Boundary() {
    	 reg = new Registrazione_Menu_Controller();
    }
    

}
