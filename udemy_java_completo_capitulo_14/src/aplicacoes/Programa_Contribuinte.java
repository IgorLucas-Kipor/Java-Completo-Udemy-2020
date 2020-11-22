package aplicacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Contribuinte;
import entidades.Pessoa_Fisica;
import entidades.Pessoa_Juridica;

public class Programa_Contribuinte {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> lista = new ArrayList<>();
		
		System.out.print("Número de Contribuintes: ");
		
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Dados do contribuinte "+i);
			System.out.print("Indivíduo ou empresa (i/e)? ");
			char cr = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			Double rendaAnual = sc.nextDouble();
			if (cr == 'i' || cr == 'I') {
				System.out.print("Gastos com saúde: ");
				Double gastosSaude = sc.nextDouble();
				lista.add(new Pessoa_Fisica(nome, rendaAnual, gastosSaude));
			} else {
				System.out.print("Número de Empregados: ");
				Integer empregados = sc.nextInt();
				lista.add(new Pessoa_Juridica(nome, rendaAnual, empregados));
			}
		}
		
		System.out.println();
		System.out.println("IMPOSTOS PAGOS");
		Double impostoTotal = 0.0;
		
		for (Contribuinte c : lista) {
			System.out.printf("%s: $ %.2f%n", c.getNome(), c.imposto());
			impostoTotal += c.imposto();
		}
		
		System.out.println();
		
		System.out.printf("Imposto total: %.2f", impostoTotal);
		
		
		
		
		sc.close();
	}

}
