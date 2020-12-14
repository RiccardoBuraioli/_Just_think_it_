package entity;

import javafx.beans.property.SimpleStringProperty;

public class NecessitÓ {
	private SimpleStringProperty Tipologia;
	private SimpleStringProperty Descrizione;
	private SimpleStringProperty Urgenza;

	
	public NecessitÓ(String tipo, String descr, String urg) {
		this.Descrizione= new SimpleStringProperty(descr);
		this.Tipologia = new SimpleStringProperty(tipo);
		this.Urgenza = new SimpleStringProperty(urg);
	}


	public NecessitÓ() {
		
	}


	public String getTipologia() {
		return Tipologia.get();
	}


	public void setTipologia(String tipologia) {
		Tipologia.set(tipologia);
	}


	public String getDescrizione() {
		return Descrizione.get();
	}


	public void setDescrizione(String descrizione) {
		Descrizione.set(descrizione);
	}


	public String getUrgenza() {
		return Urgenza.get();
	}


	public void setUrgenza(String urgenza) {
		this.Urgenza.set(urgenza);
	}
}
