package estrutura_sequencial_udemy;

//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

import java.util.Scanner;
public class Exercicio_1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a, b;
	
	System.out.print("Por favor, insira o valor de a: ");
	a = sc.nextInt();
	System.out.print("Por favor, insira o valor de b: ");
	b = sc.nextInt();
	
	System.out.println("SOMA = "+(a+b));
	
	
	sc.close();
}
}
