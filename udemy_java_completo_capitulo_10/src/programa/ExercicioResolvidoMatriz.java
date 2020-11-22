package programa;

import java.util.Scanner;

public class ExercicioResolvidoMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal:");
		
		for (int i=0; i<n; i++) {
			System.out.print(mat[i][i]+" ");
		}
		
		
		int i=0;
		
		for (int j=0; j<n; j++) {
			for (int b=0; b<n; b++) {
				if (mat[j][b] < 0) {
					i++;
				}
			}
		}
		System.out.println("Número de números negativos: "+i);
		sc.close();

	}

}
