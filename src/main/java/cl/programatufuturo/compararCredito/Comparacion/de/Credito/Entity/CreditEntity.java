package cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "credit")
@NamedQuery(name = "CreditEntity.findByBanco", query = "Select c from CreditEntity c where c.banco = ?1")
@NamedQuery(name = "CreditEntity.findByAllMonto", query = "Select c from CreditEntity c where c.monto = ?1")
@NamedQuery(name = "CreditEntity.findByAllCuotas", query = "Select c from CreditEntity c where c.cuotas = ?1")
@NamedQuery(name = "CreditEntity.findByAllIntereses", query = "Select c from CreditEntity c where c.intereses = ?1")
@NamedQuery(name = "CreditEntity.findById", query = "Select c from CreditEntity c where c.id = ?1")
public class CreditEntity {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String banco;
	@Column
	private int monto;
	@Column
	private double intereses;
	@Column
	private double cae;
	@Column
	private int cuotas;
	@Column
	private int valor_cuota;
	@Column
	private int total;

	public CreditEntity() {}

	public CreditEntity(long id,String banco,int monto,double intereses,double cae,int cuotas,int valor_cuota) {
		super();
		this.id = id;
		this.banco = banco;
		this.monto = monto;
		this.intereses = intereses;
		this.cae = cae;
		this.cuotas = cuotas;
		this.valor_cuota = 0;
		this.total = 0;
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

	public double getIntereses() {
		return intereses;
	}

	public void setIntereses(double intereses) {
		this.intereses = intereses;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getValor_cuota() {
		return valor_cuota;
	}

	public void setValor_cuota(int valor_cuota) {
		this.valor_cuota = valor_cuota;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getCae() {
		return cae;
	}

	public void setCae(double cae) {
		this.cae = cae;
	}

	@Override
	public String toString() {
		return "CreditEntity [id=" + id + ", monto=" + monto + ", cuotas=" + cuotas + ", intereses=" + intereses
				+ ", banco=" + banco + ", valorCuota=" + valor_cuota + ", total=" + total + ", cae=" + cae + "]";
	}
	
}
