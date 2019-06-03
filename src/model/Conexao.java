package model;

import java.sql.*;

public class Conexao {
	
	private Connection connection;
	private String url;
	private Statement statement;
	
	public Conexao() {
		
		try{
			url = "jdbc:sqlite:c:Soft-Controll-FES/db/banco.db";
			
			Class.forName("org.sqlite.JDBC");
			
			connection = DriverManager.getConnection(url);
			
			statement = connection.createStatement();
			
			Create.criarTabelas(statement);
			
			System.out.println("connectado");
		} 
		
		catch (SQLException e){System.out.println("erro");} 
		
		catch (ClassNotFoundException e) {e.printStackTrace();}
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
