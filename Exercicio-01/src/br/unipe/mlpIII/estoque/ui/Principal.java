package br.unipe.mlpIII.estoque.ui;

import java.util.HashSet;
import java.util.Set;

import br.unipe.mlpIII.estoque.model.Estoque;
import br.unipe.mlpIII.estoque.model.Produto;

public class Principal {
	
	public static void main(String[] args) {
		
		Produto produto;
		Estoque estoque;
		Set<Estoque> estoques = new HashSet<>();
		
		
		estoque = new Estoque("Estoque Central");

		produto = new Produto(12, "Notebook Dell Vostro", 3599.90);
		estoque.setListaProdutos(produto);
		produto = new Produto(17, "HD Externo WD 1TB", 359.90);
		estoque.setListaProdutos(produto);
		
		estoques.add(estoque);
		
		
		estoque = new Estoque("Estoque Setorial - 01");
		
		produto = new Produto(12, "Notebook Lenovo", 2599.90);
		estoque.setListaProdutos(produto);
		
		produto = new Produto(17, "Impressora Epson L350", 399.90);
		estoque.setListaProdutos(produto);
		
		estoques.add(estoque);
		
		
		for(Estoque est : estoques){
			est.listarEstoque();
		}
		
	}

}
