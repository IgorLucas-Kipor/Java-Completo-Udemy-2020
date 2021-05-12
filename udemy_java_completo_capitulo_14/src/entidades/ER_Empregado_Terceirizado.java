package entidades;

public class ER_Empregado_Terceirizado extends ER_Empregado {
	
	private Double valorAdicional;

	public ER_Empregado_Terceirizado(String nome, Integer horas, double valorHora, Double valorAdicional) {
		super(nome, horas, valorHora);
		this.valorAdicional = valorAdicional;
	}
	
	public ER_Empregado_Terceirizado () {
		super();
	}

	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + valorAdicional * 1.1;
	}

}
