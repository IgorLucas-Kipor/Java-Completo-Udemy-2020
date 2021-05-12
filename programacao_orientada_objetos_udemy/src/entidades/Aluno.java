package entidades;

public class Aluno {
	
	public String nome;
	public double nota1, nota2, nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double faltando() {
		if (notaFinal() < 60) {
			return 60 - notaFinal();
		} else {
			return 0;
		}
	}

}
