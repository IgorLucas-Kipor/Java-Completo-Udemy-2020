package estrutura_repetitiva_udemy;

//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

import java.util.Scanner;
public class Exercicio_2_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valores, valor, in=0, out=0;
		System.out.print("Insira quantos valores serão lidos: ");
		valores = sc.nextInt();
		for (int i=0; i < valores; i++) {
			System.out.print("Por favor, insira o "+(i+1)+"º valor: ");
			valor = sc.nextInt();
			if (valor >= 10 && valor <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println("Valores dentro do intervalo: "+in+".");
		System.out.println("Valores fora do intervalo: "+out+".");
		sc.close();
	}

}
