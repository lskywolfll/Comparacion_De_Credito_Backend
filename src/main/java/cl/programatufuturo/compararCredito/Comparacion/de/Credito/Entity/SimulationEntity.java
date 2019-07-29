package cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "simulations")
public class SimulationEntity {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	@Column
	private int montoCredito;
	@Column
	private int meses;
	@Column
	private int sueldo;
	
	public SimulationEntity(){}

	public SimulationEntity(int montoCredito, int meses, int sueldo) {
		this.montoCredito = montoCredito;
		this.meses = meses;
		this.sueldo = sueldo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getMontoCredito() {
		return montoCredito;
	}

	public void setMontoCredito(int montoCredito) {
		this.montoCredito = montoCredito;
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "SimulationEntity [id=" + id + ", montoCredito=" + montoCredito + ", meses=" + meses + ", sueldo="
				+ sueldo + "]";
	}
	
}
