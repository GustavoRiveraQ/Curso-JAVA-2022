
public class Persona {

	private int rut;
	private String nombreapellido;
	
	Persona(int rut , String nombreapellido){
		this.rut=rut;
		this.nombreapellido=nombreapellido;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getNombreapellido() {
		return nombreapellido;
	}

	public void setNombreapellido(String nombreapellido) {
		this.nombreapellido = nombreapellido;
	}
	
	
}
