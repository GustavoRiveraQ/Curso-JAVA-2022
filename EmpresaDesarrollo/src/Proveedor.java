
public class Proveedor extends Empresa {
	
	private String rubro;
	
	Proveedor(int rut, String razonsocial , String direccion , String rubro){
		super (rut,razonsocial,direccion);
		this.rubro=rubro;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

}
