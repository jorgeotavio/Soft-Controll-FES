package model;

import java.sql.*;

public class Conexao {
	
	private Connection connection;
	private String url;
	private Statement statement;
	
	public Conexao() {
		try{
			url = "jdbc:sqlite:d:/GitHub/Soft-Controll-FES/db/banco.db";
			
			Class.forName("org.sqlite.JDBC");
			
			connection = DriverManager.getConnection(url);
			
			statement = connection.createStatement();
			
			CriarTabelas.criarTabelas(statement);
			
			System.out.println("connectado");
		} 
		
		catch (SQLException e){System.out.println("erro");} 
		
		catch (ClassNotFoundException e) {e.printStackTrace();}
	}
	
	public static boolean addUsuario(Usuario usuario) throws SQLException {
	        
	    	Conexao conexao = new Conexao();
	    	
	        PreparedStatement preparedStatement = conexao.getConnection().prepareStatement("INSERT INTO USUARIOS (NOME, SENHA)" + " VALUES (?,?)");
	        
	        preparedStatement.setString(1, usuario.getNome());
	        preparedStatement.setString(2, usuario.getSenha());
	      
	        int registros = preparedStatement.executeUpdate();
	        preparedStatement.close();
	        
	        if (registros == 1)
	            return true; 
	        else 
	            return false; 
		}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Connection getConnection() {
		return connection;
	}
	
	
	
}
