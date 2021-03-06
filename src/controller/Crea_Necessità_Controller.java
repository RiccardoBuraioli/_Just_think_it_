package controller;

import dao.Bacheca_dao;
import entity.NecessitÓ;

public class Crea_NecessitÓ_Controller {
	private Bacheca_dao crea_n;
	private NecessitÓ necessitÓ;
	private int id_caritas;
	
	public Crea_NecessitÓ_Controller() {
		crea_n = new Bacheca_dao();
		
	}
	
	public int crea_necessitÓ(String tipo, String urg, String desc) {
		
		necessitÓ = new NecessitÓ(tipo, desc, urg);
		
		
		crea_n.crea_necessitÓ(necessitÓ, id_caritas);
		return 0;
		
	}
	
	
	
	public void inizializza(int cod_car) {
		this.id_caritas = cod_car;
	}
	
}
