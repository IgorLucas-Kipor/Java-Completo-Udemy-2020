package entidades;

public class Produto_Importado extends Produto {
	
	private Double taxaImportacao;
	
	public Produto_Importado () {
		
	}

	public Produto_Importado(String nome, Double preco, Double taxaImportacao) {
		super(nome, preco);
		this.taxaImportacao = taxaImportacao;
	}

	public Double getTaxaImportacao() {
		return taxaImportacao;
	}

	public void setTaxaImportacao(Double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}
	
	public double precoTotal() {
		return preco + taxaImportacao;
	}

	@Override
	public String etiqueta () {
		String eti = nome + " $ " + String.format("%.2f", precoTotal()) + " (Taxa de Importação: " + String.format("%.2f", taxaImportacao) +")";
		return eti;
	}
	
	
	

}
