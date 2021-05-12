package aplicacao;

import java.util.Scanner;

import modelo.entidade.Conta;
import modelo.excecoes.BalanceException;

public class ProgramaConta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Entre os dados da conta");
			System.out.print("Número: ");
			int numero = sc.nextInt();
			System.out.print("Proprietário: ");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.print("Entre o saldo inicial: ");
			double saldo = sc.nextDouble();
			System.out.print("Limite de saque: ");
			double limiteSaque = sc.nextDouble();
			Conta conta = new Conta(numero, nome, saldo, limiteSaque);
			System.out.println();
			
			System.out.print("Entre a quantia a sacar: ");
			double saque = sc.nextDouble();
			conta.saque(saque);
		}
		catch (BalanceException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Erro inesperado.");
		}
		
		
		
		sc.close();

	}

}
