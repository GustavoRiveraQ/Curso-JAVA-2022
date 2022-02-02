
public class Cliente extends Persona{
	
	private String direccion;
	
	Cliente (int rut , String nombreapellido , String direccion){
		
		super(rut,nombreapellido);
		this.direccion=direccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


}

