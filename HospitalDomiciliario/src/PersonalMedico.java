
public class PersonalMedico extends Persona {
	
	private String tipopersonal;

PersonalMedico (int rut, String nombre , String apellido , String tipopersonal){
	super (rut,nombre,apellido);
	this.tipopersonal = tipopersonal;	
}

public String getTipopersonal() {
	return tipopersonal;
}

public void setTipopersonal(String tipopersonal) {
	this.tipopersonal = tipopersonal;
}
}
