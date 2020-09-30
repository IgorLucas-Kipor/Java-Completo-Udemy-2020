package programas;

import java.util.Scanner;
import entidades.Retangulo;
public class Programa_retangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.print("Insira a altura do ret�ngulo: ");
		retangulo.altura = sc.nextDouble();
		System.out.print("Insira a largura do ret�ngulo: ");
		retangulo.largura = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", retangulo.area());
		System.out.printf("PERIMETRO = %.2f%n", retangulo.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
		
		sc.close();

	}

}
