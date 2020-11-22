package application;


import java.util.Scanner;
import entities.ProgramaBanco;
public class Banco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o n�mero da conta: ");
		short numero = sc.nextShort();
		double deposito = 0, verificador=0, verificador2=0;
		char escolha='x', escolha2='x', escolha3='x';
		System.out.print("Insira o nome do titular da conta: ");
		String nome = sc.nextLine();
		nome = sc.nextLine();
		do {
			System.out.print("Voc� far� um dep�sito inicial? Insira (s)im ou (n)�o: ");
			char depositoInicial = sc.next().charAt(0);
			if (depositoInicial == 's') {
				System.out.print("Insira a quantia a ser depositada: ");
				deposito = sc.nextDouble();
				if (deposito > 0) {
					verificador = 1;
				} else {
					System.err.println("Valor inserido inv�lido. Por favor, insira um valor v�lido.");
				}
			} else if (depositoInicial == 'n') {
				verificador = 1;
			} else {
				System.err.println("Valor inserido inv�lido. Por favor, insira um valor v�lido.");
			}
		} while (verificador != 1);
		
		ProgramaBanco programa = new ProgramaBanco(nome, numero, deposito);
		
		System.out.println(programa);
		
		do {
			System.out.print("Voc� deseja mudar seu nome? Insira (s)im ou qualquer outro caracter para n�o: ");
			
			escolha2 = sc.next().charAt(0);
			
			if (escolha2 == 's') {
				System.out.print("Insira seu novo nome completo: ");
				programa.setNome(sc.nextLine());
				programa.setNome(sc.nextLine());
			}
			
			System.out.print("Voc� deseja fazer um dep�sito? Insira (s)im ou qualquer outro caractere para n�o: ");
			
			escolha3 = sc.next().charAt(0);
			
			if (escolha3 == 's') {
				System.out.print("Insira o valor que ir� depositar na conta: ");
				
				double depositar = sc.nextInt();
				
				if (depositar > 0) {
					programa.deposito(depositar);
					
					System.out.println(programa);
				} else {
					System.err.println("Valor de dep�sito inv�lido.");
				}
			}
			
			System.out.print("Voc� deseja fazer um saque? Insira (s)im ou qualquer outro caractere para n�o: ");
			
			escolha3 = sc.next().charAt(0);
			
			if (escolha3 == 's') {
				System.out.print("Insira o valor que ir� sacar da conta: ");
				
				double saque = sc.nextInt();
				
				if (saque > 0) {
					programa.saque(saque);
					
					System.out.println(programa);
				} else {
					System.err.println("Valor de saque inv�lido.");
				}
			}
			
			System.out.print("Voc� ir� querer realizar outra opera��o? Ensira (s)im ou qualquer outro caracter caso n�o: ");
			
			escolha = sc.next().charAt(0);
			
			if (escolha != 's') {
				verificador2 = 0;
			} else {
				verificador2 = 1;
			}
		} while (verificador2 == 1);
		
		sc.close();
		
	}

}
