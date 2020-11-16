package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Prenota_turno_controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private ChoiceBox<?> Turni;

    @FXML
    private ChoiceBox<?> ora_inizio;

    @FXML
    private ChoiceBox<?> ora_fine;

    @FXML
    private TextField CV;

    @FXML
    private Button indietro;

    @FXML
    private Button prenota;

    @FXML
    void indietro(ActionEvent event) {

    }

    @FXML
    void prenota_turno(ActionEvent event) {

    	
    	
    	
    }

    @FXML
    void initialize() {
        assert Turni != null : "fx:id=\"Turni\" was not injected: check your FXML file 'Prenota_turno_volontariato.fxml'.";
        assert ora_inizio != null : "fx:id=\"ora_inizio\" was not injected: check your FXML file 'Prenota_turno_volontariato.fxml'.";
        assert ora_fine != null : "fx:id=\"ora_fine\" was not injected: check your FXML file 'Prenota_turno_volontariato.fxml'.";
        assert CV != null : "fx:id=\"CV\" was not injected: check your FXML file 'Prenota_turno_volontariato.fxml'.";
        assert indietro != null : "fx:id=\"indietro\" was not injected: check your FXML file 'Prenota_turno_volontariato.fxml'.";
        assert prenota != null : "fx:id=\"prenota\" was not injected: check your FXML file 'Prenota_turno_volontariato.fxml'.";

    }
}
