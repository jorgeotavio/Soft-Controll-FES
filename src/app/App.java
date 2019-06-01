package app;

import model.*;
import java.sql.SQLException;

public class App {
	
	public static Conexao conexao;
	public static void main(String[] args) throws SQLException {
		
		conexao = new Conexao();
	}
}
