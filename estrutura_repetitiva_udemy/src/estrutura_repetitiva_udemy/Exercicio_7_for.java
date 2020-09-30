package estrutura_repetitiva_udemy;

//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//exemplo

import java.util.Scanner;
public class Exercicio_7_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, quadrado, cubo;
		System.out.print("Insira um número inteiro positivo: ");
		n = sc.nextInt();
		if (n>0) {
			for (int i=1; i<=n; i++) {
				System.out.print(i+" ");
				quadrado = (i*i);
				System.out.print(quadrado+" ");
				cubo = (i*i*i);
				System.out.print(cubo+" ");
				System.out.println();
			}
		} else {
			System.err.println("Valor inserido não é positivo.");
		}
		sc.close();
	}

}
