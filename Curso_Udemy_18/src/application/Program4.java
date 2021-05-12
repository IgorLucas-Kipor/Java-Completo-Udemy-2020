package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program4 {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		
		copy(myDoubles, myObjs);
		
		printList(myObjs);

	}
	
	public static void copy(List<? extends Number> listOrigin, List<? super Number> listDestiny) {
		for (Number number : listOrigin) {
			listDestiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for (Object e : list) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

}
