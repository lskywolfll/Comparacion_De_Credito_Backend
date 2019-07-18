package cl.programatufuturo.compararCredito.Comparacion.de.Credito.models;

public class Filtro {
	
	private String tipo_de_reporte;
	
	public Filtro(){}

	public Filtro(String tipo_de_reporte) {
		this.tipo_de_reporte = tipo_de_reporte;
	}

	public String getTipo_de_reporte() {
		return tipo_de_reporte;
	}

	public void setTipo_de_reporte(String tipo_de_reporte) {
		this.tipo_de_reporte = tipo_de_reporte;
	}

	@Override
	public String toString() {
		return "Filtro [tipo_de_reporte=" + tipo_de_reporte + "]";
	}
	
}
