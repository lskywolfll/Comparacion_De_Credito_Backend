package cl.programatufuturo.compararCredito.Comparacion.de.Credito.models;

public class Credit {
	
	private long id;
	private String banco;
	private int monto;
	private double intereses;
	private double cae;
	private int cuotas;
	private int valor_cuota;
	private int total;
	
	public Credit(long id,String banco, int monto, double intereses, double cae, int cuotas) {
		this.id = id;
		this.banco = banco;
		this.monto = monto;
		this.intereses = intereses;
		this.cae = cae;
		this.cuotas = cuotas;
		this.valor_cuota = (int) ((this.monto - (( (this.intereses + Math.pow(1 + this.intereses,this.cuotas)) / (Math.pow(1 + this.intereses, this.cuotas) - 1) ))) / 4.4);
		this.total = this.valor_cuota * this.cuotas;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public double getIntereses() {
		return intereses;
	}

	public void setIntereses(double intereses) {
		this.intereses = intereses;
	}

	public double getCae() {
		return cae;
	}

	public void setCae(double cae) {
		this.cae = cae;
	}

	public int getCuotas() {
		return cuotas;
	}

	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
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
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Credit [banco=" + banco + ", monto=" + monto + ", intereses=" + intereses + ", cae=" + cae + ", cuotas="
				+ cuotas + ", valorCuota=" + valor_cuota + ", total=" + total + "]";
	}
}
