package entidades;

public class Exemplo_Conta {
	
	private Integer numero;
	private String proprietario;
	protected Double balanco;
	
	public Exemplo_Conta () {
		
	}

	public Exemplo_Conta(Integer numero, String proprietario, Double balanco) {
		this.numero = numero;
		this.proprietario = proprietario;
		this.balanco = balanco;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public Double getBalanco() {
		return balanco;
	}

	public void saque (Double quantia) {
		balanco -= quantia + 5.0;
	}
	
	public void deposito (Double quantia) {
		balanco += quantia;
	}
	
	

}
