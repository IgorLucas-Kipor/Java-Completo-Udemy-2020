package estrutura_repetitiva_udemy;

//Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"

import java.util.Scanner;
public class Exercicio_4_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double numero1, numero2, div=0;
		System.out.print("Insira quantas divis�es voc� deseja fazer: ");
		n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.print("Insira o primeiro n�mero: ");
			numero1 = sc.nextDouble();
			System.out.print("Insira o segundo n�mero: ");
			numero2 = sc.nextDouble();
			if (numero2 == 0) {
				System.out.println("Divis�o imposs�vel.");
			} else {
				div = numero1/numero2;
				System.out.println("Resultado da divis�o: "+div);
			}
		}
		sc.close();
	}

}
