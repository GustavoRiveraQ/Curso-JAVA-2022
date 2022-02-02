import java.util.ArrayList;

public class Comanda {
	
	private Mesa mesa;
	private Receta receta;
	private int cantidad;
	private ArrayList <Cocinero> cocinero;
	private ArrayList <Garzon> garzon;
	
	Comanda(Mesa mesa,Receta receta, int cantidad , ArrayList<Cocinero> cocinero , ArrayList<Garzon> garzon ){
		this.mesa=mesa;
		this.receta=receta;
		this.cantidad=cantidad;
		this.cocinero=cocinero;
		this.garzon=garzon;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}


	public Receta getReceta() {
		return receta;
	}

	public void setReceta(Receta receta) {
		this.receta = receta;
	}

	public ArrayList<Cocinero> getCocinero() {
		return cocinero;
	}

	public void setCocinero(ArrayList<Cocinero> cocinero) {
		this.cocinero = cocinero;
	}

	public ArrayList<Garzon> getGarzon() {
		return garzon;
	}

	public void setGarzon(ArrayList<Garzon> garzon) {
		this.garzon = garzon;
	}
}
