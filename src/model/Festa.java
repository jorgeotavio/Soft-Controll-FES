package model;

import java.sql.Time;
import java.util.Date;

public class Festa {
	
	private String tema;
	private String endereco;
	private Date data;
	private double valor;
	private Time hora0, hora1;
	
	public Festa(String tema, String endereco, Time hora0, Time hora1, Date data, double valor) {
		this.tema     = tema;
		this.endereco = endereco;
		this.hora0    = hora0;
		this.hora1    = hora1;
		this.data     = data;
		this.valor    = valor;
		
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Time getHora0() {
		return hora0;
	}

	public void setHora0(Time hora0) {
		this.hora0 = hora0;
	}

	public Time getHora1() {
		return hora1;
	}

	public void setHora1(Time hora1) {
		this.hora1 = hora1;
	}
	
	
	
	
}
