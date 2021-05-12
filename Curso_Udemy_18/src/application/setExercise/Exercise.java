package application.setExercise;

import java.util.HashSet;
import java.util.Set;

public class Exercise {

	public static void main(String[] args) {

		Set<Integer> courseA = new HashSet<>();
		
		courseA.add(21);
		courseA.add(22);
		courseA.add(35);
		
		Set<Integer> courseB = new HashSet<>();
		
		courseB.add(21);
		courseB.add(50);
		
		Set<Integer> courseC = new HashSet<>();
		
		courseC.add(42);
		courseC.add(35);
		courseC.add(13);
		
		Set<Integer> total = new HashSet<>(courseA);
		
		total.addAll(courseB);
		total.addAll(courseC);
		
		System.out.println("How many students in course A? " + courseA.size());
		
		for (Integer student : courseA) {
			System.out.println(student);
		}
		
		System.out.println("How many students in course B? " + courseB.size());
		
		for (Integer student : courseB) {
			System.out.println(student);
		}
		
		
		System.out.println("How many students in course C? " + courseC.size());
		
		for (Integer student : courseC) {
			System.out.println(student);
		}
		
		System.out.println("Total students: " + total.size());

	}

}
