package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Read {
	
	public static Usuario buscarUsuario(Usuario usuario) throws SQLException {
		
		Conexao conexao = new Conexao();
		
		String comando = "SELECT NOME, SENHA FROM USUARIOS WHERE NOME = ?";
		
		PreparedStatement preparedStatement = conexao.getConnection().prepareStatement(comando);
		
		preparedStatement.setString(1, usuario.getNome());
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		Usuario user = new Usuario(resultSet.getString("NOME"), resultSet.getString("SENHA"));
		
		return user;
	}
}
