package cl.programatufuturo.compararCredito.Comparacion.de.Credito.models;

public class Administrador {

	private String nombre;
	private String password;
	
	public Administrador(String nombre, String password) {
		super();
		this.nombre = nombre;
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
