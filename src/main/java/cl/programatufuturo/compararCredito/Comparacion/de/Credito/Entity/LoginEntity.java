package cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class LoginEntity {
//	Creditos al grupo 1, Gracias al juan
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String entrada;
	@Column
	private String password;
	
	public LoginEntity(){}

	public LoginEntity(String entrada, String password) {
		super();
		this.entrada = entrada;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
		return "LoginEntity [id=" + id + ", entrada=" + entrada + ", password=" + password + "]";
	}
	
	
}
