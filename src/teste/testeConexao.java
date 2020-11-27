package teste;

import java.sql.Connection;
import java.sql.SQLException;

import util.Conexao;

public class testeConexao{
	
	public static void main(String[] args) {
		try {
			Connection cx = Conexao.getConnectionPostgres();
			
			if(cx != null) {
				System.out.println("CONECTOU");
			}else {
				System.out.println("CONECTOU");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}