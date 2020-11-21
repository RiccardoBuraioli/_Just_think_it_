package entity;

public class Necessità {
	private String Tipologia;
	private String Descrizione;
	private String urgenza;

	
	public Necessità(String tipo, String descr, String urg) {
		this.Descrizione= descr;
		this.Tipologia = tipo;
		this.urgenza = urg;
	}


	public Necessità() {
		
	}


	public String getTipologia() {
		return Tipologia;
	}


	public void setTipologia(String tipologia) {
		Tipologia = tipologia;
	}


	public String getDescrizione() {
		return Descrizione;
	}


	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}


	public String getUrgenza() {
		return urgenza;
	}


	public void setUrgenza(String urgenza) {
		this.urgenza = urgenza;
	}
}
