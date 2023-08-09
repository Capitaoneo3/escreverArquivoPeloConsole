package br.com.zaffari.Biblioteca_v1;

import java.sql.Connection;  
import java.sql.DatabaseMetaData;  
import java.sql.DriverManager;  
import java.sql.SQLException;

public class Create {

	
	 public static void createNewDatabase(String fileName) {  
		   
	        String url = "jdbc:sqlite:C:\\Dev\\biblioteca_digital\\DB.Browser.for.SQLite-3.12.2-win64\\DB Browser for SQLite" + fileName;  
	        
	        
	        try {  
	            Connection conn = DriverManager.getConnection(url);  
	            if (conn != null) {  
	            	System.out.println("aqui");
	                DatabaseMetaData meta = conn.getMetaData();  
	                System.out.println("The driver name is " + meta.getDriverName());  
	                System.out.println("A new database has been created.");  
	            }  
	   
	        } catch (SQLException e) {  
	            System.out.println(e.getMessage());  
	        }  
	    }  
	  
	    public static void main(String[] args) {  
	        createNewDatabase("biblioteca.db");  
	    }  
	
}
