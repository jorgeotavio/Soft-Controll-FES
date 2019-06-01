package model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {
	
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
	
	public static boolean addUsuario(Usuario usuario) throws SQLException {
        
    	Conexao conexao = new Conexao();
    	
        PreparedStatement preparedStatement = 
        		conexao.getConnection().prepareStatement("INSERT INTO USUARIOS (NOME, SENHA)" + " VALUES (?,?)");
        
        preparedStatement.setString(1, usuario.getNome());
        preparedStatement.setString(2, usuario.getSenha());
      
        int registros = preparedStatement.executeUpdate();
        preparedStatement.close();
        
        if (registros == 1)
            return true; 
        else 
            return false; 
	}

	public static boolean addTema(Tema tema) throws SQLException {
    
    	Conexao conexao = new Conexao();
    	
        PreparedStatement preparedStatement = 
        		conexao.getConnection().prepareStatement("INSERT INTO TEMAS (NOME)" + " VALUES (?)");
        
        preparedStatement.setString(1, tema.getNome());
      
        int registros = preparedStatement.executeUpdate();
        preparedStatement.close();
        
        if (registros == 1)
            return true;
        else
            return false;
	}

	public static boolean addItem(Item item) throws SQLException {
    
    	Conexao conexao = new Conexao();
    	
        PreparedStatement preparedStatement = 
        		conexao.getConnection().prepareStatement("INSERT INTO ITENS (NOME, QUANTIDADE)" + " VALUES (?,?)");
        
        preparedStatement.setString(1, item.getNome());
        preparedStatement.setInt(2, item.getQuantidade());
      
        int registros = preparedStatement.executeUpdate();
        preparedStatement.close();
        
        if (registros == 1)
            return true; 
        else 
            return false; 
	}

	public static boolean addFesta(Festa festa) throws SQLException {
    
    	Conexao conexao = new Conexao();
    	
        PreparedStatement preparedStatement = 
        		conexao.getConnection().prepareStatement("INSERT INTO FESTAS(TEMA, ENDERECO, DATA, VALOR, HORA_INI, HORA_FIN)" + " VALUES (?,?,?,?,?,?)");
        
        preparedStatement.setString(1, festa.getTema());
        preparedStatement.setString(2, festa.getEndereco());
        preparedStatement.setDate(3, (Date) festa.getData());
        preparedStatement.setDouble(4, festa.getValor());
        preparedStatement.setTime(5, festa.getHora0());
        preparedStatement.setTime(6, festa.getHora1());
      
        int registros = preparedStatement.executeUpdate();
        preparedStatement.close();
        
        if (registros == 1)
            return true; 
        else 
            return false; 
	}

	public static boolean addCliente(Cliente cliente) throws SQLException {
    
    	Conexao conexao = new Conexao();
    	
        PreparedStatement preparedStatement = 
        		conexao.getConnection().prepareStatement("INSERT INTO FESTAS(NOME, TELEFONE, ANTIGO)" + " VALUES (?,?,?)");
        
        preparedStatement.setString(1, cliente.getNome());
        preparedStatement.setInt(2, cliente.getTelefone());
        preparedStatement.setBoolean(3, cliente.isAntigo());
      
        int registros = preparedStatement.executeUpdate();
        preparedStatement.close();
        
        if (registros == 1)
            return true; 
        else 
            return false; 
	}

}
