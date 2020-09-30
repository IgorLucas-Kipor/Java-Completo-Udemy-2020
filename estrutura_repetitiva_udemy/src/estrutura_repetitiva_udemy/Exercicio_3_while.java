package estrutura_repetitiva_udemy;

//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo.


import java.util.Scanner;
public class Exercicio_3_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer codigo=0, alcool=0, gasolina=0, diesel=0;
		
		while (codigo!=4) {
			System.out.println("Indique qual combustível você deseja. Tecle 1 para Álcool, 2 para Gasolina, 3 para Diesel e 4 para encerrar.");
			codigo = sc.nextInt();
			if (codigo == 1) {
				++alcool;
			} else if (codigo == 2) {
				++gasolina;
			} else if (codigo == 3) {
				++diesel;
			} else if (codigo != 1 && codigo !=2 && codigo != 3 && codigo !=4) {
				System.out.println("Código inválido. Por favor, insira um código válido.");
			}
		}
		
		System.out.println("Muito obrigado!");
		System.out.println("Álcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
		sc.close();
	}

}
