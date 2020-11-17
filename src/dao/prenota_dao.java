package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controller.Connector;
import entity.Turno;

public class Prenota_dao {

    private final Connector connector;
    private static final String SUCCESS = "Voce modificata con successo!";
    private static final String FAILED = "Operazione non riuscita.";
    private int id_turno;
	
	
	
	public Prenota_dao() {
		
        this.connector =  new Connector("jdbc:mysql://127.0.0.1:3306/Justthinkit", "root", "password");;

	}
	
	
	
	
	public Turno partecipazione_turno(Turno turno) {
	
    	int rowAffected;
   		ResultSet rs = null;
   		id_turno = trova_turno(turno);
      	//Registra Caritas
  	    String sql = "call prenota_turno(?,?,?)";

          try (Connection conn = connector.getConnection();
               PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
        	  pstmt.setInt(1, turno.getCaritas());
        	  pstmt.setInt(2, turno.getUtente());
        	  pstmt.setInt(3, id_turno);
        	
           
          
              rowAffected = pstmt.executeUpdate();

              if (rowAffected == 1) {
                  System.out.println(SUCCESS);
              } else System.out.println(FAILED);


          } catch (SQLException ex) {
              System.out.println((ex.getMessage()));
          }
		    	
    	
    	return turno;
    	
	}
	
	
	public int trova_turno(Turno turno ) {
		String sql;
		String resID = null;
		int ID;
		
	   	sql = "call trova_turno(?.?.?)";
	
		ResultSet res = null;
		try (Connection conn = connector.getConnection();
	            PreparedStatement stmt = conn.prepareStatement(sql)) {
	
	           stmt.setString(1, turno.getGiorno());
	           stmt.setString(2, turno.getOrai());
	           stmt.setString(3, turno.getOraf());
	           res = stmt.executeQuery();
	
	           while (res.next()) {
	        	   resID = res.getString("codice_turno");
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
		
		ID = Integer.parseInt(resID);
		return ID;
		
	}
	
}
