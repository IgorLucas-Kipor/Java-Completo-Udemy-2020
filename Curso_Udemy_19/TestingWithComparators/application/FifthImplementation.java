package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class FifthImplementation {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Cellphone", 500.0));
		list.add(new Product("Television", 800.0));
		list.add(new Product("Xbox", 499.99));
		list.add(new Product("Computer", 1200.0));
		list.add(new Product("Rubber Duck", 1.99));
		
		list.sort((p1, p2) -> p2.getPrice().compareTo(p1.getPrice()));
		
		System.out.println("In order of most expensive: ");
		System.out.println();
		for (Product p : list) {
			System.out.println(p);
		}
		

	}

}