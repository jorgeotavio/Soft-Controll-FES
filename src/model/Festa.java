package model;

import java.util.Date;

public class Festa {
	
	private Tema tema;
	private String endereco;
	private Date data;
	private double valor;
	private int hora0, hora1;
	
	public Festa(Tema tema, String endereco, int hora0, int hora1, Date data, double valor) {
		this.tema     = tema;
		this.endereco = endereco;
		this.hora0    = hora0;
		this.hora1    = hora1;
		this.data     = data;
		this.valor    = valor;
		
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
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

	public int getHora0() {
		return hora0;
	}

	public void setHora0(int hora0) {
		this.hora0 = hora0;
	}

	public int getHora1() {
		return hora1;
	}

	public void setHora1(int hora1) {
		this.hora1 = hora1;
	}
	
	
	
	
}
