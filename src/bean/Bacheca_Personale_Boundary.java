package bean;

import java.util.List;

import controller.Bacheca_Controller;
import controller.Bacheca_Personale_Controller;
import entity.EventTab;
import entity.Necessità;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Bacheca_Personale_Boundary {
	private List<Necessità> necessità_l;
	private int id_car;
	private Bacheca_Personale_Controller bacheca_controller;

	@FXML
	private TableView<Necessità> bacheca;

	@FXML
	private TableColumn<Necessità, String> tipologia;

	@FXML
	private TableColumn<Necessità, String> descrizione;

	@FXML
	private TableColumn<Necessità, String> urgenza;

	@FXML
	private Button necessità;

	@FXML
	private Button modifica;

	@FXML
	private Button elimina;

	@FXML
	private Button back;

	@FXML
	void backPressed(ActionEvent event) {

	}

	@FXML
	void crea_necessità(ActionEvent event) {

	}

	@FXML
	void elimina_necessità(ActionEvent event) {

	}

	@FXML
	void modifica_necessità(ActionEvent event) {

	}

	public void loadFormBoundary(int id_car) {
		this.id_car = id_car;

		bacheca_controller = new Bacheca_Personale_Controller();
		necessità_l = bacheca_controller.loadForm(id_car);
		ObservableList<Necessità> data = FXCollections.observableArrayList(necessità_l);

		descrizione.setCellValueFactory(new PropertyValueFactory<>("Descrizione"));

		tipologia.setCellValueFactory(new PropertyValueFactory<>("Tipologia"));

		urgenza.setCellValueFactory(new PropertyValueFactory<>("Urgenza"));

		bacheca.setItems(data);

	}

}
