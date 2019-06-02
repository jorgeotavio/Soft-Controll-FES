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
	TelaAlugar telaAlugar;
	
	public Controller() {
		
		telaLogin = new TelaLogin();
		telaLogin.setVisible(true);
		telaSistema = new TelaSistema();
		telaCadastrarUsuario = new TelaCadastrarUsuario();
		telaCadastrarItem = new TelaCadastrarItem();
		telaCadastrarTema = new TelaCadastrarTema();
		telaAlugar = new TelaAlugar();
		
		preencherTable();
		controll();
		
	}
	
	public void controll() {
		
		telaLogin.getBtnLogar().addActionListener(this);
		
		telaSistema.getCadastrarUsuario().addActionListener(this);
		telaSistema.getCadastrarTema().addActionListener(this);
		telaSistema.getCadastrarItem().addActionListener(this);
		telaSistema.getNovoAluguelButton().addActionListener(this);
		
		telaCadastrarUsuario.getCadastrarButton().addActionListener(this);
		
		telaCadastrarItem.getCadastrarButton().addActionListener(this);
		
		telaCadastrarTema.getCadastrarButton().addActionListener(this);
		
		telaAlugar.getAlugarButton().addActionListener(this);

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
		}else if (e.getSource() == telaSistema.getCadastrarTema()) {
			telaCadastrarTema.setVisible(true);
		}else if (e.getSource() == telaSistema.getNovoAluguelButton()) {
			telaAlugar.setVisible(true);
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
		
		if (e.getSource() == telaAlugar.getAlugarButton()) {
			
			String tema = telaAlugar.getTemaField().getText();
			String cliente = telaAlugar.getClienteField().getText();
			String endereco = telaAlugar.getEnderecoField().getText();
			String data = telaAlugar.getDataField().getText();
			double valor = Double.parseDouble(telaAlugar.getValorField().getText());
			String hora0 = telaAlugar.getHoraField().getText();
			String hora1 = telaAlugar.getHora2field().getText();	
			
			Festa festa = new Festa(tema, cliente, endereco, data, valor, hora0, hora1);
			
			try {
				if (Create.addFesta(festa)) {
					ExibirMensagem.Mensagem("Alugado!");
				}
			}catch (SQLException e1) {					
				ExibirMensagem.Mensagem("Erro ao alugar!");
				e1.printStackTrace();
			}
			
			preencherTable();
		}
	}
			

	public void preencherTable() {
		
		try {
			
			DefaultTableModel model = (DefaultTableModel) telaSistema.getTable().getModel();
			model.setNumRows(0);
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
