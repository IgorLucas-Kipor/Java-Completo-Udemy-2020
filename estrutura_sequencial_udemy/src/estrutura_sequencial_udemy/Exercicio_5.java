//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

package estrutura_sequencial_udemy;

import java.util.Locale;
import java.util.Scanner;
public class Exercicio_5 {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	int codigo1, numero1, codigo2, numero2;
	double valor1, valor2, total;
	System.out.print("Insira o codigo da peça 1: ");
	codigo1 = sc.nextInt();
	System.out.print("Insira o numero de peças 1: ");
	numero1 = sc.nextInt();
	System.out.print("Insira o preço da peça 1: ");
	valor1 = sc.nextDouble();
	System.out.print("Insira o codigo da peça 2: ");
	codigo2 = sc.nextInt();
	System.out.print("Insira o numero de peças 2: ");
	numero2 = sc.nextInt();
	System.out.print("Insira o valor da peça 2: ");
	valor2 = sc.nextDouble();
	total = valor1 * numero1 + valor2* numero2;
	System.out.printf("Valor a pagar = R$%.2f%n", total);
	sc.close();
	}
}
