package br.unipe.mlpIII.pdv.model.test;

import br.unipe.mlpIII.pdv.model.Item;
import junit.framework.TestCase;

public class TestItem extends TestCase{
	
	private Item item1;
	private Item item2;
	
	
	public void setUp(){
		item1 = new Item(123456, "Monitor Beng 21 IPS", 799.90);
		item2 = new Item(654362, "HD 1TB Seagate", 299.90);
	}
	
	public void tearDown(){
		item1 = null;
		item2 = null;
	}
	
	public void testCompareTo(){
		
		assertEquals(item1.compareTo(item2), -1);
		
	}
	
}
