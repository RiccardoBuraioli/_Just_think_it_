package entity;

public class Turno {
	private int id_caritas, id_utente;
	private String ora_inizio, ora_fine, giorno;



	public Turno() {
		this.ora_inizio ="";
		this.ora_fine ="";
		this.giorno ="";
		this.id_caritas = 0;
		this.id_utente = 0;
	}
	
	
	
	public String getOrai() {
		return this.ora_inizio;
	}
	
	
	public String getOraf() {
		return this.ora_fine;
	}
	
	
	public String getGiorno() {
		return this.giorno;
	}
	
	
	public int getCaritas() {
		return this.id_caritas;
	}
	
	public int getUtente() {
		return this.id_utente;
	
	}
	
	
	public void setUtente(int id_ute) {
		this.id_utente = id_ute;
	}
	
	
	public void setCaritas(int id_ca) {
		this.id_caritas = id_ca;
	}
	
	
	public void setOrai(String orai) {
		this.ora_inizio = orai;
		
	}
	public void setOraf(String oraf) {
		this.ora_fine = oraf;
	}
	
	public void setGiorno(String giorno) {
		this.giorno = giorno;
	}
}
