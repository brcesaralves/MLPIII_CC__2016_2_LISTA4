package br.unipe.mlpIII.pdv.model.test;

import br.unipe.mlpIII.pdv.model.Item;
import junit.framework.TestCase;

public class TestItem extends TestCase{
	
	public void testCompareTo(){
		
		Item item1 = new Item(123456, "Monitor Beng 21 IPS", 799.90);
		Item item2 = new Item(555678, "HD 1TB Seagate", 299.90);
		
		assertEquals(item1.compareTo(item2), -1);
		
	}
	
}
