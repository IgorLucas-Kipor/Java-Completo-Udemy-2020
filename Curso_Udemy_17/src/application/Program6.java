package application;

import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;

public class Program6 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		
		double amount = sc.nextDouble();
		
		System.out.print("Months: ");
		
		int months = sc.nextInt();
		
		System.out.println("Payment after "+months+" months:");
		
		InterestService interest = new BrazilInterestService(2.0);
		
		System.out.printf("%.2f", interest.payment(amount, months));

		sc.close();
	}

}
