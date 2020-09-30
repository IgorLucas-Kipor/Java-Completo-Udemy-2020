//Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
//mostre:
//a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
//b) a �rea do c�rculo de raio C. (pi = 3.14159)
//c) a �rea do trap�zio que tem A e B por bases e C por altura.
//d) a �rea do quadrado que tem lado B.
//e) a �rea do ret�ngulo que tem lados A e B.

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
	System.out.printf("Tri�ngulo = %.3f%nC�rculo = %.3f%nTrap�zio = %.3f%nQuadrado = %.3f%nRet�ngulo = %.3f%n", areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);
	sc.close();
	}
}
