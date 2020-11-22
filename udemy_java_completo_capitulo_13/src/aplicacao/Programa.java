package aplicacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.ContratoHora;
import entidades.Departamento;
import entidades.Trabalhador;
import entidades.enums.NivelFuncionario;
public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do departamento: ");
		
		String nomeDepartamento = sc.nextLine();
		
		System.out.println("Insira os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("N�vel: ");
		String nivelTrabalhador = sc.nextLine();
		System.out.print("Sal�rio base: ");
		Double salarioBase = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nome, NivelFuncionario.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos para esse trabalhador? ");
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print("Entre o contrato de n�mero "+i+": ");
			System.out.print("Data (DD/MM/AAAA): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			System.out.print("Dura��o do contrato: ");
			int horas = sc.nextInt();
			ContratoHora contrato = new ContratoHora(dataContrato, valorHora, horas);
			trabalhador.adicionarContrato(contrato);
		}
		System.out.println();
		System.out.print("Entre o m�s e o ano para calcular o sal�rio (MM/AAAA): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		System.out.println("Nome: "+trabalhador.getNome());
		System.out.println("Departamento: "+trabalhador.getDepartamento().getNome());
		System.out.println("Sal�rio em "+mesEAno+": "+ String.format("%.2f", trabalhador.salario(ano, mes)));
		
		
		
		
		
		sc.close();

	}

}
