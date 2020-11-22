package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto_Usado extends Produto {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataManufatura;
	
	public Produto_Usado () {
		
	}

	public Produto_Usado(String nome, Double preco, Date dataManufatura) {
		super(nome, preco);
		this.dataManufatura = dataManufatura;
	}

	public Date getDataManufatura() {
		return dataManufatura;
	}

	@Override
	public String etiqueta() {
		String eti = nome + " (usado) $ " + String.format("%.2f", preco) + " (Data de Manufatura: " + sdf.format(dataManufatura) + ")";
		return eti;
	}
	
	

}
