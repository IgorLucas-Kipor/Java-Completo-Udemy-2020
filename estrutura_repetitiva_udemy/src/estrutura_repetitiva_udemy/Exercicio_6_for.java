package estrutura_repetitiva_udemy;

//Ler um número inteiro N e calcular todos os seus divisores

import java.util.Scanner;
public class Exercicio_6_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, div;
		System.out.print("Insira um número inteiro: ");
		n = sc.nextInt();
		for (int i = 1; i<=n; i++) {
			div = n % i;
			if (div == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
