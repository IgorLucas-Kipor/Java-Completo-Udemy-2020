package estrutura_repetitiva_udemy;

//Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas,
//come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme
//exemplo

import java.util.Scanner;
public class Exercicio_7_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, quadrado, cubo;
		System.out.print("Insira um n�mero inteiro positivo: ");
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
			System.err.println("Valor inserido n�o � positivo.");
		}
		sc.close();
	}

}
