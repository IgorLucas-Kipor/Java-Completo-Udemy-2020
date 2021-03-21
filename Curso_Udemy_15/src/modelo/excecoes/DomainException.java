package modelo.excecoes;

public class DomainException extends Exception{
	
	//RuntimeException o compilador não te obriga a tratar
	//se for só Exception, compilador te obriga a tratá-la
	
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	} //permite que instanciar a exceção personalizada passando uma mensagem para ela que fica armazenada dentro da exceção

}
