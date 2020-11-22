package programa;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aplicacao.Funcionarios;
public class Aumento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Funcionarios> funcionarios = new ArrayList<>();
		
		System.out.print("Insira o número de funcionários a se cadastrar: ");
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.print("Insira o ID do funcionário: ");
			int id = sc.nextInt();
			while (temId(funcionarios, id)) {
				System.out.print("ID já preenchido. Por favor, insira outro: ");
				id = sc.nextInt();
			}
			System.out.print("Insira o nome do funcionário: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Insira o salário do funcionário: ");
			double salario = sc.nextDouble();
			funcionarios.add(new Funcionarios(id, nome, salario));
		}
		
		
		System.out.println();
		System.out.print("Insira o ID e o aumento do funcionário desejado: ");
		int id = sc.nextInt();
		Funcionarios busca = funcionarios.stream().filter(d -> d.getId() == id).findFirst().orElse(null);
		if (busca == null) {
			System.err.println("ID inexistente.");
		} else {
			System.out.print("Insira o aumento em porcentagem do funcionário: ");
			double aumento = sc.nextDouble();
			busca.aumento(aumento);
		}
		
		System.out.println("Lista de empregados: ");
		
		for (Funcionarios x : funcionarios) {
			System.out.println(x);
		}
		
		sc.close();
	}
	
	public static boolean temId (List<Funcionarios> funcionarios, int id) {
		Funcionarios fun = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return fun != null;
	}

}
