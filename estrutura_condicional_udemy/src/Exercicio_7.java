//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação.

import java.util.Scanner;
public class Exercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double x, y;
		System.out.print("Insira o valor de x: ");
		x = sc.nextDouble();
		System.out.print("Insira o valor de y: ");
		y = sc.nextDouble();
		if (x>=0 && y>0) {
			System.out.println("Eixo Q1.");
		} else if (x<=0 && y>0) {
			System.out.println("Eixo Q2.");
		} else if (x>=0 && y<0) {
			System.out.println("Eixo Q4.");
		} else if (x<=0 && y<0) {
			System.out.println("Eixo Q3.");
		} else if (x == 0 && y == 0) {
			System.out.println("Origem.");
		}
		else {
			System.err.print("Coordenada não válida.");
		}
		sc.close();
	}

}
