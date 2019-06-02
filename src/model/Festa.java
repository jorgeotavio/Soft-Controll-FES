package model;

public class Festa {
	
	private int id;
	private String tema, hora0, hora1, endereco, data, cliente;
	private double valor;
	
	public Festa() {
		
	}
	public Festa(int id, String tema, String cliente, String endereco, String  data, double valor, String hora0, String hora1) {
		this.id 	  = id;
		this.tema     = tema;
		this.endereco = endereco;
		this.cliente  = cliente;
		this.hora0    = hora0;
		this.hora1    = hora1;
		this.data     = data;
		this.valor    = valor;
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getHora0() {
		return hora0;
	}

	public void setHora0(String hora0) {
		this.hora0 = hora0;
	}

	public String getHora1() {
		return hora1;
	}

	public void setHora1(String hora1) {
		this.hora1 = hora1;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
	
}
