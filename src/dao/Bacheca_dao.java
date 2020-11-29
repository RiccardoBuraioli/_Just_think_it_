package dao;

import connector.Connector;
import entity.Necessità;
import entity.Orario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Bacheca_dao {
	Connector connector;
	
	List<Necessità> necessità;
	
	public Bacheca_dao() {
		
		
    	connector = new Connector("jdbc:mysql://127.0.0.1:3306/Justthinkit", "root", "password");
    	necessità = new ArrayList();
	}
	
	
	
	public List<Necessità> visualizza_necessità(int id_caritas) {
		
	   	String sql = "call visualizza_necessità(?) ";
	   	int i = 0;
		ResultSet res = null;
		try (Connection conn = connector.getConnection();
	            PreparedStatement stmt = conn.prepareStatement(sql)) {
				stmt.setInt(1, id_caritas );
	            res = stmt.executeQuery();
	
	           while (res.next()) {
	        	   necessità.add(new Necessità(res.getString("tipologia"),res.getString("richiesta"), res.getString("urgenza")));
	        	  
	           }
	       } catch (SQLException ex) {
	           System.out.println(ex.getMessage());
	       } finally {
	           try {
	               if (res != null) res.close();
	           } catch (SQLException e) {
	               System.out.println(e.getMessage());
	           }
	       }
		
	return necessità;
		
		
		
	}
	
	
	
}
