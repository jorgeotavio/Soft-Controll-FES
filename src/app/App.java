package app;

import model.BaseDados;
import model.Conexao;

import view.TelaLogin;

import java.sql.SQLException;

import controller.Controller;

//Mensagem de teste
public class App {
	
	private static String nome;
	private static int id;
	
	public static void main(String[] args) throws SQLException {
		
		Conexao conexao = new Conexao();
		
		nome = " 'Joao' ";
		id = 1;
		
//		conexao.connect().execute("CREATE TABLE IF NOT EXISTS PESSOA( ID INTEGER, NOME VARCHAR)");
//		conexao.connect().execute("INSERT INTO PESSOA( ID, NOME ) VALUES"+"("+id+","+nome+")");
		
		
		
		
//		TelaLogin telaLogin = new TelaLogin();
//		BaseDados baseDados = new BaseDados();
//		new Controller(baseDados, telaLogin);
		
	}
}
