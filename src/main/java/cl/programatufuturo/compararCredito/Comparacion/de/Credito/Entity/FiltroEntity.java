package cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "filtro")
public class FiltroEntity {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String tipo_de_reporte;
	
	public FiltroEntity() {}

	public FiltroEntity(String tipo_de_reporte) {
		super();
		this.tipo_de_reporte = tipo_de_reporte;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo_de_reporte() {
		return tipo_de_reporte;
	}

	public void setTipo_de_reporte(String tipo_de_reporte) {
		this.tipo_de_reporte = tipo_de_reporte;
	}

	@Override
	public String toString() {
		return "FiltroEntity [id=" + id + ", tipo_de_reporte=" + tipo_de_reporte + "]";
	}
	
}
