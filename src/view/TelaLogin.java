package view;

import java.awt.BorderLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TelaLogin extends JFrame{
	
	private JLabel  nomeLabel, senhaLabel;
	private JButton entrarButton, sairButton;
	private JTextField nomeField, senhaField;
	private Panel   panel, panel2, panel3;

	public TelaLogin() {
		super("Login");
		criarTela();
	}
	
	private void criarTela() {
		nomeLabel    = new JLabel("Nome: ");
		senhaLabel   = new JLabel("Senha: ");
		entrarButton = new JButton("Entrar");
		sairButton   = new JButton("Sair");
		nomeField    = new JTextField(10);
		senhaField   = new JTextField(10);
		panel        = new Panel();
		panel2       = new Panel();
		panel3       = new Panel();
		
		setSize(200, 130);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setResizable(false);
		setVisible(false);
		
		panel.add(entrarButton);
		panel.add(sairButton);
		
		panel3.add(nomeLabel);
		panel3.add(nomeField);
		
		panel2.add(senhaLabel);
		panel2.add(senhaField);
		
		add(panel3, BorderLayout.NORTH);
		add(panel2, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
	}
	
	public JButton getEntrarButton() {
		return entrarButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getSenhaField() {
		return senhaField;
	}
}
