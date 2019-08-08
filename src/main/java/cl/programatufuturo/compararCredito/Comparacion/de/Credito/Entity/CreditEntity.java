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
	private long id_credit;
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
	
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = CreditEntity.class)
	@JoinTable(name = "simulations",joinColumns = @JoinColumn(name ="id_simulation"),
	inverseJoinColumns = @JoinColumn(name = "id_credito"))
	private List<CreditEntity> credit;

	public CreditEntity() {}

	public CreditEntity(long id,String banco,int monto,double intereses,double cae,int cuotas) {
		super();
		this.id_credit = id;
		this.banco = banco;
		this.monto = monto;
		this.intereses = intereses;
		this.cae = cae;
		this.cuotas = cuotas;
		this.valor_cuota = Math.abs((int) ((this.monto - (( (this.intereses + Math.pow(1 + this.intereses,this.cuotas)) / (Math.pow(1 + this.intereses, this.cuotas) - 1) ))) / 4.4));
		this.total = this.valor_cuota * this.cuotas;
	}

	public long getId() {
		return id_credit;
	}

	public void setId(long id_credit) {
		this.id_credit = id_credit;
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
		return "CreditEntity [id=" + id_credit + ", monto=" + monto + ", cuotas=" + cuotas + ", intereses=" + intereses
				+ ", banco=" + banco + ", valorCuota=" + valor_cuota + ", total=" + total + ", cae=" + cae + "]";
	}
	
}
