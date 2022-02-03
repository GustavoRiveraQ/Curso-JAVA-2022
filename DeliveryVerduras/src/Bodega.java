import java.util.ArrayList;

public class Bodega {

	private int id;
	private ArrayList <Verdura> verdura;
	
	Bodega(int id, ArrayList<Verdura> verdura ){
		
		this.id=id;
		this.verdura=verdura;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Verdura> getVerdura() {
		return verdura;
	}

	public void setVerdura(ArrayList<Verdura> verdura) {
		this.verdura = verdura;
	}



	
	
	
}
