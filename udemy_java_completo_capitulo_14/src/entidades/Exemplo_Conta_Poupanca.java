package entidades;

public class Exemplo_Conta_Poupanca extends Exemplo_Conta {
	
	private Double taxaDeInteresse;
	
	public Exemplo_Conta_Poupanca () {
		super();
	}

	public Exemplo_Conta_Poupanca(Integer numero, String proprietario, Double balanco, Double taxaDeInteresse) {
		super(numero, proprietario, balanco);
		this.taxaDeInteresse = taxaDeInteresse;
	}

	public Double getTaxaDeInteresse() {
		return taxaDeInteresse;
	}

	public void setTaxaDeInteresse(Double taxaDeInteresse) {
		this.taxaDeInteresse = taxaDeInteresse;
	}
	
	public void atualizarBalanco () {
		balanco += balanco * taxaDeInteresse;
	}
	
	@Override
	public final void saque (Double quantia) {
		balanco -= quantia;
	}

}
