package model;

import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelas {
	
	
	public static void criarTabelas(Statement statement) throws SQLException {
		
		statement.execute("CREATE TABLE IF NOT EXISTS USUARIOS("
						+ "ID 		INTEGER primary key autoincrement,"
						+ "NOME 	VARCHAR, "
						+ "SENHA 	VARCHAR"
						+ ")");
		
		statement.execute("CREATE TABLE IF NOT EXISTS TEMAS("
						+ "ID 		INTEGER primary key autoincrement,"
						+ "NOME 	VARCHAR)");
		
		statement.execute("CREATE TABLE IF NOT EXISTS ITENS("
						+ "ID 		INTEGER primary key autoincrement,"
						+ "NOME 	VARCHAR,"
						+ "QUANTIDADE INTEGER"
						+ ")");
		
		statement.execute("CREATE TABLE IF NOT EXISTS FESTAS("
						+ "ID 		INTEGER primary key autoincrement,"
						+ "TEMA 	VARCHAR,"
						+ "ENDERECO VARCHAR,"
						+ "DATA		DATE,"
						+ "VALOR	FLOAT,"
						+ "HORA_INI	DATETIME,"
						+ "HORA_FIN	DATETIME"
						+ ")");
		
		statement.execute("CREATE TABLE IF NOT EXISTS CLIENTES("
						+ "ID 		INTEGER primary key autoincrement,"
						+ "NOME 	VARCHAR,"
						+ "TELEFONE	INTEGER,"
						+ "ANTIGO 	BOOLEAN"
						+ ")");
		
		System.out.println("criou");
	}
	
	
}
