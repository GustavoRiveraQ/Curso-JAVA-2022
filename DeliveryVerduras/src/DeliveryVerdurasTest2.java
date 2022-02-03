import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeliveryVerdurasTest2 {

	public void testCrearCliente() {
		
		Cliente cliente1 = new Cliente(12,"Arturo Perez","Alameda 333");
		assertEquals (cliente1.getDireccion() , "Alameda 333");
	}
    
	public void testCrearProveedor() {
		Proveedor proveedor1 = new Proveedor(22,"Frutera Los Platanos","Los Platanos 666");
		assertEquals (proveedor1.getRazonsocial(),"Frutera Los Platanos");
	}

}
