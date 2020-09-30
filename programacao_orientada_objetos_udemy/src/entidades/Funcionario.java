package entidades;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public String toString() {
		return "Employee: "+nome+", $ "+String.format("%.2f%n", (salarioBruto-imposto));
	}
	
	public void aumento(double porcentagem) {
		salarioBruto = salarioBruto * (porcentagem/100+1);
	}

}
