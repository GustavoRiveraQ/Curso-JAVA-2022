
public class Despachador extends Persona{
	
	private String vehiculo;
	
	Despachador(int rut, String nombreapellido, String vehiculo){
		super(rut,nombreapellido);
		this.vehiculo=vehiculo;
	}

	public String getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}

	
	
}
