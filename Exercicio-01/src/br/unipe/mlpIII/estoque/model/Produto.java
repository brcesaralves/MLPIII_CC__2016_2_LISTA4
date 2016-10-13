package br.unipe.mlpIII.estoque.model;

public class Produto implements Comparable<Produto>{
	
	private int codigo;
	private String nome;
	private double valor;
	
	
	public Produto(int codigo, String nome, double valor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int compareTo(Produto p){
		if (this.codigo < p.codigo) {
			return -1;
		}
		if (this.codigo > p.codigo) {
			return 1;
		}
		return 0;
	}
	
}
