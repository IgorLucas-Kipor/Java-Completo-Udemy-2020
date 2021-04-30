package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Comparator;
import entities.Employee;

public class Exercise2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			
			while(line != null) {
				String fields[] = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			Comparator<String> comp = (s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase());
			
			System.out.print("Enter salary: ");
			Double salary = sc.nextDouble();
			
			List<String> emails = list.stream()
					.filter(e -> e.getSalary() > salary)
					.map(e -> e.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			
			Double sum = list.stream()
					.filter(e -> e.getName().charAt(0) == 'M')
					.map(e -> e.getSalary())
					.reduce(0.0, (x, y) -> x+y);
			
			System.out.println("E-mail of people whose salary is more than " + String.format("%.2f", salary) + ": ");
			
			emails.forEach(System.out::println);
			
			System.out.printf("Sum of salary of people whose name starts with 'M': %.2f", sum);
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		
		sc.close();

	}

}
