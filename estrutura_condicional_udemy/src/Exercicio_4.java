//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;
public class Exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaInicial, horaFinal, tempo;
		System.out.print("Insira a hora inicial do jogo: ");
		horaInicial = sc.nextInt();
		System.out.print("Insira a hora final do jogo: ");
		horaFinal = sc.nextInt();
		if (horaFinal <= horaInicial) {
			tempo = (24-horaInicial) + horaFinal;
		} else {
			tempo = horaFinal - horaInicial;
		}
		System.out.println("O tempo de jogo foi de "+tempo+" hora(s).");
		sc.close();
	}

}
