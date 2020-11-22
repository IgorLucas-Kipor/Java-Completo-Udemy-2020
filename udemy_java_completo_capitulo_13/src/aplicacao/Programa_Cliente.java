package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItensPedidos;
import entidades.Pedido;
import entidades.Produto;
import entidades.enums.EstadoOrdem;

public class Programa_Cliente {
	
	public static void main(String [] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados do cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de nascimento: ");
		Date nascimento = sdf.parse(sc.next());
		Cliente cliente = new Cliente(nome, email, nascimento);
		System.out.println("Insira os dados do pedido:");
		System.out.print("Estado: ");
		EstadoOrdem estado = EstadoOrdem.valueOf(sc.next());
		Pedido pedido = new Pedido(new Date(), estado, cliente);
		System.out.print("Quantos itens foram pedidos? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Entre os dados do pedido "+i+":");
			System.out.print("Nome do produto: ");
			String nomeProduto = sc.next();
			System.out.print("Preço do produto: ");
			double preco = sc.nextDouble();
			Produto produto = new Produto(nomeProduto, preco);
			System.out.print("Quantia do produto: ");
			int quantia = sc.nextInt();
			ItensPedidos itemPedido = new ItensPedidos(quantia, preco, produto);
			pedido.adicionarItem(itemPedido);
		}
		
		System.out.println();
		
		System.out.println("RESUMO DO PEDIDO:");
		System.out.println(pedido);
		
		sc.close();		
	}

}
