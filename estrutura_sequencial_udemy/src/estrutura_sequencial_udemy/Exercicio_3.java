package estrutura_sequencial_udemy;

import java.util.Scanner;
public class Exercicio_3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a, b, c, d, diferenca;
	System.out.print("Por favor, insira o valor de a: ");
	a = sc.nextInt();
	System.out.print("Por favor, insira o valor de b: ");
	b = sc.nextInt();
	System.out.print("Por favor, insira o valor de c: ");
	c = sc.nextInt();
	System.out.print("Por favor, insira o valor de d: ");
	d = sc.nextInt();
	diferenca = (a*b - c*d);
	System.out.println("Diferença = "+diferenca);
	sc.close();
}
}
