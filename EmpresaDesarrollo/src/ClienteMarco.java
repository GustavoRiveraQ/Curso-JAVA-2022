
public class ClienteMarco extends Empresa{
	
	private int codigomarco;
	
		ClienteMarco(int rut, String razonsocial , String direccion , int codigomarco){
			super (rut,razonsocial,direccion);
			this.codigomarco=codigomarco;
	}

		public int getCodigomarco() {
			return codigomarco;
		}

		public void setCodigomarco(int codigomarco) {
			this.codigomarco = codigomarco;
		}

}
