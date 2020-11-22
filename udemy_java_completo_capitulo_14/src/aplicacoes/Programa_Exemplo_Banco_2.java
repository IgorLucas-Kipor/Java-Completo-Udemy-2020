package aplicacoes;

import entidades.Exemplo_Conta;
import entidades.Exemplo_Conta_Negocios;
import entidades.Exemplo_Conta_Poupanca;

public class Programa_Exemplo_Banco_2 {

	public static void main(String[] args) {

		Exemplo_Conta conta = new Exemplo_Conta(1001, "Alex", 1000.0);
		conta.saque(200.0);
		System.out.println(conta.getBalanco());
		
		Exemplo_Conta conta2 = new Exemplo_Conta_Poupanca(1002, "Maria", 1000.0, 0.01);
		conta2.saque(200.0);
		System.out.println(conta2.getBalanco());
		
		Exemplo_Conta conta3 = new Exemplo_Conta_Negocios(1003, "Bob", 1000.0, 500.0);
		conta3.saque(200.0);
		System.out.println(conta3.getBalanco());

	}

}
