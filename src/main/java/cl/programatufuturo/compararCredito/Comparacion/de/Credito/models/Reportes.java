package cl.programatufuturo.compararCredito.Comparacion.de.Credito.models;

public class Reportes {
	
	private String tipodereporte;
	private int id;
	private String comentario;
	
	public Reportes(){}
	
	public Reportes(String tipodereportes,int id,String comentario) {
		this.tipodereporte = tipodereportes;
		this.id = id;
		this.comentario = comentario;
	}

	public String getTipodereporte() {
		return tipodereporte;
	}

	public void setTipodereporte(String tipodereporte) {
		this.tipodereporte = tipodereporte;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Reportes [tipodereporte=" + tipodereporte + ", id=" + id + ", comentario=" + comentario + "]";
	}
	
}
