package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sothawo.mapjfx.Coordinate;
import com.sothawo.mapjfx.Marker;

import entity.CaritasUser;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import connector.Connector;




public class Cerca_caritas_dao {
	
	 private final Connector connector;
	 
	 public Cerca_caritas_dao(Connector connector) {
		    this.connector = connector;
		}

	 
	
	public Marker[] assegna_marker() {
		
	Marker[] markerCaritas = {null,null,null,null,null,null,null};
	
	 String sql = "Call assegna_marker()";
     ResultSet rs = null;
     int count = 0;

     try (Connection conn = connector.getConnection();
          PreparedStatement pstmt = conn.prepareStatement(sql)) {

        
         rs = pstmt.executeQuery();

         while (rs.next()) {
        	 Coordinate caritas_coordinate = new Coordinate(Double.parseDouble(rs.getString("latitudine")),Double.parseDouble(rs.getString("longitudine")));
        	 markerCaritas[count] = Marker.createProvided(Marker.Provided.RED).setPosition(caritas_coordinate);
        	 
        	 count++;
        	 
         } 

     } catch (SQLException ex) {
         System.out.println(ex.getMessage());
     } finally {
         try {
             if (rs != null) rs.close();
         } catch (SQLException e) {
             System.out.println(e.getMessage());
         }
     } return markerCaritas;
	}
	
	
	public Marker[] assegna_marker_evento() {
		
		Marker[] markerEvento = {null,null,null,null,null,null,null};
		
		 String sql = "Call assegna_marker_evento()";
	     ResultSet rs = null;
	     int count = 0;

	     try (Connection conn = connector.getConnection();
	          PreparedStatement pstmt = conn.prepareStatement(sql)) {

	        
	         rs = pstmt.executeQuery();

	         while (rs.next()) {
	        	 Coordinate evento_coordinate = new Coordinate(Double.parseDouble(rs.getString("latitudine")),Double.parseDouble(rs.getString("longitudine")));
	        	 markerEvento[count] = Marker.createProvided(Marker.Provided.BLUE).setPosition(evento_coordinate);
	        	 
	        	 count++;
	        	 
	         } 

	     } catch (SQLException ex) {
	         System.out.println(ex.getMessage());
	     } finally {
	         try {
	             if (rs != null) rs.close();
	         } catch (SQLException e) {
	             System.out.println(e.getMessage());
	         }
	     } return markerEvento;
		}
	
	
	public Marker[] assegna_marker_donazione() {
		
		Marker[] markerDonazione = {null,null,null,null,null,null,null};
		
		 String sql = "Call assegna_marker_donazione()";
	     ResultSet rs = null;
	     int count = 0;

	     try (Connection conn = connector.getConnection();
	          PreparedStatement pstmt = conn.prepareStatement(sql)) {

	        
	         rs = pstmt.executeQuery();

	         while (rs.next()) {
	        	 Coordinate donazione_coordinate = new Coordinate(Double.parseDouble(rs.getString("latitudine")),Double.parseDouble(rs.getString("longitudine")));
	        	 markerDonazione[count] = Marker.createProvided(Marker.Provided.GREEN).setPosition(donazione_coordinate);
	        	 
	        	 count++;
	        	 
	         } 

	     } catch (SQLException ex) {
	         System.out.println(ex.getMessage());
	     } finally {
	         try {
	             if (rs != null) rs.close();
	         } catch (SQLException e) {
	             System.out.println(e.getMessage());
	         }
	     } return markerDonazione;
		}
}
	


