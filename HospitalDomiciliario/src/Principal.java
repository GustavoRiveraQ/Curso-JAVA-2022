
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
/*CREACION PACIENTE*/
Paciente paciente1 = new Paciente(12,"Maria","Soler","Seis Poniente 6230");
/*CREACION PERSONAL MEDICO*/
PersonalMedico personal1 = new PersonalMedico(13,"Mario","Ruiz","Tens");
/*CREACION INSUMO*/
Insumo insumo1 = new Insumo("Camilla");
/*CREACION PROVEEDOR*/
Proveedor proveedor1 = new Proveedor (77,"Camillas Oliva");
/*CREACION VISITA*/
Visita visita1 = new Visita(paciente1,personal1,paciente1.getDireccion(),insumo1);
/*CREACION PEDIDO*/
Pedido pedido1 = new Pedido(proveedor1,insumo1,1,paciente1.getDireccion());

/*PRUEBAS */

System.out.println("El nombre del paciente es " + paciente1.getNombre() + " " + paciente1.getApellido()+ " Su Direccion es  "+ paciente1.getDireccion());
System.out.println("El nombre del personal es " + personal1.getNombre() + " " + personal1.getApellido()+ " Su Profesion es " + personal1.getTipopersonal());
System.out.println("El Insumo creado es " + insumo1.getNombre());
System.out.println("El proveedor se llama "+ proveedor1.getRazonsocial());


/*VISITA*/
System.out.println("Se a creado la visita al paciente " + visita1.getPaciente().getNombre() + " " +  visita1.getPaciente().getApellido() +  "  el Profesional a cargo es " + visita1.getPersonalmedico().getNombre() + " " + visita1.getPersonalmedico().getApellido() +" "+ "la direccion es " + visita1.getDireccion());
/*PEDIDO*/
System.out.println("Se a creado el pedido al proveedor" + pedido1.getProveedor().getRazonsocial() + " se han pedido " + pedido1.getCantidad()+ "  " + pedido1.getInsumo().getNombre() + "  la direccion es " + pedido1.getDireccion());


}
}
