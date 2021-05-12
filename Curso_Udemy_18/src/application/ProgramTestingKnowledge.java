package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramTestingKnowledge {

	public static void main(String[] args) {

		List<Integer> myInts = new ArrayList<>();
		List<Double> myDoubles = new ArrayList<>();
		
		myInts = Arrays.asList(5, 8, 13, 12);
		myDoubles = Arrays.asList(1.13, 8.9, 32.54);
		
		List<Number> myNumbers = new ArrayList<>();
		
		copy(myInts, myNumbers);
		copy(myDoubles, myNumbers);
		
		System.out.println(myNumbers);
		

	}
	
	public static void copy(List<? extends Number> origin, List<? super Number> destiny) {
		for (Number e : origin) {
			destiny.add(e);
		}
	}

}
