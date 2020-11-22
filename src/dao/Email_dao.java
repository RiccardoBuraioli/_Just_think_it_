package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controller.Connector;
import entity.Email_entity;

public class Email_dao {
	Connector connector;
	private static final String SUCCESS = "Voce modificata con successo!";
    private static final String FAILED = "Operazione non riuscita.";

	
	public Email_dao() {
    	this.connector = new Connector("jdbc:mysql://127.0.0.1:3306/Justthinkit", "root", "password");
	}
	
	
	public int invia_email(Email_entity email) {

   		int rowAffected;
   		ResultSet rs = null;

      	//Registra Caritas
  	    String sql = "call inserisci_email(?,?,?,?)";

          try (Connection conn = connector.getConnection();
               PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
        	  pstmt.setString(1, email.getId_caritas() );
        	  pstmt.setString(2, email.getId_utente());
        	  pstmt.setString(3, email.getMessaggio());
        	  pstmt.setString(4,email.getOggetto());
        	
          	
          
              rowAffected = pstmt.executeUpdate();

              if (rowAffected == 1) {
                  System.out.println(SUCCESS);
              } else System.out.println(FAILED);


          } catch (SQLException ex) {
              System.out.println((ex.getMessage()));
          }
		return 0;
         
      
		
		
	}
	
	
}
