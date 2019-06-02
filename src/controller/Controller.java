package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.*;
import view.*;

public class Controller implements ActionListener {
	
	Conexao conexao;
	
	TelaLogin telaLogin;
	TelaSistema telaSistema;
	TelaCadastrarUsuario telaCadastrarUsuario;
	TelaCadastrarItem telaCadastrarItem;
	TelaCadastrarTema telaCadastrarTema;
	
	public Controller() {
		
		telaLogin = new TelaLogin();
		telaLogin.setVisible(true);
		telaSistema = new TelaSistema();
		telaCadastrarUsuario = new TelaCadastrarUsuario();
		telaCadastrarItem = new TelaCadastrarItem();
		telaCadastrarTema = new TelaCadastrarTema();
		
		preencherTable();
		controll();
		
	}
	
	public void controll() {
		
		telaLogin.getBtnLogar().addActionListener(this);
		
		telaSistema.getCadastrarUsuario().addActionListener(this);
		telaSistema.getCadastrarTema().addActionListener(this);
		telaSistema.getCadastrarItem().addActionListener(this);
		
		telaCadastrarUsuario.getCadastrarButton().addActionListener(this);
		
		telaCadastrarItem.getCadastrarButton().addActionListener(this);
		
		telaCadastrarTema.getCadastrarButton().addActionListener(this);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Usuario usuario;
		Usuario usuario2 = null;
		
		if (e.getSource() == telaLogin.getBtnLogar()) {
			
			usuario = new Usuario(telaLogin.getTextField().getText(), telaLogin.getPasswordField().getText());
			usuario2 = Read.buscarUsuario(usuario);
			
			if (usuario2 == null) { 
				ExibirMensagem.Mensagem("Usuario não existe!");
			}
			if (usuario2.getNome().equalsIgnoreCase(usuario.getNome()) && usuario2.getSenha().equals(usuario.getSenha())) {
				telaLogin.setVisible(false);
				telaSistema.setVisible(true);
				ExibirMensagem.Mensagem("Logado!");
				Destrutor.destroyer(usuario);
			}
			else {
				ExibirMensagem.Mensagem("Usuario ou senha incorretos!");
			}
		}	
			
		
		if (e.getSource() == telaSistema.getCadastrarUsuario()) {
			telaCadastrarUsuario.setVisible(true);
			
		}else if (e.getSource() == telaSistema.getCadastrarItem()) {
			telaCadastrarItem.setVisible(true);
		} else if (e.getSource() == telaSistema.getCadastrarTema()) {
			telaCadastrarTema.setVisible(true);
		}
		
		if (e.getSource() == telaCadastrarUsuario.getCadastrarButton()) {
			
			usuario = new Usuario(telaCadastrarUsuario.getNomeField().getText(), 
					telaCadastrarUsuario.getSenhaField().getText());
			
			usuario2 = Read.buscarUsuario(usuario2);
			telaCadastrarUsuario.setVisible(true);
		
			if (usuario2 == null) {
				try {
					if (Create.addUsuario(usuario))
						ExibirMensagem.Mensagem("Cadastrado com sucesso");
				} catch (SQLException e1) {					
					ExibirMensagem.Mensagem("Erro");
					e1.printStackTrace();
				}
			}else if (usuario2.getNome().equalsIgnoreCase(usuario.getNome()))
				ExibirMensagem.Mensagem("Usuario já existe");
		}
		
		if (e.getSource() == telaCadastrarItem.getCadastrarButton()) {
			
			int quantidade = Integer.parseInt(telaCadastrarItem.getSpinnerItem().getValue().toString());
			Item item = new Item(telaCadastrarItem.getNomeField().getText(), quantidade);
			Item item2 = Read.buscarItem(item);
			
			if (item2 == null) {
				try {
					if (Create.addItem(item)) {
						ExibirMensagem.Mensagem("Item Cadastrado!");
					}
				}catch (SQLException e1) {					
					ExibirMensagem.Mensagem("Erro");
					e1.printStackTrace();
				}
			}else if (item2.getNome().equalsIgnoreCase(item.getNome()))
				ExibirMensagem.Mensagem("Item já existe");
			
		}
		
		if (e.getSource() == telaCadastrarTema.getCadastrarButton()) {
			
			Tema tema = new Tema(telaCadastrarTema.getNomeField().getText());
			Tema tema2 = Read.buscarTema(tema);
			
			if (tema2 == null) {
				try {
					if (Create.addTema(tema)) {
						ExibirMensagem.Mensagem("Tema Cadastrado!");
					}
				}catch (SQLException e1) {					
					ExibirMensagem.Mensagem("Erro");
					e1.printStackTrace();
				}
			}else if (tema2.getNome().equalsIgnoreCase(tema.getNome()))
				ExibirMensagem.Mensagem("Tema já existe");
			
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
						f.getTema(),
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
