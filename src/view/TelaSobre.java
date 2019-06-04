package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class TelaSobre extends JFrame {

	private JPanel contentPane;
	private JButton fecharButton;

	public TelaSobre() {
		setUndecorated(true);
		setBounds(100, 100, 500, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TelaSobre.class.getResource("/img/sobre.png")));
		label.setBounds(0, 0, 500, 400);
		contentPane.add(label);
		
		fecharButton = new JButton("");
		fecharButton.setIcon(new ImageIcon(TelaSobre.class.getResource("/img/fechar.png")));
		fecharButton.setBackground(new Color(51, 51, 51));
		fecharButton.setForeground(new Color(51, 51, 51));
		fecharButton.setBounds(434, 11, 56, 23);
		contentPane.add(fecharButton);
		
		setVisible(false);
	}

	public JButton getFecharButton() {
		return fecharButton;
	}
	
	
}
