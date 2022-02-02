import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		/* COCINEROS*/
		
		Cocinero cocinero1 = new Cocinero(11,"Rodrigo Rivera");
		Cocinero cocinero2 = new Cocinero(12,"Gustavo Rivera");
		Cocinero cocinero3 = new Cocinero(13,"Esteban Rivera");
		
		/* GARZONES */
		
		Garzon garzon1 = new Garzon(14,"Jose Jimenez");
		Garzon garzon2 = new Garzon(15,"Pablo Vargas");
		
		System.out.println(cocinero1.getNombreapellido());
		
		/* INSUMOS */
		
		Insumo insumo1 = new Insumo("Mayonesa",1);
		Insumo insumo2 = new Insumo("Cebolla",2);
		Insumo insumo3 = new Insumo("Palta",3);
		Insumo insumo4 = new Insumo("Tomate",1);
		Insumo insumo5 = new Insumo("Vianesas",3);
		Insumo insumo6 = new Insumo("Pan de Completo",1);
		Insumo insumo7 = new Insumo("Chucrut",1);
		
		/*RECETA*/
		
		ArrayList<Insumo> insumos1 = new ArrayList <Insumo>();
		insumos1.add(insumo1);
		insumos1.add(insumo2);
		insumos1.add(insumo3);
		insumos1.add(insumo4);
		insumos1.add(insumo5);
		insumos1.add(insumo6);
		
		Receta receta1 = new Receta("Italiano", insumos1);
		
		ArrayList<Insumo> insumos2 = new ArrayList <Insumo>();
		insumos2.add(insumo1);
		insumos2.add(insumo4);
		insumos2.add(insumo5);
		insumos2.add(insumo6);
		insumos2.add(insumo7);
		
		
		Receta receta2 = new Receta("Completo", insumos2);
		
		
		System.out.println("RECETA 1");
		
		for (int i=0;i<receta1.getInsumo().size();i++) {
			int j = i+1;
			System.out.println("El ingrediente  "+ j + " de " + receta1.getNombre() + " es " + receta1.getInsumo().get(i).getNombre());
		}
		
		System.out.println("RECETA 2");
		
		for (int i=0;i<receta2.getInsumo().size();i++) {
			int j = i+1;
			System.out.println("El ingrediente  "+ j + " de " + receta2.getNombre() + " es " + receta2.getInsumo().get(i).getNombre());
		}
		
		/* MESAS */
		
		Mesa mesa1 = new  Mesa(1);
		Mesa mesa2 = new  Mesa(2);
		Mesa mesa3 = new  Mesa(3);
		
		/* COMANDAS */
		
		ArrayList<Cocinero> cocineros1 = new ArrayList <Cocinero>();
		cocineros1.add(cocinero1);
		cocineros1.add(cocinero2);
		
		ArrayList<Garzon> garzones1 = new ArrayList <Garzon>();
		garzones1.add(garzon1);
	
		
		
		Comanda comanda1 = new Comanda(mesa1,receta1,5,cocineros1,garzones1);
		
		System.out.println();
		System.out.println("La Mesa Nº "+comanda1.getMesa().getNumeromesa()+ " Pidio "+ comanda1.getCantidad() +" "+ comanda1.getReceta().getNombre()+ " Atendio " + comanda1.getGarzon().get(0).getNombreapellido() + "  Cocino  "+ comanda1.getCocinero().get(0).getNombreapellido() + " y " + comanda1.getCocinero().get(1).getNombreapellido());
		
		
		
		
		
		
		
		}
	}
		
		
		

		

		
		 		
		
		
		
		
		
