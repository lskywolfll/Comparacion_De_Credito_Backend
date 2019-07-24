package cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@NamedQuery(name = "users.findByIdentificacion", query = "Select u from UserEntity u where u.rut = ?1")
public class UserEntity {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
//Propiedades necesarias para crear un usuario en la base de datos
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String password;
	@Column
	private String rut;
//	private Date fecha_de_nacimiento;
	@Column
	private String fecha_de_nacimiento;
	@Column
	private String genero;
	@Column
	private String correo;
	@Column
	private int sueldo_bruto;
	
	public UserEntity(){}
	
	public UserEntity(String nombre, String apellido, String password, String rut, String fecha_de_nacimiento,
			String genero, String correo, int sueldo_bruto) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.rut = rut;
		this.fecha_de_nacimiento = fecha_de_nacimiento;
		this.genero = genero;
		this.correo = correo;
		this.sueldo_bruto = sueldo_bruto;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getFecha_de_nacimiento() {
		return fecha_de_nacimiento;
	}

	public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
		this.fecha_de_nacimiento = fecha_de_nacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getSueldo_bruto() {
		return sueldo_bruto;
	}

	public void setSueldo_bruto(int sueldo_bruto) {
		this.sueldo_bruto = sueldo_bruto;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", password=" + password
				+ ", rut=" + rut + ", fecha_de_nacimiento=" + fecha_de_nacimiento + ", genero=" + genero + ", correo="
				+ correo + ", sueldo_bruto=" + sueldo_bruto + "]";
	}
	
}
