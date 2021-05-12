package entidades;

public class Pessoa_Fisica extends Contribuinte{
	
	private double gastosSaude;
	
	public Pessoa_Fisica() {
		super();
	}
	
	public Pessoa_Fisica(String nome, Double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		double imposto = 0;
		if (rendaAnual < 20000) {
			imposto = (rendaAnual * 0.15);
		}
		else {
			imposto = (rendaAnual * 0.25);
		}
		imposto -= gastosSaude*0.5;
		return imposto;
	}

}
