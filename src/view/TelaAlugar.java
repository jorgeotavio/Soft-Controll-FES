package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.Color;

public class TelaAlugar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAlugar frame = new TelaAlugar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaAlugar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaAlugar.class.getResource("/img/icons8-gr\u00E1fico-positivo-16.png")));
		setBounds(100, 100, 480, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 204));
		panel.setBounds(-6, -3, 479, 270);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel nomeLabel = new JLabel("");
		nomeLabel.setBounds(26, 45, 46, 14);
		panel.add(nomeLabel);
	}
}
