
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* CREAR CLIENTES */
		
	Cliente cliente1 = new Cliente(10,"Juan Perez","Alameda 2030");
	Cliente cliente2 = new Cliente(11,"Jose Vasquez","Gran Avenida 1020");
	Cliente cliente3 = new Cliente(12,"Maria Lopez","Vivaceta 567");
	Cliente cliente4 = new Cliente(13,"Lya Jimenez","Jose Joaquin Prieto 5678");
	
	System.out.println("El nombre del Cliente es " + cliente1.getNombreapellido() + " el rut es " + cliente1.getRut() + " La direccion es  " + cliente1.getDireccion());
	
    /* CREAR DESPACHADORES */
	
	Despachador despachador1 = new Despachador(20,"Andres Flores","Bicicleta");
	Despachador despachador2 = new Despachador(21,"Guiselle Hernandez","Auto");
	Despachador despachador3 = new Despachador(22,"Juan Cortes","Camioneta");
	Despachador despachador4 = new Despachador(23,"Florencia Muñoz","Bicicleta");
	
	System.out.println("El nombre del despachador  es " + despachador1.getNombreapellido() + " el rut es " + despachador1.getRut() + " El vehiculo es " + despachador1.getVehiculo());
	
	
		
	}

}
