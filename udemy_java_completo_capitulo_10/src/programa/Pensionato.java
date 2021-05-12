package programa;

import aplicacao.Estudantes;
import java.util.Scanner;
public class Pensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Estudantes[] quartosAlugados = new Estudantes[10];
		
		System.out.print("Insira quantos estudantes vão alugar quartos: ");
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println((i+1)+"º aluguel:");
			System.out.print("Insira o nome do estudante: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Insira o e-mail do estudante: ");
			String email = sc.nextLine();
			System.out.print("Insira o quarto escolhido pelo estudante: ");
			int quarto = sc.nextInt();
			quartosAlugados[quarto] = new Estudantes(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos alugados: ");
		
		for (int i=0; i<quartosAlugados.length; i++) {
			if (quartosAlugados[i] != null) {
				System.out.println(i+": "+quartosAlugados[i]);
			}
		}
				
		sc.close();

	}

}
