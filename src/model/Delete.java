package model;

import java.sql.PreparedStatement;

public class Delete {
	
	public static boolean dellUsuario(int id) {
		try {
			Conexao conexao = new Conexao();
			
			String comando = "DELETE FROM FESTAS WHERE ID = ?";
			
			PreparedStatement preparedStatement = conexao.getConnection().prepareStatement(comando);
			
			preparedStatement.setInt(1, id);
			
			preparedStatement.executeUpdate();
			
			preparedStatement.close();
			Destrutor.destroyer(conexao);
			
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	public static boolean dellTema(int id) {
		try {
			Conexao conexao = new Conexao();
			
			String comando = "DELETE FROM TEMAS WHERE ID = ?";
			
			PreparedStatement preparedStatement = conexao.getConnection().prepareStatement(comando);
			
			preparedStatement.setInt(1, id);
			
			preparedStatement.executeUpdate();
			
			preparedStatement.close();
			Destrutor.destroyer(conexao);
			
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	public static boolean dellItema(int id) {
		try {
			Conexao conexao = new Conexao();
			
			String comando = "DELETE FROM ITENS WHERE ID = ?";
			
			PreparedStatement preparedStatement = conexao.getConnection().prepareStatement(comando);
			
			preparedStatement.setInt(1, id);
			
			preparedStatement.executeUpdate();
			
			preparedStatement.close();
			Destrutor.destroyer(conexao);
			
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	public static boolean dellFesta(int id) {
		try {
			Conexao conexao = new Conexao();
			
			String comando = "DELETE FROM FESTAS WHERE ID = ?";
			
			PreparedStatement preparedStatement = conexao.getConnection().prepareStatement(comando);
			
			preparedStatement.setInt(1, id);
			
			preparedStatement.executeUpdate();
			
			preparedStatement.close();
			Destrutor.destroyer(conexao);
			
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	
	public static boolean dellCliente(int id) {
		try {
			Conexao conexao = new Conexao();
			
			String comando = "DELETE FROM CLIENTES WHERE ID = ?";
			
			PreparedStatement preparedStatement = conexao.getConnection().prepareStatement(comando);
			
			preparedStatement.setInt(1, id);
			
			preparedStatement.executeUpdate();
			
			preparedStatement.close();
			Destrutor.destroyer(conexao);
			
			return true;
		}catch (Exception e) {
			return false;
		}
	}
}
