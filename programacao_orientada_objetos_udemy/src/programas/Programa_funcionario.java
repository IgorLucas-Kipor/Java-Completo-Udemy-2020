package programas;

import entidades.Funcionario;
import java.util.Scanner;
public class Programa_funcionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Insira o nome do funcionário: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Insira o salário bruto do funcionário: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Insira o imposto do funcionário: ");
		funcionario.imposto = sc.nextDouble();
		System.out.println();
		System.out.println(funcionario);
		System.out.print("Insira a porcentagem na qual aumentar o salario do funcionário: ");
		double porcentagem = sc.nextDouble();
		funcionario.aumento(porcentagem);
		System.out.println(funcionario);
		
		sc.close();

	}

}
