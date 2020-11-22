package aplicacoes;

import entidades.Exemplo_Conta;
import entidades.Exemplo_Conta_Negocios;
import entidades.Exemplo_Conta_Poupanca;

public class Programa_Exemplo_Banco {

	public static void main(String [] args) {
		
		Exemplo_Conta conta = new Exemplo_Conta(1001, "Alex", 0.0);
		Exemplo_Conta_Negocios contaNegocios = new Exemplo_Conta_Negocios(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Exemplo_Conta conta1 = contaNegocios;
		Exemplo_Conta conta2 = new Exemplo_Conta_Negocios(1003, "Bob", 0.0, 200.0);
		Exemplo_Conta conta3 = new Exemplo_Conta_Poupanca(1004, "Ana", 0.0, 0.01);
		
		//DOWNCASTING
		
		Exemplo_Conta_Negocios conta4 = (Exemplo_Conta_Negocios)conta2;
		conta4.emprestimo(100.0);
		
//		Exemplo_Conta_Negocios conta5 = (Exemplo_Conta_Negocios)conta3;
		
		if (conta3 instanceof Exemplo_Conta_Negocios) {
			Exemplo_Conta_Negocios conta5 = (Exemplo_Conta_Negocios)conta3;
			conta5.emprestimo(200.0);
			System.out.println("Empréstimo!");
		}
		
		if (conta3 instanceof Exemplo_Conta_Poupanca) {
			Exemplo_Conta_Poupanca conta5 = (Exemplo_Conta_Poupanca)conta3;
			conta5.atualizarBalanco();
			System.out.println("Atualização!");
		}
		
		
		
		
		
		
		
	}
}
