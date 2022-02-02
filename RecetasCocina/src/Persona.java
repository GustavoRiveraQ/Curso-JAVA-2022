
public class Persona {

	public int rut;
	public String nombreapellido;
	public Persona(int rut, String nombreapellido) {
		super();
		this.rut = rut;
		this.nombreapellido = nombreapellido;
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
