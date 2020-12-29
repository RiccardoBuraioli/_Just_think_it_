package controller;

import java.util.List;

import dao.Prenota_dao;
import entity.TurnoTab;

public class GestioneTurniCaritas {
	
	private Prenota_dao turni_dao;
	private List<TurnoTab> list;
	
	public GestioneTurniCaritas() {
		turni_dao = new Prenota_dao();
	}
	
	
	
	public List<TurnoTab> carica_turni(int idCaritas) {

		this.list = turni_dao.visualizzaTurni(idCaritas);
		
		
		return list;
	}

}
