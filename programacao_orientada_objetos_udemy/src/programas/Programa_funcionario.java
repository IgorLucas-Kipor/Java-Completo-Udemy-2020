package programas;

import entidades.Funcionario;
import java.util.Scanner;
public class Programa_funcionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Insira o nome do funcion�rio: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Insira o sal�rio bruto do funcion�rio: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Insira o imposto do funcion�rio: ");
		funcionario.imposto = sc.nextDouble();
		System.out.println();
		System.out.println(funcionario);
		System.out.print("Insira a porcentagem na qual aumentar o salario do funcion�rio: ");
		double porcentagem = sc.nextDouble();
		funcionario.aumento(porcentagem);
		System.out.println(funcionario);
		
		sc.close();

	}

}
