package cl.programatufuturo.compararCredito.Comparacion.de.Credito.models;

public class Reportes {
	
	private String tipodereporte;
	private int id;
	private String comentario;
	
	public Reportes(){}
	
	public Reportes(String tipodereporte) {
		this.tipodereporte = tipodereporte;
	}

	public Reportes(String tipodereporte,int id) {
		this.tipodereporte = tipodereporte;
		this.id = id;
	}
	
	public Reportes(String tipodereportes,int id,String comentario) {
		this.tipodereporte = tipodereportes;
		this.id = id;
		this.comentario = comentario;
	}
	
	
}
