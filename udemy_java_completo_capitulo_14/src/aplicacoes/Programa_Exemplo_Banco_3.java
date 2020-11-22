package aplicacoes;

import entidades.Exemplo_Conta;
import entidades.Exemplo_Conta_Negocios;
import entidades.Exemplo_Conta_Poupanca;

public class Programa_Exemplo_Banco_3 {

	public static void main(String[] args) {

		Exemplo_Conta conta2 = new Exemplo_Conta_Poupanca(1002, "Maria", 1000.0, 0.01);
		Exemplo_Conta conta3 = new Exemplo_Conta_Negocios(1003, "Bob", 1000.0, 500.0);

	}

}
