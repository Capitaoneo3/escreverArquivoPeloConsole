package br.com.zaffari.Biblioteca_v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	
	 public static void createNewTable() {
	        // SQLite connection string
	        String url = "jdbc:sqlite:C:\\\\Dev\\\\biblioteca_digital\\\\DB.Browser.for.SQLite-3.12.2-win64\\\\DB Browser for SQLite";
	        
	        // SQL instrução para criar uma nova tabela
	        String sql = "CREATE TABLE IF NOT EXISTS Livros (\n"
	                + "	id integer PRIMARY KEY,\n"
	                + "	Titulo text NOT NULL,\n"
	                + " CodigoISBN text NOT NULL,\n"
	                + " Preco integer NOT NULL,\n"
	                + " AnoLancamento integer NOT NULL,\n"
	                + " Categoria text NOT NULL,\n"
	                + "	capacity real\n"
	                + ");";
	        
	        try (Connection conn = DriverManager.getConnection(url);
	                Statement stmt = conn.createStatement()) {
	            // cria uma nova tabela
	            stmt.execute(sql);
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        createNewTable();
	    }
	
}
