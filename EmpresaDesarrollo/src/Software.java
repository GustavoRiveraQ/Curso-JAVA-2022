
public class Software {

	private String nombre;
	private int horasdesarrollo;
	private Programador programador;
	
	Software (String nombre, int horasdesarrollo, Programador programador){
		this.nombre=nombre;
		this.horasdesarrollo=horasdesarrollo;
		this.programador=programador;
		
	}

	public Programador getProgramador() {
		return programador;
	}

	public void setProgramador(Programador programador) {
		this.programador = programador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHorasdesarrollo() {
		return horasdesarrollo;
	}

	public void setHorasdesarrollo(int horasdesarrollo) {
		this.horasdesarrollo = horasdesarrollo;
	}
	
}
