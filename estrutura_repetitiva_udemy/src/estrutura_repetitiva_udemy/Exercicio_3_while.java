package estrutura_repetitiva_udemy;

//Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva
//um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at�
//que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme
//exemplo.


import java.util.Scanner;
public class Exercicio_3_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer codigo=0, alcool=0, gasolina=0, diesel=0;
		
		while (codigo!=4) {
			System.out.println("Indique qual combust�vel voc� deseja. Tecle 1 para �lcool, 2 para Gasolina, 3 para Diesel e 4 para encerrar.");
			codigo = sc.nextInt();
			if (codigo == 1) {
				++alcool;
			} else if (codigo == 2) {
				++gasolina;
			} else if (codigo == 3) {
				++diesel;
			} else if (codigo != 1 && codigo !=2 && codigo != 3 && codigo !=4) {
				System.out.println("C�digo inv�lido. Por favor, insira um c�digo v�lido.");
			}
		}
		
		System.out.println("Muito obrigado!");
		System.out.println("�lcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
		sc.close();
	}

}
