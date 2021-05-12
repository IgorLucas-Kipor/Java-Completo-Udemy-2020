package estrutura_repetitiva_udemy;

//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

import java.util.Scanner;
public class Exercicio_2_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=1, y=1;
		
		while (x!=0 && y!=0) {
			System.out.print("Insira o valor de x: ");
			x = sc.nextInt();
			System.out.print("Insira o valor de y: ");
			y = sc.nextInt();
			if (x>0 && y>0) {
				System.out.println("Coordenadas no primeiro quadrante.");
			} else if (x<0 && y>0) {
				System.out.println("Coordenadas no segundo quadrante.");
			} else if (x>0 && y<0) {
				System.out.println("Coordenadas no quarto quadrante.");
			} else if (x<0 && y<0) {
				System.out.println("Coordenadas no terceiro quadrante.");
			}
		}
		
		sc.close();

	}

}
