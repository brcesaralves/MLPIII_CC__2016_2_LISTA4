package br.unipe.mlpIII.pdv.model;


public class Item implements Comparable<Item>{
	private int codigo;
	private String descricao;
	private double preco;
		
		
	public Item(int codigo, String descricao, double preco) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int compareTo(Item i){
		if (this.codigo < i.codigo) {
			return -1;
		}
		if (this.codigo > i.codigo) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Código: " + codigo + "\nDescrição: " + descricao + "\nPreço: " + preco;
	}
	
	

}
