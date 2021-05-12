package estrutura_repetitiva_udemy;

//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//X, se for o caso.

import java.util.Scanner;
public class Exercicio_1_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, impar;
		System.out.print("Por favor, insira um número inteiro de 1 a 1000: ");
		numero = sc.nextInt();
		if (numero >=1 && numero <= 1000) {
			for (int i = 1; i <= numero; i++) {
				impar = i % 2;
				if (impar != 0) {
					System.out.println(i);
				}
			}
		} else {
			System.err.println("Número fora do intervalo permitido.");
		}
		sc.close();
	}

}
