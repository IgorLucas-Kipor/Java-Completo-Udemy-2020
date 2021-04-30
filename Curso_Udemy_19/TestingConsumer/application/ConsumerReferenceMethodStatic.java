package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ConsumerReferenceMethodStatic {
	
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.forEach(Product::priceStaticUpdate);
		
		list.forEach(System.out::println);

	}

}
