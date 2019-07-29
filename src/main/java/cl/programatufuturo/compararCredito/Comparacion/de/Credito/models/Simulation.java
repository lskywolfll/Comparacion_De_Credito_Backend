package cl.programatufuturo.compararCredito.Comparacion.de.Credito.models;

public class Simulation {
	
	private int montoCredito;
	private int meses;
	private int sueldo;
	
	public Simulation(){}

	public Simulation(int montoCredito, int meses, int sueldo) {
		this.montoCredito = montoCredito;
		this.meses = meses;
		this.sueldo = sueldo;
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
		return "Simulation [montoCredito=" + montoCredito + ", meses=" + meses + ", sueldo=" + sueldo + "]";
	}
	
	
}
