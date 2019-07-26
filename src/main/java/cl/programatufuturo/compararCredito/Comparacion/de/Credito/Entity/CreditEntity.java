package cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "credit")
public class CreditEntity {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private int monto;
	@Column
	private int cuotas;
	@Column
	private double intereses;
	@Column
	private int plazos;
	@Column
	private String banco;
	
	public CreditEntity(){}
	
	public CreditEntity(int monto, int cuotas, int plazos, String banco) {
		super();
		this.monto = monto;
		this.cuotas = cuotas;
		this.plazos = plazos;
		this.banco = banco;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public int getCuotas() {
		return cuotas;
	}

	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}

	public int getPlazos() {
		return plazos;
	}

	public void setPlazos(int plazos) {
		this.plazos = plazos;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	@Override
	public String toString() {
		return "CreditEntity [id=" + id + ", monto=" + monto + ", cuotas=" + cuotas + ", plazos=" + plazos + ", banco="
				+ banco + "]";
	}
	
}
