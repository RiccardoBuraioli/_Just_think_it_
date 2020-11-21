package entity;

public class partecipa_turno {
	private int codice_volontario;
	private int codice_turno;
	private int codice_caritas; 
	
	
	public partecipa_turno(int cod_v, int cod_t, int cod_c) {
		this.codice_caritas = cod_c;
		this.codice_turno = cod_t;
		this.codice_volontario= cod_v;
	}
	
	
	
	public int getCodice_volontario() {
		return codice_volontario;
	}
	public void setCodice_volontario(int codice_volontario) {
		this.codice_volontario = codice_volontario;
	}
	public int getCodice_Turno() {
		return codice_turno;
	}
	public void setCodice_Turno(int codice_Turno) {
		this.codice_turno = codice_Turno;
	}
	public int getCodice_caritas() {
		return codice_caritas;
	}
	public void setCodice_caritas(int codice_caritas) {
		this.codice_caritas = codice_caritas;
	}
	
	
	
	
}
