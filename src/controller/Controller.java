package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import model.*;
import view.*;

public class Controller implements ActionListener {
	
	Conexao conexao;
	
	TelaLogin telaLogin;
	TelaSistema telaSistema;
	TelaCadastrarUsuario telaCadastrarUsuario;
	
	public Controller() {
		
		telaLogin = new TelaLogin();
		telaSistema = new TelaSistema();
		telaLogin.setVisible(true);
		controll();
		
	}
	
	public void controll() {
		
		telaLogin.getSairButton().addActionListener(this);
		telaLogin.getEntrarButton().addActionListener(this);
		
		telaSistema.getSairButton().addActionListener(this);
		telaSistema.getCadastrarUsuario().addActionListener(this);
		telaSistema.getCadastrarTema().addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == telaLogin.getSairButton()) {
			System.exit(0);
		}
		
		else if (e.getSource() == telaLogin.getEntrarButton()) {
			
			Usuario usuario = new Usuario(telaLogin.getNomeField().getText(), telaLogin.getSenhaField().getText());
			
			try {
				
				Read.buscarUsuario(usuario);
				telaLogin.setVisible(false);
				telaSistema.setVisible(true);
				ExibirMensagem.Mensagem("Logado!");
				Destrutor.Destroyer(usuario);
				
			} catch (SQLException e1) {
				ExibirMensagem.Mensagem("Usuario não encontrado");
			}
		}
		
		if (e.getSource() == telaSistema.getSairButton()) {
			System.exit(0);
		}else if (e.getSource() == telaSistema.getCadastrarTema()) {
			
			TelaCadastrarTema telaCadastrarTema = new TelaCadastrarTema();
			telaCadastrarTema.setVisible(true);
			
		}else if (e.getSource() == telaSistema.getCadastrarUsuario()) {
			
			telaCadastrarUsuario = new TelaCadastrarUsuario();
			telaCadastrarUsuario.setVisible(true);
			
		}
		
	}
	
}
