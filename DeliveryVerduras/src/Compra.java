import java.util.ArrayList;

public class Compra {
	
	private Proveedor proveedor;
	private ArrayList<Verdura> verdura;
	
	Compra(Proveedor proveedor , ArrayList <Verdura> verdura){
		this.proveedor=proveedor;
		this.verdura=verdura;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public ArrayList<Verdura> getVerdura() {
		return verdura;
	}

	public void setVerdura(ArrayList<Verdura> verdura) {
		this.verdura = verdura;
	}
	
	
}
