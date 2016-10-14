package br.unipe.mlpIII.estoque.model.test;

import br.unipe.mlpIII.estoque.model.Produto;
import junit.framework.TestCase;

public class TestProduto extends TestCase{
	
	public void testCompareTo(){
		Produto produto1 = new Produto(123456, "Xbox", 1599.90);
		Produto produto2 = new Produto(333451, "Play Station", 1299.90);
		
		assertEquals(produto1.compareTo(produto2), -1);
		
	}
	
}
