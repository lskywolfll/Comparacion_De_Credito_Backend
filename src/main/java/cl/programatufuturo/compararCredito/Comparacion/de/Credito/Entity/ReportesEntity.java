package cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reportes")
public class ReportesEntity {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String tipodereporte;
	@Column
	private String comentario;
	
	public ReportesEntity() {}

	public ReportesEntity(long id, String tipodereporte, String comentario) {
		super();
		this.id = id;
		this.tipodereporte = tipodereporte;
		this.comentario = comentario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipodereporte() {
		return tipodereporte;
	}

	public void setTipodereporte(String tipodereporte) {
		this.tipodereporte = tipodereporte;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "ReportesEntity [id=" + id + ", tipodereporte=" + tipodereporte + ", comentario=" + comentario + "]";
	}

}
