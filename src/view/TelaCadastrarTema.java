package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaCadastrarTema extends JFrame {

	private JPanel contentPane;
	private JTextField nomeField;
	private JButton cadastrarButton;
	
	public TelaCadastrarTema() {
		
		setBounds(100, 100, 230, 126);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 204));
		panel.setBounds(0, 0, 216, 84);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel nomeLabel = new JLabel("Nome:");
		nomeLabel.setForeground(new Color(255, 255, 255));
		nomeLabel.setBounds(20, 22, 46, 14);
		panel.add(nomeLabel);
		
		cadastrarButton = new JButton("Cadastrar");
		cadastrarButton.setBackground(new Color(0, 153, 255));
		cadastrarButton.setForeground(new Color(255, 255, 255));
		cadastrarButton.setBounds(60, 50, 89, 23);
		panel.add(cadastrarButton);
		
		nomeField = new JTextField();
		nomeField.setBounds(76, 19, 117, 20);
		panel.add(nomeField);
		nomeField.setColumns(10);
		
		setLocationRelativeTo(null);
		setVisible(false);
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}
	
}
