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
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class TelaSistema extends JFrame {
	
	private JMenuBar menuBar;
	
	private JMenu opcoesMenu, ajudaMenu;
	
	private JMenuItem cadastrarUsuario, 
						cadastrarItem, 
						cadastrarTema, 
						sobreMenuItem ;
	
	private JTable table;
	private JButton novoAluguelButton, excluirButton ;

	public TelaSistema() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaSistema.class.getResource("/img/icons8-gr\u00E1fico-positivo-16.png")));
		setTitle("Sistema");
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 419);
		setLocationRelativeTo(null);
		
		menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBackground(new Color(0, 153, 204));
		setJMenuBar(menuBar);
		
		opcoesMenu = new JMenu("Op\u00E7\u00F5es");
		opcoesMenu.setForeground(new Color(255, 255, 255));
		opcoesMenu.setBackground(new Color(0, 153, 204));
		opcoesMenu.setIcon(new ImageIcon(TelaSistema.class.getResource("/img/icons8-editar-16.png")));
		menuBar.add(opcoesMenu);
		
		cadastrarUsuario = new JMenuItem("Cadastrar Usuario");
		cadastrarUsuario.setIcon(new ImageIcon(TelaSistema.class.getResource("/img/icons8-mais-16.png")));
		opcoesMenu.add(cadastrarUsuario);
		
		cadastrarItem = new JMenuItem("Cadastrar Itens");
		cadastrarItem.setIcon(new ImageIcon(TelaSistema.class.getResource("/img/icons8-mais-16.png")));
		opcoesMenu.add(cadastrarItem);
		
		cadastrarTema = new JMenuItem("Cadastrar Temas");
		cadastrarTema.setIcon(new ImageIcon(TelaSistema.class.getResource("/img/icons8-mais-16.png")));
		opcoesMenu.add(cadastrarTema);
		
		ajudaMenu = new JMenu("Ajuda");
		ajudaMenu.setForeground(new Color(255, 255, 255));
		ajudaMenu.setBackground(new Color(0, 153, 204));
		ajudaMenu.setIcon(new ImageIcon(TelaSistema.class.getResource("/img/icons8-marcador-16.png")));
		menuBar.add(ajudaMenu);
		
		sobreMenuItem = new JMenuItem("Sobre");
		sobreMenuItem.setIcon(new ImageIcon(TelaSistema.class.getResource("/img/icons8-marcador-16.png")));
		ajudaMenu.add(sobreMenuItem);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 153, 204));
		panel.setBounds(0, 0, 649, 369);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 170, 629, 188);
		panel.add(scrollPane);
		
		table = new JTable();
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Endere\u00E7o", "Cliente", "Tema", "Valor", "Data", "Hora Inicial", "Hora Final"
			}
		));
		
		scrollPane.setViewportView(table);
		
		novoAluguelButton = new JButton("Novo Aluguel");
		novoAluguelButton.setForeground(new Color(255, 255, 255));
		novoAluguelButton.setBackground(new Color(0, 153, 255));
		novoAluguelButton.setIcon(new ImageIcon(TelaSistema.class.getResource("/img/icons8-mais-16.png")));
		novoAluguelButton.setBounds(10, 136, 140, 23);
		panel.add(novoAluguelButton);
		
		excluirButton = new JButton("Excluir");
		excluirButton.setForeground(new Color(255, 255, 255));
		excluirButton.setBackground(new Color(0, 153, 255));
		excluirButton.setIcon(new ImageIcon(TelaSistema.class.getResource("/img/icons8-excluir-16.png")));
		excluirButton.setBounds(160, 136, 124, 23);
		panel.add(excluirButton);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(TelaSistema.class.getResource("/img/caixa.png")));
		label_1.setBounds(348, 0, 269, 211);
		panel.add(label_1);
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
	public JButton getNovoAluguelButton() {
		return novoAluguelButton;
	}
	public JButton getExcluirButton() {
		return excluirButton;
	}
	
	
}
