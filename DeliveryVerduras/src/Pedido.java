import java.util.ArrayList;

public class Pedido {

	private int id;
	private ArrayList <Verdura> verdura;
	private Cliente cliente;
	
	Pedido (int id, ArrayList<Verdura> verdura, Cliente cliente){
		this.id=id;
		this.verdura=verdura;
		this.cliente=cliente;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Verdura> getVerdura() {
		return verdura;
	}

	public void setVerdura(ArrayList<Verdura> verdura) {
		this.verdura = verdura;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
}
