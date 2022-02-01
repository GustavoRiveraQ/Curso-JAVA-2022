import java.util.ArrayList;


public class Venta {
	
		private int numeroventa;
		private Cliente cliente;
		private ArrayList<Programador> programador; 
		private ArrayList<Software> software;
		
		public Venta(int numeroventa, Cliente cliente , ArrayList<Programador> programador , ArrayList<Software> software) {
			this.numeroventa=numeroventa;
			this.cliente=cliente;
			this.programador=programador;
			this.software=software;
			
		}

		public int getNumeroventa() {
			return numeroventa;
		}

		public void setNumeroventa(int numeroventa) {
			this.numeroventa = numeroventa;
		}

		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

		public ArrayList<Programador> getProgramador() {
			return programador;
		}

		public void setProgramador(ArrayList<Programador> programador) {
			this.programador = programador;
		}

		public ArrayList<Software> getSoftware() {
			return software;
		}

		public void setSoftware(ArrayList<Software> software) {
			this.software = software;
		}
	

}
