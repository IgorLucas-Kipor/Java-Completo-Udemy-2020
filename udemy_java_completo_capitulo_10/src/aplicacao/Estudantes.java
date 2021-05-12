package aplicacao;

public class Estudantes {

	private String nome;
	private String email;
	
	public Estudantes(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return  nome
				+", "
				+ email
				+".";
	}
	

}
