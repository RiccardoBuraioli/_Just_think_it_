package controller;


import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import dao.Evento_dao;
import dao.Prenota_dao;
import entity.Orario;
import entity.Turno;
import entity.partecipa_turno;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Prenota_turno_controller {

	private int id_utente;

	private int id_caritas;
	
	private String[] giorni;
	
	private Orario[] ora;

	private Prenota_dao check_turni_possibili;
	
	private TextField textFields[];
	
	private partecipa_turno partecipazione;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<String> Turni;

    @FXML
    private ChoiceBox<String> cb_ora_inizio;

    @FXML
    private ChoiceBox<String> cb_ora_fine;

    @FXML
    private TextField CV;

    @FXML
    private Button indietro;

    @FXML
    private Button prenota;

	private List<Orario> oraArrayList;


    @FXML
    void indietro(ActionEvent event) {

    }

    
    
    public Prenota_turno_controller() {}








public boolean checker() {
    	
    	 
		//Controlla che non ci siano campi lasciati vuoti
    	for (int i = 0; i < textFields.length; i++) {
			if (textFields[i].getText().isEmpty()) {
				
				return false;
			}
	
		}
		return true;
    	
  }
    
    
    
    
    @FXML
    boolean prenota_turno(ActionEvent event) {
	boolean error;
    	
    	error = checker();
    	//partecipazione = new partecipa_turno(id_utente, id_turno, id_caritas);
    	
    	check_turni_possibili.partecipazione_turno(partecipazione);
    	
    	
   
    	
    	
    	
    	
    	
    	return error;

  

    }
    
    
    
  public void setData(int id_car, int id_ute) {
  	this.id_caritas = id_car;
  	this.id_utente = id_ute;
  }
  

    @FXML
    void initialize() {
    	this.giorni = new String[8];
	
    	
    	int a = 0;
    	check_turni_possibili = new Prenota_dao();
    	giorni = check_turni_possibili.visualizza_giorni();
   
    	
    	for(int i=0; i<8; i++) {
    		Turni.getItems().add(giorni[i]);
    	}
    	
    	
    	oraArrayList = check_turni_possibili.visualizza_orario2();
    	//ora = (Orario[]) oraArrayList.toArray();
    	
    	int i = 0;
    	while(i<oraArrayList.size()) {
    
	    	cb_ora_inizio.getItems().add(oraArrayList.get(i).getOra_fine());
	    	
	    	cb_ora_fine.getItems().add(oraArrayList.get(i).getOra_inizio());
	    	
	    	i++;
	    	
    	}
    	
    	
    	
      /*  assert Turni != null : "fx:id=\"Turni\" was not injected: check your FXML file 'Prenota_turno_volontariato.fxml'.";
        assert ora_inizio != null : "fx:id=\"ora_inizio\" was not injected: check your FXML file 'Prenota_turno_volontariato.fxml'.";
        assert ora_fine != null : "fx:id=\"ora_fine\" was not injected: check your FXML file 'Prenota_turno_volontariato.fxml'.";
        assert CV != null : "fx:id=\"CV\" was not injected: check your FXML file 'Prenota_turno_volontariato.fxml'.";
        assert indietro != null : "fx:id=\"indietro\" was not injected: check your FXML file 'Prenota_turno_volontariato.fxml'.";
        assert prenota != null : "fx:id=\"prenota\" was not injected: check your FXML file 'Prenota_turno_volontariato.fxml'.";
*/
    }
}




