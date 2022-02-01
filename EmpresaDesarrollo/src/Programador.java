
public class Programador {
	private int rut;
	private String nombre;
	private String apellido;
	
	Programador(int rut , String nombre , String apellido) {
		this.rut=rut;
		this.nombre=nombre;
		this.apellido=apellido;
		
	}
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}