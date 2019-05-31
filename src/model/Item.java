package model;

public class Item {
	
	private String nomeItem;
	private int quantidadeItem;
	
	public Item(String nomeItem, int quantidadeItem) {
		this.nomeItem = nomeItem;
		this.quantidadeItem = quantidadeItem;
	}

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public int getQuantidadeItem() {
		return quantidadeItem;
	}

	public void setQuantidadeItem(int quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}
	
}
