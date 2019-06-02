package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Read {
	
	public static Usuario buscarUsuario(Usuario usuario) {
		try {
			Conexao conexao = new Conexao();
			
			String comando = "SELECT NOME, SENHA FROM USUARIOS WHERE NOME = ?";
			
			PreparedStatement preparedStatement = conexao.getConnection().prepareStatement(comando);
			
			preparedStatement.setString(1, usuario.getNome());
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			Usuario user = new Usuario(resultSet.getString("NOME"), resultSet.getString("SENHA"));
			
			preparedStatement.close();
			Destrutor.destroyer(conexao);
			
			return user;
		
		}catch (Exception e) {
			return null;
		}
	}
	
	public static Tema buscarTema(Tema tema) {
		try {
			Conexao conexao = new Conexao();
			
			String comando = "SELECT NOME FROM TEMAS WHERE NOME = ?";
			
			PreparedStatement preparedStatement = conexao.getConnection().prepareStatement(comando);
			
			preparedStatement.setString(1, tema.getNome());
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			Tema tem = new Tema(resultSet.getString("NOME"));
			
			preparedStatement.close();
			Destrutor.destroyer(conexao);
			
			return tem;
			
		}catch (Exception e) {
			return null;
		}
	}
	
	public static Item buscarItem(Item item) {
		try {
			Conexao conexao = new Conexao();
			
			String comando = "SELECT NOME, QUANTIDADE FROM ITENS WHERE NOME = ?";
			
			PreparedStatement preparedStatement = conexao.getConnection().prepareStatement(comando);
			
			preparedStatement.setString(1, item.getNome());
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			Item newItem = new Item(resultSet.getString("NOME"), resultSet.getInt("QUANTIDADE"));
			
			preparedStatement.close();
			Destrutor.destroyer(conexao);
			
			return newItem;
			
		}catch (Exception e) {
			return null;
		}
	}
	
	public static Festa buscarFesta(Festa festa) {
		try {
			Conexao conexao = new Conexao();
			
			String comando = "SELECT ID, TEMA, CLIENTE, ENDERECO, DATA, VALOR, HORA_INI, HORA_FIN FROM FESTAS WHERE TEMA = ?";
			
			PreparedStatement preparedStatement = conexao.getConnection().prepareStatement(comando);
			
			preparedStatement.setString(1, festa.getTema());
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			Festa newFesta = new Festa(resultSet.getInt("ID"),
					resultSet.getString("TEMA"), 
					resultSet.getString("ENDERECO"), 
					resultSet.getString("CLIENTE"),
					resultSet.getString("DATA"), 
					resultSet.getDouble("VALOR"), 
					resultSet.getString("HORA_INI"), 
					resultSet.getString("HORA_FIN"));
			
			preparedStatement.close();
			Destrutor.destroyer(conexao);
			
			return newFesta;
		}catch (Exception e) {
			return null;
		}
	}
	
	public static Cliente buscarCliente(Cliente cliente) throws SQLException {
		
		Conexao conexao = new Conexao();
		
		String comando = "SELECT NOME, TELEFONE, ANTIGO FROM ITENS WHERE NOME = ?";
		
		PreparedStatement preparedStatement = conexao.getConnection().prepareStatement(comando);
		
		preparedStatement.setString(1, cliente.getNome());
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		Cliente newCliente = new Cliente(resultSet.getString("NOME"), resultSet.getString("TELEFONE"), resultSet.getBoolean("ANTIGO"));
		
		preparedStatement.close();
		Destrutor.destroyer(conexao);
		
		return newCliente;
	}
	
	public static List<Festa> festas() throws SQLException {
		
		Conexao conexao = new Conexao();
		
		List<Festa> festas = new ArrayList<Festa>();
		
		String comando = "SELECT * FROM FESTAS";
		
		PreparedStatement preparedStatement = conexao.getConnection().prepareStatement(comando);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			
			Festa festa = new Festa(resultSet.getInt("ID"),
					resultSet.getString("TEMA"), 
					resultSet.getString("ENDERECO"),
					resultSet.getString("CLIENTE"),
					resultSet.getString("DATA"), 
					resultSet.getDouble("VALOR"), 
					resultSet.getString("HORA_INI"), 
					resultSet.getString("HORA_FIN"));
			
			festas.add(festa);
		}
		
		
		preparedStatement.close();
		Destrutor.destroyer(conexao);
		
		return festas;
		
	}
}
