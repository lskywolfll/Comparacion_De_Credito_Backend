package cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reportes")
public class ReportesEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long identificador;
	
	private String tipodereporte;
	private int id;
	private String comentario;
	
	public ReportesEntity() {}

	public ReportesEntity(String tipodereporte, int id, String comentario) {
		this.tipodereporte = tipodereporte;
		this.id = id;
		this.comentario = comentario;
	}

	public long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(long identificador) {
		this.identificador = identificador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipodereporte() {
		return tipodereporte;
	}

	public void setTipodereporte(String tipodereporte) {
		this.tipodereporte = tipodereporte;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
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
		return "ReportesEntity [identificador=" + identificador + ", tipodereporte=" + tipodereporte + ", id=" + id
				+ ", comentario=" + comentario + "]";
	}

}
