//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.

import java.util.Scanner;
public class Exercicio_2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Integer numero;
	System.out.print("Insira um n�mero inteiro: ");
	numero = sc.nextInt();
	if (numero % 2 == 0) {
		System.out.println("O n�mero inserido � par.");
	} else {
		System.out.println("O n�mero inserido � �mpar.");
	}
	sc.close();
}
}
