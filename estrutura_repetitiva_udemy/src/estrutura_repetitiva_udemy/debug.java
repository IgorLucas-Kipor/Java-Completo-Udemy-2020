package estrutura_repetitiva_udemy;


import java.util.Scanner;
import java.util.Locale;
public class debug {
public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double largura = sc.nextDouble();
	double comprimento = sc.nextDouble();
	double metroQuadrado = sc.nextDouble();
	
	double area = largura + comprimento;
	double preco = area * metroQuadrado;
	
	System.out.printf("AREA = %.2f%n", area);
	System.out.printf("PREÇO = %.2f%n", preco);
	
	sc.close();
	
//	Para marcar breakpoint, ir em run+toggle breakpoint out apertar ctrl+shift+b
//	Para rodar em debu, clicar com o botão direito na classe > debug > java application
}
}
