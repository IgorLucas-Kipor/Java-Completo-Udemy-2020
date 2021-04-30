package comparators;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return p2.getPrice().compareTo(p1.getPrice());
	}

}
