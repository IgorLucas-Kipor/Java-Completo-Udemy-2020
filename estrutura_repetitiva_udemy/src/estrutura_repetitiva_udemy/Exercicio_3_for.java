package estrutura_repetitiva_udemy;

//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//peso 5

import java.util.Scanner;
public class Exercicio_3_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casosTeste;
		System.out.print("Insira quantos casos de teste serão feitos:");
		casosTeste = sc.nextInt();
		double valor1, valor2, valor3, mp;
		
		for (int i=0; i < casosTeste; i++) {
			System.out.println("Insira o valor 1: ");
			valor1 = sc.nextDouble();
			System.out.println("Insira o valor 2: ");
			valor2 = sc.nextDouble();
			System.out.println("Insira o valor 3: ");
			valor3 = sc.nextDouble();
			mp = (valor1*2+valor2*3+valor3*5) / (2+3+5);
			System.out.printf("Média ponderada: %.1f%n", mp);
		}
		
		sc.close();
	}

}
