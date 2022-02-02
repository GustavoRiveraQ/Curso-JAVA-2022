
public class Software {

	private String nombre;
	private int horasdesarrollo;

	
	Software (String nombre, int horasdesarrollo){
		this.nombre=nombre;
		this.horasdesarrollo=horasdesarrollo;
	
		
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
