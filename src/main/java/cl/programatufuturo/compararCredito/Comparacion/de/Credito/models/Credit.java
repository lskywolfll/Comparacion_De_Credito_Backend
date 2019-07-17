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
	
}
