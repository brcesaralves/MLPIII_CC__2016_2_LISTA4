package br.unipe.mlpIII.estoque.model.test;

import br.unipe.mlpIII.estoque.model.Produto;
import junit.framework.TestCase;

public class TestProduto extends TestCase{
	
	private Produto produto1;
	private Produto produto2;
	
	
	public void setUp(){
		produto1 = new Produto(123456, "Xbox", 1599.90);
		produto2 = new Produto(567556, "Play Station", 1299.90);
	}
	
	public void tearDown(){
		produto1 = null;
		produto2 = null;
	}
	
	public void testCompareTo(){
		
		assertEquals(produto1.compareTo(produto2), -1);
		
	}
	
}
