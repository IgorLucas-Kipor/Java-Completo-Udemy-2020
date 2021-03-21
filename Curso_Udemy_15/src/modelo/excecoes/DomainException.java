package modelo.excecoes;

public class DomainException extends Exception{
	
	//RuntimeException o compilador n�o te obriga a tratar
	//se for s� Exception, compilador te obriga a trat�-la
	
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	} //permite que instanciar a exce��o personalizada passando uma mensagem para ela que fica armazenada dentro da exce��o

}
