package cl.programatufuturo.compararCredito.Comparacion.de.Credito.models;

public class Edit_report {
	private String tipo_de_reporte;
	private int id;
	
	public Edit_report(){}

	public Edit_report(String tipo_de_reporte, int id) {
		this.tipo_de_reporte = tipo_de_reporte;
		this.id = id;
	}

	public String getTipo_de_reporte() {
		return tipo_de_reporte;
	}

	public void setTipo_de_reporte(String tipo_de_reporte) {
		this.tipo_de_reporte = tipo_de_reporte;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Edit_report [tipo_de_reporte=" + tipo_de_reporte + ", id=" + id + "]";
	}
	
}
