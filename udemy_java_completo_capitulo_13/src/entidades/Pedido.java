package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.EstadoOrdem;

public class Pedido {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date momento;
	private EstadoOrdem estado;
	
	private Cliente cliente;
	
	private List<ItensPedidos> pedidos = new ArrayList<>();
	
	public Pedido () {
		
	}

	public Pedido(Date momento, EstadoOrdem estado, Cliente cliente) {
		this.momento = momento;
		this.estado = estado;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public EstadoOrdem getEstado() {
		return estado;
	}

	public void setEstado(EstadoOrdem estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItensPedidos> getPedidos() {
		return pedidos;
	}

	public void adicionarItem (ItensPedidos pedido) {
		pedidos.add(pedido);
	}
	
	public void removerItem (ItensPedidos pedido) {
		pedidos.remove(pedido);
	}
	
	public Double total () {
		double total = 0;
		for (ItensPedidos p : pedidos) {
			total += p.subTotal();
		}
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do Pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Estado do Pedido: ");
		sb.append(getEstado() + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens pedidos: ");
		for (ItensPedidos p : pedidos) {
			sb.append(p + "\n");
		}
		sb.append("Preço total: ");
		sb.append(total());
		return sb.toString();
	}
	
	
	

}
