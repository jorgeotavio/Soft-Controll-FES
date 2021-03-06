package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
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
	TelaDeletar telaDeletar;
	TelaSobre telaSobre;
	
	public Controller() {
		
		telaLogin = new TelaLogin();
		telaLogin.setVisible(true);
		telaSistema = new TelaSistema();
		telaCadastrarUsuario = new TelaCadastrarUsuario();
		telaCadastrarItem = new TelaCadastrarItem();
		telaCadastrarTema = new TelaCadastrarTema();
		telaAlugar = new TelaAlugar();
		telaDeletar = new TelaDeletar();
		telaSobre = new TelaSobre();
		
		preencherTemas();
		preencherClientes();
		preencherLogin();
		preencherTable();
		controll();
		
	}
	
	public void controll() {
		
		telaLogin.getBtnLogar().addActionListener(this);
		
		telaSistema.getCadastrarUsuario().addActionListener(this);
		telaSistema.getCadastrarTema().addActionListener(this);
		telaSistema.getCadastrarItem().addActionListener(this);
		telaSistema.getNovoAluguelButton().addActionListener(this);
		telaSistema.getExcluirButton().addActionListener(this);
		telaSistema.getSobreMenuItem().addActionListener(this);
		
		telaCadastrarUsuario.getCadastrarButton().addActionListener(this);
		
		telaCadastrarItem.getCadastrarButton().addActionListener(this);
		
		telaCadastrarTema.getCadastrarButton().addActionListener(this);
		
		telaSobre.getFecharButton().addActionListener(this);
		
		telaAlugar.getAlugarButton().addActionListener(this);
		
		telaDeletar.getBtnExcluir().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Usuario usuario;
		Usuario usuario2 = null;
		
		if (e.getSource() == telaLogin.getBtnLogar()) {
			
			usuario = new Usuario(telaLogin.getUserCB().getSelectedItem().toString(), telaLogin.getPasswordField().getText());
			usuario2 = Read.buscarUsuario(usuario);
			
			if (usuario2 == null) { 
				ExibirMensagem.Mensagem("Usuario n�o existe!");
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
		}else if(e.getSource() == telaSistema.getExcluirButton()) {
			telaDeletar.setVisible(true);
		}
		
		if (e.getSource() == telaCadastrarUsuario.getCadastrarButton()) {
			
			usuario = new Usuario(telaCadastrarUsuario.getNomeField().getText(), 
					telaCadastrarUsuario.getSenhaField().getText(), telaCadastrarUsuario.getCpfField().getText());

			usuario2 = Read.buscarUsuario(usuario);
			
			if (usuario2 == null) {
				try {
					if (Create.addUsuario(usuario)){
						limparCampos(telaCadastrarUsuario.getNomeField());
						limparCampos(telaCadastrarUsuario.getSenhaField());
						limparCampos(telaCadastrarUsuario.getConfirmarField());
						limparCampos(telaCadastrarUsuario.getCpfField());
						ExibirMensagem.Mensagem("Cadastrado com sucesso");
					}
				} catch (SQLException e1) {					
					ExibirMensagem.Mensagem("Erro");
					e1.printStackTrace();
				}
			}
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
				ExibirMensagem.Mensagem("Item j� existe");
			
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
				ExibirMensagem.Mensagem("Tema j� existe");
			
		}
		
		if (e.getSource() == telaSistema.getSobreMenuItem()) {
			telaSobre.setVisible(true);
		}
		
		if (e.getSource() == telaSobre.getFecharButton()) {
			telaSobre.setVisible(false);
		}
		
		if (e.getSource() == telaAlugar.getAlugarButton()) {
			
			String tema = telaAlugar.getTemaCB().toString();
			String cliente = telaAlugar.getTemaCB().toString();
			String endereco = telaAlugar.getEnderecoField().getText();
			String data = telaAlugar.getDataField().getText();
			String hora0 = telaAlugar.getHoraField().getText();
			String hora1 = telaAlugar.getHora2field().getText();	
			
			try {
				double valor = Double.parseDouble(telaAlugar.getValorField().getText());
			
				Festa festa = new Festa(tema, cliente, endereco, data, valor, hora0, hora1);
				
				try {
					if (Create.addFesta(festa)) {
						preencherTable();
						limparCampos(telaAlugar.getDataField());
						limparCampos(telaAlugar.getEnderecoField());
						limparCampos(telaAlugar.getValorField());
						limparCampos(telaAlugar.getHoraField());
						limparCampos(telaAlugar.getHora2field());
						ExibirMensagem.Mensagem("Alugado!");
					}
				}catch (SQLException e1) {					
					ExibirMensagem.Mensagem("Erro ao alugar!");
					e1.printStackTrace();
				}
				
			}catch(NumberFormatException e1) {
				limparCampos(telaAlugar.getValorField());
				ExibirMensagem.Mensagem("S� s�o permitido valores v�lidos no campo: Valor");
			}
			
		}
		
		if (e.getSource() == telaDeletar.getBtnExcluir()) {
			
			int id = Integer.parseInt(telaDeletar.getSpinner().getValue().toString());
			try {
				Delete.dellFesta(id);
				preencherTable();
				ExibirMensagem.Mensagem("Deletado!");
			} catch(Exception e1) {
				ExibirMensagem.Mensagem("Erro ao Deletar!");
			}
		}
	}
	
	private void limparCampos(JTextField jtf) {
		jtf.setText("");
	}

	private void preencherTable() {
		
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
	
	private void preencherLogin() {
		try {
			
			List<Usuario> usuarios = Read.usuarios();
			
			for (Usuario u : usuarios) {
				
				telaLogin.getUserCB().addItem(u.getNome());
				
			}
			
		}catch (Exception e) {}
	}
	
	private void preencherTemas() {
		try {
			
			List<Tema> temas = Read.temas();
			
			for (Tema t : temas) {
				
				telaAlugar.getTemaCB().addItem(t.getNome());
				
			}
			
		}catch (Exception e) {}
	}
	
	private void preencherClientes() {
		try {
			
			List<Cliente> clientes = Read.clientes();
			
			for (Cliente c : clientes) {
				
				telaAlugar.getClienteCB().addItem(c.getNome());
				
			}
			
		}catch (Exception e) {}
	}
}















