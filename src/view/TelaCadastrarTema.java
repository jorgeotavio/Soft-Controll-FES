package view;

import java.awt.BorderLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TelaCadastrarTema extends JFrame {
	
	private JLabel nomeLabel;
	private JTextField nomeField;
	private JButton cadastrarButton, sairButton;
	private Panel   panel, panel3;

	
	public TelaCadastrarTema(){
		super("Cadastrar Tema");
		criarTela();
	}
	
	public void criarTela() {
		
		nomeLabel    = new JLabel("Nome: ");
		cadastrarButton = new JButton("Cadastrar");
		sairButton   = new JButton("Sair");
		nomeField    = new JTextField(10);
		panel        = new Panel();
		panel3 		 = new Panel();
		
		setSize(200, 130);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setResizable(false);
		setVisible(false);
		
		panel.add(cadastrarButton);
		panel.add(sairButton);
		
		panel3.add(nomeLabel);
		panel3.add(nomeField);
		
		add(panel3, BorderLayout.NORTH);
		add(panel, BorderLayout.SOUTH);
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}
	
	

}
