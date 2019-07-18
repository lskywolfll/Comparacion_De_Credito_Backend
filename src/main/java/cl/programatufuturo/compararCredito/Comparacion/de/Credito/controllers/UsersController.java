package cl.programatufuturo.compararCredito.Comparacion.de.Credito.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.models.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	// Registro
	@PostMapping( "createUser")
	public User crear( @RequestBody User user ) {
		System.out.println("User: " + user);
		return user;
	}
	
	//testear
	@GetMapping("{id}")
	public String info(  @PathVariable("id") int idUsuario,@RequestParam int renta,String nombre,String apellido) {
		System.out.println("renta: " + renta + " nombre: " + nombre + " apellido: " + apellido + " id:" + idUsuario);
		return ("renta: " + renta + " nombre: " + nombre + " apellido: " + apellido + " id:" + idUsuario);
	}
	
}
