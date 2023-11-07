package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import utils.Colors;

public class DatabaseConnection {

	private static final String url = "jdbc:mysql://localhost:3306/agencia_kaioken_web_java";

	private static final String user = "root";

	private static final String password = "2604982020";

	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver encontrado!");

		} catch (ClassNotFoundException e) {
			System.out.println("Driver não encontrado! Mensagem: " + e.getMessage());
		}

		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println(Colors.GREEN + "Conectado com sucesso!" + Colors.RESET);
			return connection;
		} catch (SQLException e) {
			System.out.println(Colors.RED +"Nao foi possivel conectar ao banco! Mensagem: "+ Colors.RESET + e.getMessage());
			return null;
		}

	}
}