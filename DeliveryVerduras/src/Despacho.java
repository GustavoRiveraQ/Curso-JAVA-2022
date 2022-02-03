
public class Despacho {
	
	private int id;
	private Pedido pedido;
	private Cliente cliente;
	private Despachador despachador;
	
	Despacho(int id, Pedido pedido, Cliente cliente , Despachador despachador){
		this.id=id;
		this.pedido=pedido;
		this.cliente=cliente;
		this.despachador=despachador;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Despachador getDespachador() {
		return despachador;
	}

	public void setDespachador(Despachador despachador) {
		this.despachador = despachador;
	}
	
	

}
