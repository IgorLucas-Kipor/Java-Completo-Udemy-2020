package estrutura_repetitiva_udemy;

//Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta � o valor 2002.

import java.util.Scanner;
public class Exercicio_1_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=0;
		
		while (x != 2002) {
			System.out.print("Por favor, insira a senha de quatro d�gitos: ");
			x = sc.nextInt();
			if (x != 2002) {
				System.out.println("Senha Inv�lida.");
			}
		}
		
		System.out.println("Acesso Permitido.");
		sc.close();
	}

}
