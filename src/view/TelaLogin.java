package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnLogar;
	
	public TelaLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaLogin.class.getResource("/img/icons8-gr\u00E1fico-positivo-16.png")));
		setForeground(Color.CYAN);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 221, 167);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 204));
		panel.setBounds(0, 0, 205, 128);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblLogin.setBounds(10, 29, 39, 14);
		panel.add(lblLogin);
		
		textField = new JTextField();
		textField.setBounds(64, 26, 125, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(new Color(255, 255, 255));
		lblSenha.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblSenha.setBounds(10, 60, 51, 14);
		panel.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(64, 57, 125, 20);
		panel.add(passwordField);
		
		btnLogar = new JButton("Logar");
		btnLogar.setBackground(new Color(0, 153, 255));
		btnLogar.setForeground(new Color(255, 255, 255));
		btnLogar.setIcon(null);
		btnLogar.setBounds(59, 94, 89, 23);
		panel.add(btnLogar);
	}

	public JTextField getTextField() {
		return textField;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public JButton getBtnLogar() {
		return btnLogar;
	}
	
	
	
	
}
