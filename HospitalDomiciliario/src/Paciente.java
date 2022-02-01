
public class Paciente extends Persona {
	private String direccion;
	
	Paciente(int rut, String nombre , String apellido , String direccion){
		super(rut,nombre,apellido);
		this.direccion = direccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

}
