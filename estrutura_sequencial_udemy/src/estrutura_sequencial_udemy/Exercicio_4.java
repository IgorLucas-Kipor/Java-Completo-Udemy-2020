//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
//hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
//decimais.


package estrutura_sequencial_udemy;
import java.util.Locale;
import java.util.Scanner;
public class Exercicio_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numero;
		Double numeroHoras, valorHora, salario;
		System.out.print("Insira o n�mero do funcion�rio: ");
		numero = sc.nextInt();
		System.out.print("Insira o n�mero de horas trabalhadas do funcion�rio: ");
		numeroHoras = sc.nextDouble();
		System.out.print("Insira o valor da hora trabalhada: ");
		valorHora = sc.nextDouble();
		salario = numeroHoras * valorHora;
		Locale.setDefault(Locale.US);
		System.out.println("N�mero = "+numero);
		System.out.printf("Sal�rio = $%.2f%n", salario);
		sc.close();
	}
}
