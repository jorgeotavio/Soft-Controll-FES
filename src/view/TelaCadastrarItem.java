package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;

public class TelaCadastrarItem extends JFrame {

	private JPanel contentPane;
	private JTextField nomeField;
	private JSpinner spinnerItem;
	private JButton cadastrarButton;
	
	public TelaCadastrarItem() {
		
		setBounds(100, 100, 230, 152);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 204));
		panel.setBounds(0, 0, 216, 111);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel nomeLabel = new JLabel("Nome:");
		nomeLabel.setForeground(new Color(255, 255, 255));
		nomeLabel.setBounds(20, 22, 46, 14);
		panel.add(nomeLabel);
		
		JLabel quantidadeLabel = new JLabel("Quantidade:");
		quantidadeLabel.setForeground(new Color(255, 255, 255));
		quantidadeLabel.setBounds(18, 54, 68, 14);
		panel.add(quantidadeLabel);
		
		cadastrarButton = new JButton("Cadastrar");
		cadastrarButton.setBackground(new Color(0, 153, 255));
		cadastrarButton.setForeground(new Color(255, 255, 255));
		cadastrarButton.setBounds(63, 79, 89, 23);
		panel.add(cadastrarButton);
		
		nomeField = new JTextField();
		nomeField.setBounds(76, 19, 117, 20);
		panel.add(nomeField);
		nomeField.setColumns(10);
		
		spinnerItem = new JSpinner();
		spinnerItem.setBounds(117, 51, 76, 20);
		panel.add(spinnerItem);
		
		setLocationRelativeTo(null);
		setVisible(false);
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JSpinner getSpinnerItem() {
		return spinnerItem;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}
	
	
	
	
	
}
