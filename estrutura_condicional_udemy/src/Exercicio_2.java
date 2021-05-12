//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;
public class Exercicio_2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Integer numero;
	System.out.print("Insira um número inteiro: ");
	numero = sc.nextInt();
	if (numero % 2 == 0) {
		System.out.println("O número inserido é par.");
	} else {
		System.out.println("O número inserido é ímpar.");
	}
	sc.close();
}
}
