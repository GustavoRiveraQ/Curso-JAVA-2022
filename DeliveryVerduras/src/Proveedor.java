
public class Proveedor {
	
	private int rut;
	private String razonsocial;
	private String direccion;
	
	Proveedor(int rut , String razonsocial , String direccion){
		this.rut=rut;
		this.razonsocial=razonsocial;
		this.direccion=direccion;
		
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

}
