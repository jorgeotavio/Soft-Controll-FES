package view;

import java.awt.BorderLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TelaCadastrarUsuario extends JFrame {
	
	private JLabel nomeLabel, senhaLabel;
	private JTextField nomeField;
	private JPasswordField senhaField;
	private JButton cadastrarButton, sairButton;
	private Panel   panel, panel2, panel3;

	
	public TelaCadastrarUsuario(){
		super("Cadastrar Usuários");
		criarTela();
	}
	
	public void criarTela() {
		nomeLabel    = new JLabel("Nome: ");
		senhaLabel   = new JLabel("Senha: ");
		cadastrarButton = new JButton("Cadastrar");
		sairButton   = new JButton("Sair");
		nomeField    = new JTextField(10);
		senhaField   = new JPasswordField(10);
		panel        = new Panel();
		panel2       = new Panel();
		panel3       = new Panel();
		
		setSize(200, 130);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setResizable(false);
		setVisible(false);
		
		panel.add(cadastrarButton);
		panel.add(sairButton);
		
		panel3.add(nomeLabel);
		panel3.add(nomeField);
		
		panel2.add(senhaLabel);
		panel2.add(senhaField);
		
		add(panel3, BorderLayout.NORTH);
		add(panel2, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JPasswordField getSenhaField() {
		return senhaField;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}
	

}
