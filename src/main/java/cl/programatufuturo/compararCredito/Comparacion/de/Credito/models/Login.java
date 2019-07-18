package cl.programatufuturo.compararCredito.Comparacion.de.Credito.models;

public class Login {
	
	private String entrada;
	private String password;
	
	public Login(){}

	public Login(String entrada, String password) {
		this.entrada = entrada;
		this.password = password;
	}

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [entrada=" + entrada + ", password=" + password + "]";
	}
	
}
