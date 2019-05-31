package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TelaSistema extends JFrame {
	
	private JPanel panel;
	private JButton sairButton;
	private JMenuBar menuBar;
	private JMenu menuOpcoes, menuAjuda;
	private JMenuItem cadastrarCliente, cadastrarUsuario, cadastrarTema, sobre, cadastrarItens; 
	
	public TelaSistema() {
		super("Soft Controll");
		criarTela();
		
	}
	
	private void criarTela() {
		setSize(400, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel       = new JPanel();
		sairButton  = new JButton("Sair");
		
		menuBar     = new JMenuBar();
		
		menuOpcoes  = new JMenu("Opções");
		menuAjuda   = new JMenu("Ajuda");
		
		cadastrarCliente = new JMenuItem("Cadastrar Cliente");
		cadastrarUsuario = new JMenuItem("Cadastrar Usuário");
		cadastrarTema    = new JMenuItem("Cadastrar Tema");
		cadastrarItens   = new JMenuItem("Cadastrar Itens");
		sobre = new JMenuItem("Sobre");
		
		panel.add(sairButton);
		
		menuOpcoes.add(cadastrarCliente);
		menuOpcoes.add(cadastrarUsuario);
		menuOpcoes.add(cadastrarTema);
		menuOpcoes.add(cadastrarItens);
		menuAjuda.add(sobre);
		
		menuBar.add(menuOpcoes);
		menuBar.add(menuAjuda);
		
		add(menuBar, BorderLayout.NORTH);
		add(panel, BorderLayout.SOUTH);
	}

	public JButton getSairButton() {
		return sairButton;
	}

	public JMenuItem getCadastrarCliente() {
		return cadastrarCliente;
	}

	public JMenuItem getCadastrarUsuario() {
		return cadastrarUsuario;
	}

	public JMenuItem getCadastrarTema() {
		return cadastrarTema;
	}

	public JMenuItem getSobre() {
		return sobre;
	}
	
	
	
}
