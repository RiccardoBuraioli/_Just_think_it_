package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import connector.Connector;
import entity.Email_entity;

public class Email_dao {
	Connector connector;
	private static final String SUCCESS = "Voce modificata con successo!";
    private static final String FAILED = "Operazione non riuscita.";
    private List<Email_entity> email_list;

	
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
        	  pstmt.setString(1, email.getId_mittente() );
        	  pstmt.setString(2, email.getId_destinatario());
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
	
	
	
	
	public List<Email_entity> visualizza_email(String id_utente){
	
	 	String sql = "call visuallizza_email(?) ";
	   	int i = 0;
		ResultSet res = null;
		try (Connection conn = connector.getConnection();
	            PreparedStatement stmt = conn.prepareStatement(sql)) {
	
	           res = stmt.executeQuery();
	           
	
	           
	           while (res.next()) {
	        	   email_list.add( new Email_entity(res.getInt("id_email"), res.getString("messaggio"), res.getString("oggetto")));
	        	   i++;
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
	
		
		
		
		
		return email_list;
		
		
		
	}
	
	
	
}
