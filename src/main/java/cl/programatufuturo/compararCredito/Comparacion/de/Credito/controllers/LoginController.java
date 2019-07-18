package cl.programatufuturo.compararCredito.Comparacion.de.Credito.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.models.Login;

@RestController
@RequestMapping("api/login")
public class LoginController {

	@GetMapping("User")
	public Login user(@RequestBody Login user){
		System.out.println("Login de usuario: " + user);
		return user;
	}
	
	@GetMapping("administracion")
	public Login administracion(@RequestBody Login administracion) {
		System.out.println("Login de ejecutivo o administrador:" + administracion);
		return administracion; 
	}

	//crear objeto para hacer el login
}
