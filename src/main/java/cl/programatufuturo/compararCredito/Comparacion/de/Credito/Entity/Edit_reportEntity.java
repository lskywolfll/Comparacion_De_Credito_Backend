package cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "edit_report")
public class Edit_reportEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long identificador;
	
	private String tipo_de_reporte;
	private int id;
	
	public Edit_reportEntity(){}

	public Edit_reportEntity(String tipo_de_reporte, int id) {
		super();
		this.tipo_de_reporte = tipo_de_reporte;
		this.id = id;
	}

	public long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(long identificador) {
		this.identificador = identificador;
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
		return "Edit_reportEntity [identificador=" + identificador + ", tipo_de_reporte=" + tipo_de_reporte + ", id="
				+ id + "]";
	}
	
}
