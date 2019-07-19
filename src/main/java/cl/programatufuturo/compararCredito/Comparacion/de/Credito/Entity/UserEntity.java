package cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
//Propiedades necesarias para crear un usuario en la base de datos	
	private String nombre;
	private String apellido;
	private String password;
	private String rut;
//	private Date fecha_de_nacimiento;
	private String fecha_de_nacimiento;
	private String genero;
	private String correo;
	private int renta;
	
	public UserEntity(){}
	
	public UserEntity(String nombre, String apellido, String password, String rut, String fecha_de_nacimiento,
			String genero, String correo, int renta) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.rut = rut;
		this.fecha_de_nacimiento = fecha_de_nacimiento;
		this.genero = genero;
		this.correo = correo;
		this.renta = renta;
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

	public int getRenta() {
		return renta;
	}

	public void setRenta(int renta) {
		this.renta = renta;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", password=" + password
				+ ", rut=" + rut + ", fecha_de_nacimiento=" + fecha_de_nacimiento + ", genero=" + genero + ", correo="
				+ correo + ", renta=" + renta + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserEntity other = (UserEntity) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		if (fecha_de_nacimiento == null) {
			if (other.fecha_de_nacimiento != null)
				return false;
		} else if (!fecha_de_nacimiento.equals(other.fecha_de_nacimiento))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (renta != other.renta)
			return false;
		if (rut == null) {
			if (other.rut != null)
				return false;
		} else if (!rut.equals(other.rut))
			return false;
		return true;
	}
	
}
