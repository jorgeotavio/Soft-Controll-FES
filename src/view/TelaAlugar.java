package view;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javafx.scene.control.ComboBox;

@SuppressWarnings("serial")
public class TelaAlugar extends JFrame{
	
	@SuppressWarnings("unused")
	private JLabel temaLabel, 
				   enderecoLabel, 
				   valorLabel, 
				   horaInicioLabel, 
				   horaTerminoLabel, 
				   dataLabel;
	
	private JTextField enderecoField, 
					   valorField, 
					   horaInicioField, 
					   horaTerminoField, 
					   dataField;
	
	private ComboBox<String> temaDroPown;
	
	private JButton alugarButton, sairButton;
	
	public TelaAlugar() {}
	
	public void criarTela() {
		
		temaLabel			= new JLabel("Tema: "); 
		enderecoLabel 		= new JLabel("Endereço: ");
		valorLabel	 		= new JLabel("Valor: ");
		horaInicioLabel 	= new JLabel("Hora de inicio: ");
		horaTerminoLabel 	= new JLabel("Hora do término: ");
		dataLabel			= new JLabel("Data: ");
		
		temaDroPown 		= new ComboBox<String>();
		enderecoField 		= new JTextField(20);
		valorField			= new JTextField(); 
		horaInicioField		= new JFormattedTextField(); 
		horaTerminoField 	= new JFormattedTextField(); 
		dataField			= new JFormattedTextField();
		
	}

	public ComboBox<String> getTemaDroPown() {
		return temaDroPown;
	}

	public void setTemaDroPown(ComboBox<String> temaDroPown) {
		this.temaDroPown = temaDroPown;
	}

	public JTextField getEnderecoField() {
		return enderecoField;
	}

	public void setEnderecoField(JTextField enderecoField) {
		this.enderecoField = enderecoField;
	}

	public JTextField getValorField() {
		return valorField;
	}

	public void setValorField(JTextField valorField) {
		this.valorField = valorField;
	}

	public JTextField getHoraInicioField() {
		return horaInicioField;
	}

	public void setHoraInicioField(JTextField horaInicioField) {
		this.horaInicioField = horaInicioField;
	}

	public JTextField getHoraTerminoField() {
		return horaTerminoField;
	}

	public void setHoraTerminoField(JTextField horaTerminoField) {
		this.horaTerminoField = horaTerminoField;
	}

	public JTextField getDataField() {
		return dataField;
	}

	public void setDataField(JTextField dataField) {
		this.dataField = dataField;
	}

	public JButton getAlugarButton() {
		return alugarButton;
	}

	public void setAlugarButton(JButton alugarButton) {
		this.alugarButton = alugarButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}

	public void setSairButton(JButton sairButton) {
		this.sairButton = sairButton;
	}
	
	
}
