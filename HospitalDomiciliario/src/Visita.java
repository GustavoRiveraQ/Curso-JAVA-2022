
public class Visita {
	
	private Paciente paciente;
	private PersonalMedico personalmedico;
	private String direccion;
	private Insumo insumo;
	
	
	Visita(Paciente paciente,PersonalMedico personalmedico,String direccion,Insumo insumo){
		this.paciente=paciente;
		this.personalmedico=personalmedico;
		this.direccion=direccion;
		this.insumo=insumo;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	public PersonalMedico getPersonalmedico() {
		return personalmedico;
	}


	public void setPersonalmedico(PersonalMedico personalmedico) {
		this.personalmedico = personalmedico;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Insumo getInsumo() {
		return insumo;
	}


	public void setInsumo(Insumo insumo) {
		this.insumo = insumo;
	}

	
}
