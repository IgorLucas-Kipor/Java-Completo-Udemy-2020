package aplicacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.enums.Cor;

public class Programa_Figuras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Forma> lista = new ArrayList<>();
		
		System.out.print("Entre o número de figuras: ");
		
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Dados da Forma "+i);
			System.out.print("Retângulo ou círculo (c/r)? ");
			char escolha = sc.next().charAt(0);
			System.out.print("Cor: ");
			sc.nextLine();
			Cor cor = Cor.valueOf(sc.next());
			if (escolha == 'r' || escolha == 'R') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				lista.add(new Retangulo(cor, largura, altura));
			}
			else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				lista.add(new Circulo(cor, raio));
			}
		}
		System.out.println();
		System.out.println("ÁREAS DAS FORMAS");
		for (Forma f : lista) {
			System.out.println(String.format("%.2f", f.area()));
		}
		
		
		
		sc.close();

	}

}
