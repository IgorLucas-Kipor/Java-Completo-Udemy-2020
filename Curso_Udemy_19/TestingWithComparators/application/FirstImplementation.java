package application;

import java.util.ArrayList;
import java.util.List;
import comparators.MyComparator;
import entities.Product;

public class FirstImplementation {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Cellphone", 500.0));
		list.add(new Product("Television", 800.0));
		list.add(new Product("Xbox", 499.99));
		list.add(new Product("Computer", 1200.0));
		list.add(new Product("Rubber Duck", 1.99));
		
		list.sort(new MyComparator());
		
		System.out.println("In order of most expensive: ");
		System.out.println();
		for (Product p : list) {
			System.out.println(p);
		}
		

	}

}
