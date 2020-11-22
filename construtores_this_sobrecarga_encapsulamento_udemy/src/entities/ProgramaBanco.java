package entities;

public class ProgramaBanco {
	
	private String nome;
	private short numero;
	private double saldo;
	
	
	public ProgramaBanco(String nome, short numero, double saldo) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public ProgramaBanco(String nome, short numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public ProgramaBanco() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public short getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque (double valor) {
		saldo = saldo - valor - 5;
	}
	
	public String toString() {
		return String.format("Dados da conta:%n") +
				"Conta " +
				numero +
				", Titular: " +
				nome +
				", Saldo: R$" +
				String.format("%.2f", saldo);
	}

}
