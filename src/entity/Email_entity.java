package entity;

public class Email_entity {
	private String email_mittente;
	private String email_destinatario;
	private String messaggio;
	private String oggetto;
	
	
	public Email_entity(String id_c, String id_u, String mes, String ogg) {
		this.email_mittente = id_c;
		this.email_destinatario = id_u;
		this.messaggio = mes;
		this.oggetto = ogg;
	}


	public String getId_caritas() {
		return email_mittente;
	}


	public void setId_caritas(String id_caritas) {
		this.email_mittente = id_caritas;
	}


	public String getId_utente() {
		return email_destinatario;
	}


	public void setId_utente(String id_utente) {
		this.email_destinatario = id_utente;
	}


	public String getMessaggio() {
		return messaggio;
	}


	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}


	public String getOggetto() {
		return oggetto;
	}


	public void setOggetto(String oggetto) {
		this.oggetto = oggetto;
	}

}
