package estrutura_sequencial_udemy;

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = pi . raio2
//Considere o valor de pi = 3.14159

import java.util.Locale;
import java.util.Scanner;
public class Exercicio_2 {
	static final Double PI = 3.14159;
public static void main(String[] args) {
	Double raio, area;
	Scanner sc = new Scanner(System.in);
	System.out.print("Insira o valor do raio: ");
	raio = sc.nextDouble();
	area = PI * Math.pow(raio, 2);
	Locale.setDefault(Locale.US);
	System.out.printf("A=%.4f%n", area);
	sc.close();
}
}
