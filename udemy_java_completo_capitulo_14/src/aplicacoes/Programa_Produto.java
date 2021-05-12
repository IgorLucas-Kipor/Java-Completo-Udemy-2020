package aplicacoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;
import entidades.Produto_Importado;
import entidades.Produto_Usado;
public class Programa_Produto {
	public static void main(String [] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o número de produtos a serem lidos: ");
		int n = sc.nextInt();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> lista = new ArrayList<>();
		
		for (int i=1; i<=n; i++) {
			System.out.println("DADOS DO PRODUTO "+i);
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char escolha = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();
			if (escolha == 'i' || escolha == 'I') {
				System.out.print("Taxa de Importação: ");
				Double taxaImportacao = sc.nextDouble();
				lista.add(new Produto_Importado(nome, preco, taxaImportacao));
			}
			else if (escolha == 'u' || escolha == 'U') {
				System.out.print("Data de Manufatura (dd/mm/aaaa): ");
				Date manufatura = sdf.parse(sc.next());
				lista.add(new Produto_Usado(nome, preco, manufatura));
			}
			else {
				lista.add(new Produto(nome, preco));
			}
		}
		
		System.out.println();
		System.out.println("ETIQUETAS");
		
		for (Produto p : lista) {
			System.out.println(p.etiqueta());
		}
				
		
		sc.close();
	}

}
