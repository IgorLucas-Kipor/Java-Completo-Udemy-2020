
import java.util.Scanner;
public class Exercicio_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double salario, imposto;
		System.out.print("Insira o salário: ");
		salario = sc.nextDouble();
		if (salario <= 2000) {
			System.out.println("Isento.");
		} else if (salario >= 2000.01 && salario <= 3000) {
			imposto = (salario - 2000) * 0.08;
			System.out.printf("O imposto a ser pago é de R$%.2f.%n", imposto);
		} else if (salario >= 3000.01 && salario <= 4500) {
			imposto = (1000 * 0.08) + ((salario - 3000) * 0.18);
			System.out.printf("O imposto a ser pago é de R$%.2f.%n", imposto);
		} else if (salario > 4500) {
			imposto = (1000 *0.08) + (1500 * 0.18) + ((salario - 4500) * 0.28);
			System.out.printf("O imposto a ser pago é de R$%.2f.%n", imposto);
		}
		sc.close();
	}
}
