package estrutura_repetitiva_udemy;

//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por defini��o, fatorial de 0 � 1.

import java.util.Scanner;
public class Exercicio_5_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, fatorial=1;
		System.out.print("Insira o valor: ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			fatorial = fatorial * (n-i);
			if (n == 0) {
				fatorial = 1;
			}
		}
		System.out.println("Fatorial de "+n+": "+fatorial);
		sc.close();
	}
}
