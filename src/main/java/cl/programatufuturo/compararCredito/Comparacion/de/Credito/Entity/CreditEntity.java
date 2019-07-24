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
//	private double intereses;
	@Column
	private int plazos;
	@Column
	private String banco;
	@Column
	private String tipodecredito;
	
	public CreditEntity(){}
	
	public CreditEntity(int monto, int cuotas, int plazos, String banco, String tipodecredito) {
		super();
		this.monto = monto;
		this.cuotas = cuotas;
		this.plazos = plazos;
		this.banco = banco;
		this.tipodecredito = tipodecredito;
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

	public String getTipodecredito() {
		return tipodecredito;
	}

	public void setTipodecredito(String tipodecredito) {
		this.tipodecredito = tipodecredito;
	}

	@Override
	public String toString() {
		return "CreditEntity [id=" + id + ", monto=" + monto + ", cuotas=" + cuotas + ", plazos=" + plazos + ", banco="
				+ banco + ", tipodecredito=" + tipodecredito + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditEntity other = (CreditEntity) obj;
		if (banco == null) {
			if (other.banco != null)
				return false;
		} else if (!banco.equals(other.banco))
			return false;
		if (cuotas != other.cuotas)
			return false;
		if (id != other.id)
			return false;
		if (monto != other.monto)
			return false;
		if (plazos != other.plazos)
			return false;
		if (tipodecredito == null) {
			if (other.tipodecredito != null)
				return false;
		} else if (!tipodecredito.equals(other.tipodecredito))
			return false;
		return true;
	}
	
}
