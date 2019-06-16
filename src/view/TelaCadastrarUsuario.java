package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Color;
import java.text.ParseException;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class TelaCadastrarUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField nomeField;
	private JPasswordField senhaField;
	private JPasswordField confirmarField;
	private JButton cadastrarButton;
	private JFormattedTextField cpfField;
	private MaskFormatter cpfMask;

	public TelaCadastrarUsuario() {
		
		setBounds(100, 100, 230, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 204));
		panel.setBounds(0, 0, 216, 178);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel nomeLabel = new JLabel("Nome:");
		nomeLabel.setForeground(new Color(255, 255, 255));
		nomeLabel.setBounds(10, 22, 46, 14);
		panel.add(nomeLabel);
		
		JLabel senhaLabel = new JLabel("Senha:");
		senhaLabel.setForeground(new Color(255, 255, 255));
		senhaLabel.setBounds(10, 75, 46, 14);
		panel.add(senhaLabel);
		
		cadastrarButton = new JButton("Cadastrar");
		cadastrarButton.setBackground(new Color(0, 153, 255));
		cadastrarButton.setForeground(new Color(255, 255, 255));
		cadastrarButton.setBounds(60, 144, 89, 23);
		panel.add(cadastrarButton);
		
		nomeField = new JTextField();
		nomeField.setBounds(76, 19, 117, 20);
		panel.add(nomeField);
		nomeField.setColumns(10);
		
		JLabel confirmarLabel = new JLabel("Confirmar:");
		confirmarLabel.setForeground(new Color(255, 255, 255));
		confirmarLabel.setBounds(10, 107, 56, 14);
		panel.add(confirmarLabel);
		
		senhaField = new JPasswordField();
		senhaField.setBounds(76, 83, 117, 20);
		panel.add(senhaField);
		
		confirmarField = new JPasswordField();
		confirmarField.setBounds(76, 113, 117, 20);
		panel.add(confirmarField);
		
		JLabel cpfLabel = new JLabel("Cpf:");
		cpfLabel.setForeground(Color.WHITE);
		cpfLabel.setBounds(10, 47, 46, 14);
		panel.add(cpfLabel);
		
		cpfField = new JFormattedTextField();
		cpfField.setBounds(76, 52, 117, 20);
		panel.add(cpfField);
		cpfField.setColumns(10);
		
		try {
			
			cpfMask = new MaskFormatter("###.###.###-##");
			
			cpfMask.install(cpfField);
			
		} catch (ParseException e) {
		}
		
		setLocationRelativeTo(null);
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JPasswordField getSenhaField() {
		return senhaField;
	}

	public JPasswordField getConfirmarField() {
		return confirmarField;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JFormattedTextField getCpfField() {
		return cpfField;
	}

	public void setCpfField(JFormattedTextField cpfField) {
		this.cpfField = cpfField;
	}
	
	
}
