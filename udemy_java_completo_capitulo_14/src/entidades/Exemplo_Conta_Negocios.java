package entidades;

public class Exemplo_Conta_Negocios extends Exemplo_Conta {
	
	private Double limiteEmprestimo;
	
	public Exemplo_Conta_Negocios () {
		super();
	}
	
	// super executa a lógica do construtor da classe base

	public Exemplo_Conta_Negocios(Integer numero, String proprietario, Double balanco, Double limiteEmprestimo) {
		super(numero, proprietario, balanco);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo (Double quantia) {
		if (quantia <= limiteEmprestimo) {
		balanco -= quantia - 10.0;
		}
	}
	
	@Override
	public void saque (Double quantia) {
		super.saque(quantia);
		balanco -= 2.0;
	}

}
