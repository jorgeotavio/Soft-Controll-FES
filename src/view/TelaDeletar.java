package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JButton;

public class TelaDeletar extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JSpinner spinner;
	private JButton btnExcluir;

	public TelaDeletar() {
		setBounds(100, 100, 183, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 153, 204));
		panel.setBounds(0, 0, 171, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		spinner = new JSpinner();
		spinner.setBounds(33, 87, 92, 20);
		panel.add(spinner);
		
		JLabel lblIdDoAluguel = new JLabel("ID do Aluguel:");
		lblIdDoAluguel.setForeground(Color.WHITE);
		lblIdDoAluguel.setBounds(36, 62, 92, 14);
		panel.add(lblIdDoAluguel);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(33, 131, 89, 23);
		panel.add(btnExcluir);
		
		setLocationRelativeTo(null);
		setVisible(false);
	}

	public JSpinner getSpinner() {
		return spinner;
	}

	public JButton getBtnExcluir() {
		return btnExcluir;
	}
}
