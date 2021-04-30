package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class SecondImplementation {
	
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Cellphone", 500.0));
		list.add(new Product("Television", 800.0));
		list.add(new Product("Xbox", 499.99));
		list.add(new Product("Computer", 1200.0));
		list.add(new Product("Rubber Duck", 1.99));
		
		Comparator<Product> comp = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				return p2.getPrice().compareTo(p1.getPrice());
			}
			
		};
		
		list.sort(comp);
		
		System.out.println("In order of most expensive: ");
		System.out.println();
		for (Product p : list) {
			System.out.println(p);
		}
		

	}

}


