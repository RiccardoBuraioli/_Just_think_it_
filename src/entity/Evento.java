package entity;

import com.sothawo.mapjfx.Coordinate;

public class Evento {
	
	String NomeEvento;
	String TipoEvento;
	String NoteEvento;
	float PrezzoEvento;
	int id_negozio;
	String coord;

	
	
	public Evento(String NomeEvento,String TipoEvento,String NoteEvento,float PrezzoEvento,int id_negozio,String coord) {
		
		this.NomeEvento = NomeEvento;
		this.TipoEvento = TipoEvento;
		this.NomeEvento = NomeEvento;
		this.PrezzoEvento = PrezzoEvento;
		this.id_negozio = id_negozio;
		this.coord = coord;
	}
	
	
	
	
	public String getNome() {
		return this.NomeEvento;
	}
	public String getTipo() {
		return this.TipoEvento;
	}
	public String getNote() {
		return this.NoteEvento;
	}
	
	public float getPrezzo() {
		return this.PrezzoEvento;
	}
	public int getNeg() {
		return this.id_negozio;
	}
	public String getCoord() {
		return this.coord;
	}
	
	
	public void setCoord(String coordinate) {
		 this.coord = coordinate;
	}
}
