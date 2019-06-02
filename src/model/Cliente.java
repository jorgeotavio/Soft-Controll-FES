package model;

public class Cliente {
	
	private String nome;
	private  String telefone;
	private boolean antigo;
	
	public Cliente(String nome, String telefone, boolean antigo) {
		this.nome = nome;
		this.telefone = telefone;
		this.antigo = antigo;
	}
	
	public boolean isAntigo() {
		return antigo;
	}

	public void setAntigo(boolean antigo) {
		this.antigo = antigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
