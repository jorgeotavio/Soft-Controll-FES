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
	
	public Controller() {
		
		telaLogin = new TelaLogin();
		telaSistema = new TelaSistema();
		telaLogin.setVisible(true);
		controll();
		
	}
	
	public void controll() {
		
		telaLogin.getSairButton().addActionListener(this);
		telaLogin.getEntrarButton().addActionListener(this);
		
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
			} catch (SQLException e1) {
				ExibirMensagem.Mensagem("erro: "+e1);
			}
		}
		
	}
	
}
