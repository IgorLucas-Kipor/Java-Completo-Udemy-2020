package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;

public class FunctionReferenceMethodNonStatic {
	
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
//		A fun��o map � uma fun��o que aplica uma fun��o a todos os elementos de uma stream (sequ�ncia de dados)
		
		List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
	}

}
