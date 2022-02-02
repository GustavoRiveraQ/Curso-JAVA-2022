import java.util.ArrayList;

public class Receta {
	
	private String nombre;
	private ArrayList <Insumo> insumo;

	
	Receta(String nombre, ArrayList<Insumo> insumo ) {

		this.nombre = nombre;
		this.insumo = insumo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Insumo> getInsumo() {
		return insumo;
	}
	public void setInsumo(ArrayList<Insumo> insumo) {
		this.insumo = insumo;
	}
	
	

}
