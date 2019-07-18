package cl.programatufuturo.compararCredito.Comparacion.de.Credito.models;

import java.util.Date;

public class User {
	
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
	
	public User(){}
	
	public User(String nombre,String apellido,String password,String rut,String fecha_de_nacimiento,String genero,String correo,int renta){
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

	@Override
	public String toString() {
		return "User [nombre=" + nombre + ", apellido=" + apellido + ", password=" + password + ", rut=" + rut
				+ ", fecha_de_nacimiento=" + fecha_de_nacimiento + ", genero=" + genero + ", correo=" + correo
				+ ", renta=" + renta + "]";
	}
	
}
