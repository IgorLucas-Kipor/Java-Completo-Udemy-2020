//Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
//c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.

package estrutura_sequencial_udemy;

import java.util.Locale;
import java.util.Scanner;
public class Exercicio_5 {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	int codigo1, numero1, codigo2, numero2;
	double valor1, valor2, total;
	System.out.print("Insira o codigo da pe�a 1: ");
	codigo1 = sc.nextInt();
	System.out.print("Insira o numero de pe�as 1: ");
	numero1 = sc.nextInt();
	System.out.print("Insira o pre�o da pe�a 1: ");
	valor1 = sc.nextDouble();
	System.out.print("Insira o codigo da pe�a 2: ");
	codigo2 = sc.nextInt();
	System.out.print("Insira o numero de pe�as 2: ");
	numero2 = sc.nextInt();
	System.out.print("Insira o valor da pe�a 2: ");
	valor2 = sc.nextDouble();
	total = valor1 * numero1 + valor2* numero2;
	System.out.printf("Valor a pagar = R$%.2f%n", total);
	sc.close();
	}
}
