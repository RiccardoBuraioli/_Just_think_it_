package bean;
import java.util.List;

import controller.GestioneTurniCaritas;
import entity.CaritasUser;
import entity.EventTab;
import entity.TurnoTab;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
public class Gestisci_Turni_Boundary {

	
		
	  
		@FXML
		private TableView<TurnoTab> tab;
		
		@FXML
		private Button cancTurn;

		@FXML
		private Button modTurn;

		@FXML
		private Button creaTurn;

		@FXML
	    private TableColumn<TurnoTab, String> giorno;

	    @FXML
	    private TableColumn<TurnoTab, String> orario;

	    @FXML
	    private TableColumn<TurnoTab, Integer> numParte;

	    @FXML
	    private TableColumn<TurnoTab, String> note;
	    
	    @FXML
	    private Button richieste;
    
	    @FXML
	    private Button back;

	    private List<TurnoTab> listT;
	    
		private int idCaritas;

	    private GestioneTurniCaritas gestTurn;
	    
	    public Gestisci_Turni_Boundary() {
	    	gestTurn = new GestioneTurniCaritas();
	    	
	    }
	    
	    @FXML
	    void CancellaTurno(ActionEvent event) {

	    }

	    @FXML
	    void CreaTurno(ActionEvent event) {

	    }

	    @FXML
	    void ModificaTurno(ActionEvent event) {

	    }

	    @FXML
	    void backPressed(ActionEvent event) {

	    }

	    @FXML
	    void turnSelected(MouseEvent event) {

	    }

		public void set_currentUser(CaritasUser currentUser) {
			// TODO Auto-generated method stub
			
		}

		public void loadFormBoundary(int id) {
			this.idCaritas = id;
			this.listT = gestTurn.carica_turni(this.idCaritas);
		  //	System.out.println(listEv.get(0).getNomeEvento());

			ObservableList<TurnoTab> data = FXCollections.observableArrayList(listT);
			giorno.setCellValueFactory(new PropertyValueFactory<>("giorno"));
			orario.setCellValueFactory(new PropertyValueFactory<>("oraInizio" + "/"+ "oraFine"));
			note.setCellValueFactory(new PropertyValueFactory<>("note"));
			numParte.setCellValueFactory(new PropertyValueFactory<>("partecipanti"));

			tab.setItems(data);
		
		}


	}


