package estrutura_repetitiva_udemy;

//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 at� X, um valor por linha, inclusive o
//X, se for o caso.

import java.util.Scanner;
public class Exercicio_1_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, impar;
		System.out.print("Por favor, insira um n�mero inteiro de 1 a 1000: ");
		numero = sc.nextInt();
		if (numero >=1 && numero <= 1000) {
			for (int i = 1; i <= numero; i++) {
				impar = i % 2;
				if (impar != 0) {
					System.out.println(i);
				}
			}
		} else {
			System.err.println("N�mero fora do intervalo permitido.");
		}
		sc.close();
	}

}
