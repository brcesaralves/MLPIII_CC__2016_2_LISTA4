package br.unipe.mlpIII.pdv.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.unipe.mlpIII.pdv.model.Item;

public class Principal {

	public static void main(String[] args) {

		Item item;
		List<Item> itens = new ArrayList<>();

		item = new Item(123, "Fonte ATX 500W", 359.90);
		itens.add(item);
		
		item = new Item(771, "Placa de Vídeo GTX 950", 1059.90);
		itens.add(item);

		item = new Item(342, "Memoria DDR4 8GB", 234.99);
		itens.add(item);

		item = new Item(342, "Memoria DDR4 8GB", 234.99);
		itens.add(item);

		item = new Item(760, "SSD 500 GB", 759.90);
		itens.add(item);


		// IMPRIMINDO ARRAYLIST
		System.out.println("============ Lista Ordem Natural ==============");
		for (Item i : itens) {
			System.out.println(i.toString() + "\n");
		}
		System.out.println("===============================================");
		
		// IMPRIMINDO ARRAYLIST com sort
		Collections.sort(itens);
		System.out.println("============== Lista Ordenada =================");
		for (Item i : itens) {
			System.out.println(i.toString() + "\n");
		}
		System.out.println("===============================================");

		// IMPRIMINDO ARRAYLIST com reverse
		Collections.reverse(itens);
		System.out.println("================ Lista Reversa =================");
		for (Item i : itens) {
			System.out.println(i.toString() + "\n");
		}
		System.out.println("===============================================");

	}

}
