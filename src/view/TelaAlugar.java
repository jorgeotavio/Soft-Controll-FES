package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import java.awt.List;
import java.awt.Toolkit;
import java.text.ParseException;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class TelaAlugar extends JFrame {

	private JPanel contentPane;
	private JLabel temaLabel, clienteLabel;
	private JLabel dataLabel;
	private JLabel enderecoLabel;
	private JLabel valorLabel;
	private JLabel lblHoraDeInicio;
	private JLabel lblHoraDoFim;
	private JTextField temaField;
	private JTextField clienteField;
	private JTextField enderecoField;
	private JFormattedTextField horaField;
	private JFormattedTextField hora2field;
	private JTextField valorField;
	private JFormattedTextField dataField;
	private MaskFormatter horaMask, horaMask2, dataMask;
	private JButton alugarButton;

	public TelaAlugar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaAlugar.class.getResource("/img/icons8-gr\u00E1fico-positivo-16.png")));
		setBounds(100, 100, 480, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 204));
		panel.setBounds(0, 0, 464, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		temaLabel = new JLabel("Tema");
		temaLabel.setForeground(Color.WHITE);
		temaLabel.setBounds(26, 14, 46, 14);
		panel.add(temaLabel);
		
		clienteLabel = new JLabel("Cliente");
		clienteLabel.setForeground(Color.WHITE);
		clienteLabel.setBounds(26, 39, 46, 14);
		panel.add(clienteLabel);
		
		dataLabel = new JLabel("Data");
		dataLabel.setForeground(Color.WHITE);
		dataLabel.setBounds(26, 64, 46, 14);
		panel.add(dataLabel);
		
		enderecoLabel = new JLabel("Endere\u00E7o");
		enderecoLabel.setForeground(Color.WHITE);
		enderecoLabel.setBounds(26, 89, 72, 14);
		panel.add(enderecoLabel);
		
		valorLabel = new JLabel("Valor:  R$");
		valorLabel.setForeground(Color.WHITE);
		valorLabel.setBounds(26, 114, 72, 14);
		panel.add(valorLabel);
		
		lblHoraDeInicio = new JLabel("Hora de Inicio");
		lblHoraDeInicio.setForeground(Color.WHITE);
		lblHoraDeInicio.setBounds(26, 139, 101, 14);
		panel.add(lblHoraDeInicio);
		
		lblHoraDoFim = new JLabel("Hora do fim");
		lblHoraDoFim.setForeground(Color.WHITE);
		lblHoraDoFim.setBounds(26, 164, 101, 14);
		panel.add(lblHoraDoFim);
		
		temaField = new JTextField();
		temaField.setBounds(141, 8, 86, 20);
		panel.add(temaField);
		temaField.setColumns(10);
		
		clienteField = new JTextField();
		clienteField.setBounds(141, 33, 86, 20);
		panel.add(clienteField);
		clienteField.setColumns(10);
		
		enderecoField = new JTextField();
		enderecoField.setBounds(141, 83, 86, 20);
		panel.add(enderecoField);
		enderecoField.setColumns(10);
		
		horaField = new JFormattedTextField();
		horaField.setBounds(141, 133, 86, 20);
		panel.add(horaField);
		horaField.setColumns(10);
		
		hora2field = new JFormattedTextField();
		hora2field.setBounds(141, 158, 86, 20);
		panel.add(hora2field);
		hora2field.setColumns(10);
		
		valorField = new JTextField();
		valorField.setBounds(141, 108, 86, 20);
		panel.add(valorField);
		valorField.setColumns(10);
		
		dataField = new JFormattedTextField();
		dataField.setBounds(141, 58, 86, 20);
		panel.add(dataField);
		dataField.setColumns(10);
		
		alugarButton = new JButton("Alugar");
		alugarButton.setBackground(new Color(0, 153, 255));
		alugarButton.setForeground(Color.WHITE);
		alugarButton.setBounds(52, 203, 137, 39);
		panel.add(alugarButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(TelaAlugar.class.getResource("/img/caixa.png")));
		lblNewLabel.setBounds(198, 0, 266, 250);
		panel.add(lblNewLabel);
		
		try {
			horaMask = new MaskFormatter("##:##");
			horaMask2 = new MaskFormatter("##:##");
			dataMask = new MaskFormatter("##/##/####");
			horaMask.install(horaField);
			horaMask2.install(hora2field);
			dataMask.install(dataField);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		setLocationRelativeTo(null);
		setVisible(false);
	}

	public JTextField getTemaField() {
		return temaField;
	}

	public JTextField getClienteField() {
		return clienteField;
	}

	public JTextField getEnderecoField() {
		return enderecoField;
	}

	public JTextField getHoraField() {
		return horaField;
	}

	public JTextField getHora2field() {
		return hora2field;
	}

	public JTextField getValorField() {
		return valorField;
	}

	public JTextField getDataField() {
		return dataField;
	}

	public JButton getAlugarButton() {
		return alugarButton;
	}
	
	
	
	
}
