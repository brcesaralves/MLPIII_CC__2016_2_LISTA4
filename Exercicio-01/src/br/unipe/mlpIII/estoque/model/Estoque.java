package br.unipe.mlpIII.estoque.model;

import java.util.HashSet;
import java.util.Set;

public class Estoque {
	
	private String nome;
	private Set<Produto> listaProdutos = new HashSet<>();
	
		
	public Estoque(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Set<Produto> getListaProdutos() {
		return listaProdutos;
	}
	
	public void setListaProdutos(Produto produto) {
		this.listaProdutos.add(produto);
	}
	
	public void listarEstoque(){
		System.out.println("================== " + this.nome + " ==================");
		
		for(Produto p : listaProdutos){
			System.out.println("Código: " + p.getCodigo());
			System.out.println("Nome: " + p.getNome());
			System.out.println("Valor: " + p.getValor() + "\n");
		}
		
	}

}
