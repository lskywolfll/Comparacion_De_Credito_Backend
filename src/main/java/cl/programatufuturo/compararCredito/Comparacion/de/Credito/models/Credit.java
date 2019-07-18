package cl.programatufuturo.compararCredito.Comparacion.de.Credito.models;

public class Credit {
	
	private int monto;
	private int cuotas;
//	private double intereses;
	private int plazos;
	private String banco;
	private String tipodecredito;
	
	public Credit(int monto, int plazos, String banco,int cuotas,String tipodecredito) {
		super();
		this.monto = monto;
		this.cuotas = cuotas;
		this.plazos = plazos;
		this.banco = banco;
		this.tipodecredito = tipodecredito;
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
		return "Credit [monto=" + monto + ", cuotas=" + cuotas + ", plazos=" + plazos + ", banco=" + banco
				+ ", tipodecredito=" + tipodecredito + "]";
	}
	
}
