//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.


import java.util.Scanner;
public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numero;
		System.out.print("Por favor, insira um n�mero inteiro: ");
		numero = sc.nextInt();
		if (numero >= 0) {
			System.out.println("O n�mero inserido � positivo.");
		} else {
			System.out.println("O n�mero inserido � negativo.");
		}
		sc.close();
	}

}
