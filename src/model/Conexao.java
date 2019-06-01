package model;

import java.sql.*;

public class Conexao {
	
	private Connection connection;
	private Statement statement;
	
	public Conexao() {
		try{
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:e:/GitHub/Soft-Controll-FES/db/banco.db");
			statement = connection.createStatement();
			statement.execute("CREATE TABLE IF NOT EXISTS USUARIOS(ID INTEGER, NOME VARCHAR, SENHA VARCHAR)");
			statement.execute("CREATE TABLE IF NOT EXISTS FESTAS(ID INTEGER, ENDERECO TEXT, TEMA TEXT, DATA TEXT, HORA_INICIO TEXT, HORA_TERMINO TEXT)");
		} 
		catch (SQLException e){} 
		catch (ClassNotFoundException e) {e.printStackTrace();}
	}
	
	
}
