package aplicacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entidades.Comentario;
import entidades.Postagem;
public class Programa_post {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Have a nice trip!");
		
		Comentario c2 = new Comentario("wow that's awesome!");
		
		Postagem p1 = new Postagem(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand"
				, "I'm going to visit this wonderful country!", 12);
		
		p1.adicionarComentario(c1);
		p1.adicionarComentario(c2);
		
		System.out.println(p1);
		
		Comentario c3 = new Comentario("Good night");
		
		Comentario c4 = new Comentario("May the Force be with you.");
		
		Postagem p2 = new Postagem(sdf.parse("28/07/2018 23:14:19"), "Good night guys"
				, "See you tomorrow", 5);
		
		p2.adicionarComentario(c3);
		p2.adicionarComentario(c4);
		
		System.out.println(p2);
		
		
		
		
		
		sc.close();

	}

}
