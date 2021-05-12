//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

package estrutura_sequencial_udemy;

import java.util.Locale;
import java.util.Scanner;
public class Exercicio_6 {
	static final float PI = 3.14159f;
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	float a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
	Scanner sc = new Scanner(System.in);
	System.out.print("Insira o valor de a: ");
	a = sc.nextFloat();
	System.out.print("Insira o valor de b: ");
	b = sc.nextFloat();
	System.out.print("Insira o valor de c: ");
	c = sc.nextFloat();
	areaTriangulo = (a*c) / 2;
	areaCirculo = PI * (c*c);
	areaTrapezio = ((a+b) / 2) * c;
	areaQuadrado = b*b;
	areaRetangulo = a*b;
	System.out.printf("Triângulo = %.3f%nCírculo = %.3f%nTrapézio = %.3f%nQuadrado = %.3f%nRetângulo = %.3f%n", areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);
	sc.close();
	}
}
