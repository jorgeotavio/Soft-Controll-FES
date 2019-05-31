package model;

import java.util.ArrayList;

public class Tema {
	
	private String nomeTema;
	private static ArrayList<Item> itens = new ArrayList<>();
	
	public Tema(String nomeTema) {
		this.nomeTema = nomeTema;
	}
	
	public void cadastrarItem(String nome, Item item) {
		itens.add(item);
	}

	public String getNomeTema() {
		return nomeTema;
	}

	public void setNomeTema(String nomeTema) {
		this.nomeTema = nomeTema;
	}

	public static ArrayList<Item> getItens() {
		return itens;
	}
	
	
}
