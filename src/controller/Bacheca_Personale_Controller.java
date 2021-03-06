package controller;

import java.util.List;

import dao.Bacheca_dao;
import entity.Bacheca_entity;
import entity.NecessitÓ;

public class Bacheca_Personale_Controller {
	
	private Bacheca_dao bacheca;
	private int id_caritas;
	private Bacheca_entity bacheca_e;
	private List<NecessitÓ> necessitÓ;

	
	
	
	
	
	
	
	public boolean elimina_annuncio(int nece) {
	
		return	bacheca.elimina_necessitÓ(nece); 
		
		
	}
	
	
	
	public List<NecessitÓ> loadForm(int id_car) {
		this.id_caritas = id_car;
		bacheca = new Bacheca_dao();
		bacheca_e = new Bacheca_entity();
		necessitÓ = bacheca.visualizza_necessitÓ(id_car);
		bacheca_e.setNecessitÓ(necessitÓ);
	
		return necessitÓ;
	}
	
}
