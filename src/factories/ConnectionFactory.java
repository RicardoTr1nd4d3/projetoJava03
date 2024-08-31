package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public static Connection getConnection() {
		
		Connection connection = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bd_aula02R","postgres","coti");
			
		}
		catch(Exception e){
			System.out.println("Falha ao abrir conexao com o banco de dados !");
			System.out.println(e.getMessage());
		}
		
		return connection;
		
	}

}
