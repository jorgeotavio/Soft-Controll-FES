package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

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
		preencherTable();
		controll();
		
	}
	
	public void controll() {
		
		telaLogin.getBtnLogar().addActionListener(this);
		
		//telaSistema.getSairButton().addActionListener(this);
		telaSistema.getCadastrarUsuario().addActionListener(this);
		telaSistema.getCadastrarTema().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == telaLogin.getBtnLogar()) {
			
			Usuario usuario = new Usuario(telaLogin.getTextField().getText(), telaLogin.getPasswordField().getText());
			
			try {
				
				Read.buscarUsuario(usuario);
				telaLogin.setVisible(false);
				telaSistema.setVisible(true);
				ExibirMensagem.Mensagem("Logado!");
				Destrutor.destroyer(usuario);
				
			} catch (SQLException e1) {
				ExibirMensagem.Mensagem("Usuario não encontrado");
			}
		}
		
		if (e.getSource() == telaSistema.getCadastrarTema()) {
			
			TelaCadastrarTema telaCadastrarTema = new TelaCadastrarTema();
			telaCadastrarTema.setVisible(true);
			
		}else if (e.getSource() == telaSistema.getCadastrarUsuario()) {
			
			telaCadastrarUsuario = new TelaCadastrarUsuario();
			telaCadastrarUsuario.setVisible(true);
			
		}
		
	}
	
	public void preencherTable() {
		
		try {
			
			DefaultTableModel model = (DefaultTableModel) telaSistema.getTable().getModel();
			
			List<Festa> festas = Read.festas();
			
			
			for (Festa f : festas) {
				model.addRow(new Object[] {
						
						f.getId(), 
						f.getCliente(),
						f.getEndereco(),
						f.getValor(),
						f.getData(),
						f.getHora0(),
						f.getHora1()
				});
				
			}
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog(null, "Erro ao preencher tabela!");
			
		}
	}
	
}
