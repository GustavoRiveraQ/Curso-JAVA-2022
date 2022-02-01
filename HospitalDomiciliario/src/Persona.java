public class Persona{
	
	private int rut;
	private String nombre;
	private String apellido;

	Persona(int rut, String nombre , String apellido){
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		}

	public void setRut(int rut) {
		this.rut = rut;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getRut() {
		return this.rut;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	
	
	
}
