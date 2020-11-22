package aplicacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.ER_Empregado;
import entidades.ER_Empregado_Terceirizado;

public class Programa_ER {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionários serão lidos? ");
		int n = sc.nextInt();
		
		List<ER_Empregado> lista = new ArrayList<>();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados do funcionário "+i);
			System.out.print("Terceirizado (s/n)? ");
			char terceirizado = sc.next().charAt(0);
			if (terceirizado != 's' && terceirizado != 'n' && terceirizado != 'N' && terceirizado != 'S') {
				System.err.println("Valor inválido.");
				System.exit(1);
			}
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			Integer horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			Double valorHora = sc.nextDouble();
			if (terceirizado == 's' || terceirizado == 'S') {
				System.out.print("Valor adicional: ");
				Double valorAdicional = sc.nextDouble();
				lista.add(new ER_Empregado_Terceirizado (nome, horas, valorHora, valorAdicional));
			}
			else {
				lista.add(new ER_Empregado (nome, horas, valorHora));
			}
		}
		
		System.out.println();
		System.out.println("PAGAMENTO:");
		for (ER_Empregado e : lista) {
			System.out.println(e.getNome() + " - $ " + String.format("%.2f", e.pagamento()));
		}
		
		
		sc.close();
	}

}
