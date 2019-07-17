package cl.programatufuturo.compararCredito.Comparacion.de.Credito.models;

import java.util.Date;

public class User {
	
	//Propiedades necesarias para crear un usuario en la base de datos	
	private String nombre;
	private String apellido;
	private String password;
	private String rut;
	private Date fecha_de_nacimiento;
	private String genero;
	private String correo;
	private int renta;
	
	public User(){}
	
	public User(String nombre,String apellido,String password,String rut,Date fecha_de_nacimiento,String genero,String correo,int renta){
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.rut = rut;
		this.fecha_de_nacimiento = fecha_de_nacimiento;
		this.genero = genero;
		this.correo = correo;
		this.renta = renta;
	}
	
	
}
