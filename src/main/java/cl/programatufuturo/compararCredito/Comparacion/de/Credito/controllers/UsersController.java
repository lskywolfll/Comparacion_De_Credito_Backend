package cl.programatufuturo.compararCredito.Comparacion.de.Credito.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.models.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	// Registro
	@PostMapping( "crear")
	public User crear( @RequestBody User user ) {
		return user;
	}
	
	//Login
	@PostMapping( "login" )
	public User login( @RequestBody User user ) {
		return user;
	}
	
	@GetMapping("{id}")
	public User info(  @PathVariable("id") int idUsuario) {
		return new User("s", null, null, null, null, null, null, 0);
	}
	
//	@GetMapping
//	public Reportes historial( Reportes report) {
//		return null;
//	}
//	
	
}
