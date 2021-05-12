package estrutura_repetitiva_udemy;

//Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
//Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando
//essas informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

import java.util.Scanner;
public class Exercicio_2_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valores, valor, in=0, out=0;
		System.out.print("Insira quantos valores ser�o lidos: ");
		valores = sc.nextInt();
		for (int i=0; i < valores; i++) {
			System.out.print("Por favor, insira o "+(i+1)+"� valor: ");
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
