package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	 private static Connection conexao;

	 
	    private static Connection conectar() {
	        try {
	            Class.forName("org.postgresql.Driver");
	            return DriverManager.getConnection("jdbc:postgresql://localhost/SYSWork", "postgres", "sap@123");
	        } catch (ClassNotFoundException e) {
	            System.out.println("Driver n�o encontrado no CLASSPATH");
	            return null;
	        } catch (SQLException e) {
	            System.out.println("Erro na conexao com o banco verifique a url, o usu�rio e a senha");
	            return null;
	        }
	       
	    }
	 
	    public static Connection getConexao() {
	        try {
	            if (conexao == null || conexao.isClosed()) {
	                conexao = conectar();
	            }
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            e.printStackTrace();
	        }
	       
	        return conexao;
	    }

}
