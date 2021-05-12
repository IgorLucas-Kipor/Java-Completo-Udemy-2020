package entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService<Type> {
	
	private List<Type> list = new ArrayList<>();
	
	public void addValue (Type value) {
		list.add(value);
	}
	
	public Type getFirst() {
		if (list.isEmpty()) {
			throw new IllegalStateException("Error: list is empty.");
		} else {
			return list.get(0);
		}
	}
	
	public void print() {
		if (!list.isEmpty()) {
			System.out.println(list);
		} else {
			throw new IllegalStateException("List is empty.");
		}
	}
	
	

}
