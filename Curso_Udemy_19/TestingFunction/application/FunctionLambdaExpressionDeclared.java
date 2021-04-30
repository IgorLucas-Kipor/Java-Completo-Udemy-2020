package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class FunctionLambdaExpressionDeclared {
	
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
//		A função map é uma função que aplica uma função a todos os elementos de uma stream (sequência de dados)
		
		Function<Product, String> func = p -> p.getName().toUpperCase();
		
		List<String> names = list.stream().map(func).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
	}

}
