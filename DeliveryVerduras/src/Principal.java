import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* CREAR CLIENTES */
		
	Cliente cliente1 = new Cliente(10,"Juan Perez","Alameda 2030");
	Cliente cliente2 = new Cliente(11,"Jose Vasquez","Gran Avenida 1020");
	
	System.out.println("El nombre del Cliente es " + cliente1.getNombreapellido() + " el rut es " + cliente1.getRut() + " La direccion es  " + cliente1.getDireccion());
	
    /* CREAR DESPACHADORES */
	
	Despachador despachador1 = new Despachador(20,"Andres Flores","Bicicleta");
	Despachador despachador2 = new Despachador(21,"Guiselle Hernandez","Auto");
	
	System.out.println("El nombre del despachador  es " + despachador1.getNombreapellido() + " el rut es " + despachador1.getRut() + " El vehiculo es " + despachador1.getVehiculo());
	
	/* CREAR PROVEEDOR*/
	
	Proveedor proveedor1 =new Proveedor(30,"Frutera Aguas Blancas","Tricolor de Paine 666");
	
	
	/* CREAR VERDURAS */
	
	Verdura verdura1 = new Verdura(01,"Tomate",30);
	Verdura verdura2 = new Verdura(02,"Papas",40);
	Verdura verdura3 = new Verdura(03,"Lechuga",20);
	Verdura verdura4 = new Verdura(04,"Apio",20);

	
	/* CREAR ARRAY VERDURAS */
	
	ArrayList<Verdura> bodegaverduras = new ArrayList<Verdura>();
		bodegaverduras.add(verdura1);
		bodegaverduras.add(verdura2);
		bodegaverduras.add(verdura3);
		bodegaverduras.add(verdura4);
	
	/* CREAR BODEGA */
	
	Bodega bodega1 = new Bodega (001,bodegaverduras);
	
	System.out.println("En la Bodega" + bodega1.getId() + " hay :");
	
	for (int i=0 ; i< bodega1.getVerdura().size() ; i++ ) {
	System.out.println(bodega1.getVerdura().get(i).getCantidad() + " " + bodega1.getVerdura().get(i).getNombre());
	}
	
	
	/* CREAR PEDIDO DE VERDURAS Y ARRAY PEDIDO */
	
	
	Verdura pverdura1 = new Verdura(01,"Tomate",10);
	Verdura pverdura2 = new Verdura(02,"Papas",20);
	Verdura pverdura3 = new Verdura(03,"Lechuga",15);
	Verdura pverdura4 = new Verdura(04,"Apio",0);
	
	ArrayList<Verdura> pedidoverduras = new ArrayList<Verdura>();
	pedidoverduras.add(pverdura1);
	pedidoverduras.add(pverdura2);
	pedidoverduras.add(pverdura3);
	pedidoverduras.add(pverdura4);
	
	
	/* CREAR PEDIDO DE CLIENTE*/

	
	Pedido pedido1 = new Pedido(00,pedidoverduras,cliente1);
	
	
	System.out.println("El Cliente " + cliente1.getNombreapellido()+ "  Ha pedido :");
	
	for (int i=0 ; i< pedido1.getVerdura().size(); i++) {
	System.out.println(pedido1.getVerdura().get(i).getCantidad() +" "+ pedido1.getVerdura().get(i).getNombre());
	}
	
    /* CREAR DESPACHO */
	
	Despacho despacho1 = new Despacho(0001,pedido1,pedido1.getCliente(),despachador1);
	
	System.out.println("Se ha creado el despacho " + despacho1.getId()+ " para el cliente " + despacho1.getCliente().getNombreapellido() );
	System.out.println("El cliente ha pedido");
	for (int i=0 ; i < despacho1.getPedido().getVerdura().size() ; i++) {
		System.out.println(despacho1.getPedido().getVerdura().get(i).getCantidad()+" "+ despacho1.getPedido().getVerdura().get(i).getNombre());	
	}
	System.out.println("El pedido será despachado por  " + despacho1.getDespachador().getNombreapellido() +" en "+ despacho1.getDespachador().getVehiculo() );

	/* REDUCIR BODEGA */
	
	System.out.println("En Bodega quedan :");
	for (int i=0 ; i < bodega1.getVerdura().size() ; i++) {
		if (bodega1.getVerdura().get(i).getId() == pedido1.getVerdura().get(i).getId()) {
			int cantidadnueva = bodega1.getVerdura().get(i).getCantidad() - pedido1.getVerdura().get(i).getCantidad();
			bodega1.getVerdura().get(i).setCantidad(cantidadnueva);
			System.out.println(bodega1.getVerdura().get(i).getCantidad() +" "+ bodega1.getVerdura().get(i).getNombre());
			
		}
		
	/* GENERAR ARRAY PARA STOCK Y GENERAR PEDIDO AL PROVEEDOR */
		
	Verdura cverdura1 = new Verdura(01,"Tomate",100);
	Verdura cverdura2 = new Verdura(02,"Papas",80);
	Verdura cverdura3 = new Verdura(03,"Lechuga",70);
	Verdura cverdura4 = new Verdura(04,"Apio",67);
		
	ArrayList<Verdura> compraverduras = new ArrayList<Verdura>();
	
	compraverduras.add(cverdura1);
	compraverduras.add(cverdura2);
	compraverduras.add(cverdura3);
	compraverduras.add(cverdura4);

	
	Compra compra1 = new Compra (proveedor1,compraverduras);
	
	System.out.println("Se pide al cliente " + proveedor1.getRazonsocial() + " :");
	for (i=0 ; i < compra1.getVerdura().size(); i++) {

			System.out.println(compra1.getVerdura().get(i).getCantidad() +" "+ compra1.getVerdura().get(i).getNombre());
			
		}
	}
		
	}

}
