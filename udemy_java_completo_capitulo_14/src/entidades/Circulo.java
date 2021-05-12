package entidades;

import entidades.enums.Cor;

public class Circulo extends Forma {
	
	private Double raio;
	
	public Circulo() {
		super();
	}
	
	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * (raio*raio);
	}
	
	

}
