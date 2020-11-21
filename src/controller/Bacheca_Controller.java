package controller;


import java.util.List;

import dao.Bacheca_dao;
import entity.Necessità;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class Bacheca_Controller  {


	private List<Necessità> necessità;
	private Bacheca_dao bacheca;

	@FXML
	private Text nomeCaritas;

	@FXML
	private TextArea cibo;

	@FXML
	private TextArea varie;

	@FXML
	private TextArea vestiti;

	@FXML
	void crea_donazione(ActionEvent event) {

	}

	@FXML
	void crea_email(ActionEvent event) {

	}

	@FXML
	void indietro(ActionEvent event) {

	}

	@FXML
	void initialize() {

		bacheca = new Bacheca_dao();
		
	}


	
	
	public void loadForm(int id_car) {
		necessità = bacheca.visualizza_necessità(id_car);

		for (int i = 0; i < necessità.size(); i++) {
			Necessità tmp = necessità.get(i);
			
			switch (tmp.getTipologia()) {
				case "Vestiti":
					vestiti.setText(tmp.getDescrizione());
					break;
	
				case "Cibo":
					cibo.setText(tmp.getDescrizione());
	
				case "Varie":
					varie.setText(tmp.getDescrizione());
					break;
	
				default:
					break;

			}

		}

	}
}
