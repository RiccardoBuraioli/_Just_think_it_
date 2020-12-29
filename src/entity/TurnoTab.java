package entity;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class TurnoTab {
	private SimpleStringProperty giorno;
	private SimpleStringProperty oraInizio;
	private SimpleStringProperty oraFine;
	private SimpleStringProperty note;
	private SimpleIntegerProperty partecipanti;
	
	
	public TurnoTab(String giorno, String orario,String oraFin, String note, int parte) {
		this.giorno = new SimpleStringProperty(giorno);
		this.oraInizio =  new SimpleStringProperty(orario);
		this.oraFine = new SimpleStringProperty(oraFin);
		this.note =  new SimpleStringProperty(note);
		this.partecipanti =  new SimpleIntegerProperty(parte);
	}
	
	
	
	
	public String getGiorno() {
		return giorno.get();
	}
	public void setGiorno(String giorno) {
		this.giorno.set(giorno);
	}
	public String getOrario() {
		return oraInizio.get();
	}
	public void setOrario(String orario) {
		this.oraInizio.set(orario);
	}
	public String getNote() {
		return note.get();
	}
	public void setNote(String note) {
		this.note.set(note);
	}
	public int getPartecipanti() {
		return partecipanti.get();
	}
	public void setPartecipanti(int partecipanti) {
		this.partecipanti.set(partecipanti);
	}




	public String getOraFine() {
		return oraFine.get();
	}




	public void setOraFine(String oraFine) {
		this.oraFine.set(oraFine);
	}
	
	
	
	
	
}
