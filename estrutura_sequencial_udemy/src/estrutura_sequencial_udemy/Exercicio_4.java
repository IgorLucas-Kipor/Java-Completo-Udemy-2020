//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.


package estrutura_sequencial_udemy;
import java.util.Locale;
import java.util.Scanner;
public class Exercicio_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numero;
		Double numeroHoras, valorHora, salario;
		System.out.print("Insira o número do funcionário: ");
		numero = sc.nextInt();
		System.out.print("Insira o número de horas trabalhadas do funcionário: ");
		numeroHoras = sc.nextDouble();
		System.out.print("Insira o valor da hora trabalhada: ");
		valorHora = sc.nextDouble();
		salario = numeroHoras * valorHora;
		Locale.setDefault(Locale.US);
		System.out.println("Número = "+numero);
		System.out.printf("Salário = $%.2f%n", salario);
		sc.close();
	}
}
