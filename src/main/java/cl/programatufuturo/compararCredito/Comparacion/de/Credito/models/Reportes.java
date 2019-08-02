package cl.programatufuturo.compararCredito.Comparacion.de.Credito.models;

public class Reportes {
	
	private String tipo_de_reporte;
	private String comentario;
	
	public Reportes(){}

	public Reportes(String tipo_de_reporte, String comentario) {
		super();
		this.tipo_de_reporte = tipo_de_reporte;
		this.comentario = comentario;
	}

	public String getTipo_de_reporte() {
		return tipo_de_reporte;
	}

	public void setTipo_de_reporte(String tipo_de_reporte) {
		this.tipo_de_reporte = tipo_de_reporte;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Reportes [tipo_de_reporte=" + tipo_de_reporte + ", comentario=" + comentario + "]";
	}
	
	
}
