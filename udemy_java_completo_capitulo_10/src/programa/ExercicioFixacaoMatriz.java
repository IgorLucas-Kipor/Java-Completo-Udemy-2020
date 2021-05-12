package programa;

import java.util.Scanner;

public class ExercicioFixacaoMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int matriz[][] = new int[m][n];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		int x = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == x) {
					System.out.println("Posição: " + i + "," + j);
					if (j > 0) {
						System.out.println("Esquerda: " + matriz[i][j - 1]);
					}
					if (j < matriz[i].length - 1) {
						System.out.println("Direita: " + matriz[i][j + 1]);
					}
					if (i < matriz.length - 1) {
						System.out.println("Embaixo: " + matriz[i + 1][j]);
					}
					if (i > 0) {
						System.out.println("Em cima: " + matriz[i - 1][j]);
					}
				}
			}
		}

		sc.close();
	}

}
