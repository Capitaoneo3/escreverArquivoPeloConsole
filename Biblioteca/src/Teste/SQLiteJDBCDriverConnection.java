package Teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteJDBCDriverConnection {

	
	
	private static void connect() {
        try (Connection connection = DriverManager.getConnection("C:\\Dev\\biblioteca_digital\\base_dados")) {

            System.out.println("Conexão realizada !!!!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        connect();
    }
}
