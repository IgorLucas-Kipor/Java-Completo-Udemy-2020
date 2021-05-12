package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalPaymentFee;

public class Program2 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter contract data:");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		sc.nextLine();
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		double totalAmount = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalAmount);
		
		System.out.print("Enter number os installments: ");
		int months = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalPaymentFee());
		
		contractService.processContract(contract, months);
		
		System.out.println("Installments:");
		
		for (Installment i : contract.getInstallments()) {
			System.out.println(i);
		}
		
		sc.close();

	}

}
