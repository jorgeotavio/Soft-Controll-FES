package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.BaseDados;
import model.Usuario;
import view.TelaCadastrarCliente;
import view.TelaSistema;
import view.TelaLogin;


public class Controller implements ActionListener {
	
	BaseDados baseDados;
	Usuario usuario;
	
	private TelaSistema telaSistema;
	private TelaLogin telaLogin;
	TelaCadastrarCliente telaCadastrarCliente;
	
	public Controller(BaseDados baseDados, TelaLogin telaLogin){		
		this.baseDados = baseDados;
		this.telaLogin = telaLogin;
		telaSistema = new TelaSistema();
		telaCadastrarCliente = new TelaCadastrarCliente();
		controll();
	}
	
	public void controll() {
		telaLogin.getEntrarButton().addActionListener(this);
		telaSistema.getSairButton().addActionListener(this);
		telaSistema.getCadastrarCliente().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == telaLogin.getEntrarButton()) {
			if (BaseDados.isUsuario(new Usuario(telaLogin.getNomeField().getText(), telaLogin.getSenhaField().getText()))) {
				telaSistema.setVisible(true);
				telaLogin.setVisible(false);
			}
			else {
				JOptionPane.showMessageDialog(null, "Usuario Inválido");
			}
		}
		else if (e.getSource() == telaLogin.getSairButton()) {
			System.exit(0);
		}
		
		if (e.getSource() == telaSistema.getCadastrarCliente()) {
			telaCadastrarCliente.setVisible(true);
		}
		else if (e.getSource() == telaSistema.getSairButton()) {
			System.exit(0);
		}
	}

}
