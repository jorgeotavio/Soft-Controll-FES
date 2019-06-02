package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;

public class TelaSistema extends JFrame {
	
	private JMenuBar menuBar;
	
	private JMenu opcoesMenu, ajudaMenu;
	
	private JMenuItem cadastrarUsuario, 
						cadastrarItem, 
						cadastrarTema, 
						sobreMenuItem, 
						BuscarItem, 
						buscarTema ;
	private JTable table;

	public TelaSistema() {
		setTitle("Sistema");
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 388);
		setLocationRelativeTo(null);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		opcoesMenu = new JMenu("Op\u00E7\u00F5es");
		menuBar.add(opcoesMenu);
		
		cadastrarUsuario = new JMenuItem("Cadastrar Usuario");
		opcoesMenu.add(cadastrarUsuario);
		
		cadastrarItem = new JMenuItem("Cadastrar Itens");
		opcoesMenu.add(cadastrarItem);
		
		cadastrarTema = new JMenuItem("Cadastrar Temas");
		opcoesMenu.add(cadastrarTema);
		
		buscarTema = new JMenuItem("Buscar Temas");
		opcoesMenu.add(buscarTema);
		
		BuscarItem = new JMenuItem("Buscar Itens");
		opcoesMenu.add(BuscarItem);
		
		ajudaMenu = new JMenu("Ajuda");
		menuBar.add(ajudaMenu);
		
		sobreMenuItem = new JMenuItem("Sobre");
		ajudaMenu.add(sobreMenuItem);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 102));
		panel.setBounds(0, 0, 531, 327);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 170, 511, 146);
		panel.add(scrollPane);
		
		table = new JTable();
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Cliente", "Endere\u00E7o", "Valor", "Data", "Hora Inicial", "Hora Final"
			}
		));
		
		scrollPane.setViewportView(table);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 11, 46, 14);
		panel.add(label);
		
		JButton deletarButton = new JButton("Deletar");
		deletarButton.setBounds(10, 136, 89, 23);
		panel.add(deletarButton);
		
		JButton novoCadastroButton = new JButton("Novo Cadastro");
		novoCadastroButton.setBounds(109, 136, 120, 23);
		panel.add(novoCadastroButton);
	}
	public void preencherTabela() {
		
	}
	public JMenuItem getCadastrarUsuario() {
		return cadastrarUsuario;
	}

	public JMenuItem getCadastrarItem() {
		return cadastrarItem;
	}

	public JMenuItem getCadastrarTema() {
		return cadastrarTema;
	}

	public JMenuItem getSobreMenuItem() {
		return sobreMenuItem;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}
}
