//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.


import java.util.Scanner;
public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numero;
		System.out.print("Por favor, insira um número inteiro: ");
		numero = sc.nextInt();
		if (numero >= 0) {
			System.out.println("O número inserido é positivo.");
		} else {
			System.out.println("O número inserido é negativo.");
		}
		sc.close();
	}

}
