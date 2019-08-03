package cl.programatufuturo.compararCredito.Comparacion.de.Credito.models;

public class Simulation {
	
	private int monto;
	private int cuotas;
	
	public Simulation(){}

	public Simulation(int monto, int cuotas) {
		super();
		this.monto = monto;
		this.cuotas = cuotas;
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

	@Override
	public String toString() {
		return "Simulation [monto=" + monto + ", cuotas=" + cuotas + "]";
	}
	
}
