//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar

import java.util.Scanner;
public class Exercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double quantidade, preco;
		Integer codigo;
		System.out.print("Insira o código do produto desejado: ");
		codigo = sc.nextInt();
		switch(codigo) {
		case 1: System.out.print("Insira a quantidade desejada: ");
		quantidade = sc.nextDouble();
		preco = quantidade*4;
		System.out.printf("O total a pagar é R$%.2f.%n", preco);
		break;
		case 2: System.out.print("Insira a quantidade desejada: ");
		quantidade = sc.nextDouble();
		preco = quantidade*4.5;
		System.out.printf("O total a pagar é R$%.2f.%n", preco);
		break;
		case 3: System.out.print("Insira a quantidade desejada: ");
		quantidade = sc.nextDouble();
		preco = quantidade*5;
		System.out.printf("O total a pagar é R$%.2f.%n", preco);
		break;
		case 4: System.out.print("Insira a quantidade desejada: ");
		quantidade = sc.nextDouble();
		preco = quantidade*2;
		System.out.printf("O total a pagar é R$%.2f.%n", preco);
		break;
		case 5: System.out.print("Insira a quantidade desejada: ");
		quantidade = sc.nextDouble();
		preco = quantidade*1.5;
		System.out.printf("O total a pagar é R$%.2f.%n", preco);
		break;
		default: System.err.print("Produto inexistente.");
		System.exit(1);
		}
		sc.close();
	}
}
