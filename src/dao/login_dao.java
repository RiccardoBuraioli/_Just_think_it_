package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.Connector;

public class login_dao {
	final Connector connector;
    public int tableUser;
	
	  public int getTableUser() {
	        return tableUser;
	    }
	  
	  public void setTableUser(int a) {
		  this.tableUser = a;
	  }
	
	
	public login_dao() {
		
		this.connector = new Connector("jdbc:mysql://127.0.0.1:3306/Justthinkit", "root", "password");
	}
	
	
	
	  public int checkLogin(String email, String password) {
	        String sqlUser = "SELECT Codice FROM utenti WHERE Email = ? AND Password = ?";
	      
	        ResultSet res = null;
	        int returnePriv = 0;

	        //Cerca nei volontari
	        try (Connection conn = connector.getConnection();
	             PreparedStatement stmt = conn.prepareStatement(sqlUser)) {

	            stmt.setString(1, email);
	            stmt.setString(2, password);
	            res = stmt.executeQuery();

	            while (res.next()) {
	                int priv = res.getInt("Codice");
	                returnePriv = priv;
	              
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
       	 if( returnePriv == 3) {
 			setTableUser(3);
 			
 		}
 		
 	 else if( returnePriv == 2) {
 		setTableUser(2);
 		
 	}
 	
 	
  else if( returnePriv == 1) {
 	setTableUser(1);
 
 }
				return returnePriv;
	    }


	 
	    public int returnID(String email, int table) {
	    	
	    	String sql;
	    	String resID = null;
	    	int ID;
	    	
	       	sql = "SELECT id_utente FROM utenti WHERE Email = ?";
	    
	    	ResultSet res = null;
	    	try (Connection conn = connector.getConnection();
	                PreparedStatement stmt = conn.prepareStatement(sql)) {

	               stmt.setString(1, email);
	               res = stmt.executeQuery();

	               while (res.next()) {
	            	   resID = res.getString("id_utente");
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
