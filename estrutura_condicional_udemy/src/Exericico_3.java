//Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
//ordem crescente ou decrescente.

import java.util.Scanner;
public class Exericico_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a, b;
		System.out.print("Insira o valor de a: ");
		a = sc.nextInt();
		System.out.print("Insira o valor de b: ");
		b = sc.nextInt();
		if (a % b == 0 || b % a == 0) {
			System.out.println("Os valores inseridos s�o m�ltiplos.");
		} else {
			System.out.println("Os valores inseridos n�o s�o m�ltiplos.");
		}
		sc.close();
	}

}
