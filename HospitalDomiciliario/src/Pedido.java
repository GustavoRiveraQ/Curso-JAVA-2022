
public class Pedido {
	
	
	private Proveedor proveedor;
	private Insumo insumo;
	private int cantidad;
	private String direccion;
	
	Pedido(Proveedor proveedor,Insumo insumo , int cantidad , String direccion){
		this.proveedor=proveedor;
		this.insumo=insumo;
		this.cantidad=cantidad;
		this.direccion=direccion;
		
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Insumo getInsumo() {
		return insumo;
	}

	public void setInsumo(Insumo insumo) {
		this.insumo = insumo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
	

}
