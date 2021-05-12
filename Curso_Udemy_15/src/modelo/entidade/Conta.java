package modelo.entidade;

import modelo.excecoes.BalanceException;

public class Conta {

	private Integer numero;
	private String portador;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() {
		
	}
	
	public Conta(Integer numero, String portador, Double saldo, Double limiteSaque) throws BalanceException {
		if (saldo < 0) {
			throw new BalanceException("Saldo inicial não pode ser negativo.");
		}
		this.numero = numero;
		this.portador = portador;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getPortador() {
		return portador;
	}

	public void setPortador(String portador) {
		this.portador = portador;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaldo) {
		this.limiteSaque = limiteSaldo;
	}
	
	public void deposito(Double quantia) {
		saldo += quantia;
		
		System.out.printf("Novo saldo: %.2f%n", saldo);
	}
	
	public void saque(Double quantia) throws BalanceException {
		if (quantia > limiteSaque) {
			throw new BalanceException("Erro no saque: valor requisitado maior do que o limite permitido.");
		}
		
		saldo -= quantia;
		
		if (saldo < 0) {
			throw new BalanceException("Erro no saque: saldo insuficiente.");
		}
		
		System.out.printf("Novo saldo: %.2f%n", saldo);
	}
	
}
