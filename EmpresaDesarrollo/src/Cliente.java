
public class Cliente extends Empresa {
	
	
	private boolean marco;
	private int codigomarco;
	
	
	Cliente(int rut, String razonsocial , String direccion , String rubro ,boolean marco , int codigomarco){
			super (rut,razonsocial,direccion);
			this.marco=marco;
			this.codigomarco=codigomarco;
	}


	public boolean isMarco() {
		return marco;
	}


	public void setMarco(boolean marco) {
		this.marco = marco;
	}


	public int getCodigomarco() {
		return codigomarco;
	}


	public void setCodigomarco(int codigomarco) {
		this.codigomarco = codigomarco;
	}

}
