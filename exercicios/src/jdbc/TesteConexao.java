package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
public static void main(String[] args) throws SQLException {
	
	final String url = "jdbc:mysql://localhost?verifyCertificate=false&useSSL=true";
	final String usuario = "root";
	final String senha = "swordfish";
	
	Connection conexao = DriverManager.getConnection(url,usuario,senha);
	
	System.out.println("Conexao efetuada com sucesso!");
	
	conexao.close();
}
}
