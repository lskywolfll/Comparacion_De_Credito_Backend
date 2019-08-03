package cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "simulations")
public class SimulationEntity {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id_simulation;
	
	
//	@ManyToOne
//	@JoinColumn(name = "id",table = "users")
//	private UserEntity user;
	@Column
	private int monto;
	@Column
	private int cuotas;
	
	public SimulationEntity(){}

	public SimulationEntity(long id_simulation, int monto, int cuotas) {
		super();
		this.id_simulation = id_simulation;
		this.monto = monto;
		this.cuotas = cuotas;
	}

	public long getId() {
		return id_simulation;
	}

	public void setId(long id_simulation) {
		this.id_simulation = id_simulation;
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

	
}
