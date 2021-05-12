package programas;


import java.util.Scanner;
import java.util.Locale;
import entidades.Aluno;
public class Programa_aluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.print("Insira o nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.print("Insira a nota do aluno no primeiro trimestre (0 a 30): ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("Insira a nota do aluno no segundo trimestre (0 a 35): ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("Insira a nota do aluno no terceiro trimestre (0 a 35): ");
		aluno.nota3 = sc.nextDouble();
		if (aluno.notaFinal() >= 60) {
			System.out.printf("O aluno foi aprovado com uma nota de %.2f. Parabéns!%n", aluno.notaFinal());
		} else {
			System.out.printf("O aluno foi reprovado com uma nota de %.2f, faltando %.2f pontos para a sua aprovação.%n", aluno.notaFinal(), aluno.faltando());
		}
		sc.close();
	}

}
