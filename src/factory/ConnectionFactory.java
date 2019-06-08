package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() {
        try {
        	String connectionUrl = System.getenv("CONECTION_URL_DATABASE");
        	String usuario = System.getenv("DATABASE_USER");
        	String senha = System.getenv("DATABASE_PASSWORD");
            Connection conexao = 
                    DriverManager.getConnection(connectionUrl, usuario, senha);

            return conexao;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
