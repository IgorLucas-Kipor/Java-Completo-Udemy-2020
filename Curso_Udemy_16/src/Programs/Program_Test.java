package Programs;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program_Test {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please insert the pathway to the file: ");
		
		String filePath = sc.nextLine();
		
		File path = new File(filePath);
		
		String sourceDirectory = path.getParent();
		
		boolean success = new File(sourceDirectory + "\\out").mkdir();
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
			String line = br.readLine();
			while (line != null) {
				String division[] = line.split(",");
				String name = division[0];
				double price = Double.parseDouble(division[1]);
				int amount = Integer.parseInt(division[2]);
				Product product = new Product(name, amount, price);
				products.add(product);
				line = br.readLine();
			} 
		} catch (IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(sourceDirectory+"\\out\\summary.csv"))) {
			for (Product product : products) {
				bw.write(product.getName()+": "+String.format("%.2f", product.total()));
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		
		
		sc.close();
	}

}
