package entidades;

public class Pessoa_Juridica extends Contribuinte{

	private int numeroFuncionarios;
	
	public Pessoa_Juridica() {
		super();
	}
	
	
	public Pessoa_Juridica(String nome, Double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}


	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double imposto() {
		double imposto = 0;
		if (numeroFuncionarios > 10) {
			imposto = rendaAnual * 0.14;
		} else {
			imposto = rendaAnual * 0.16;
		}
		return imposto;
	}

}
