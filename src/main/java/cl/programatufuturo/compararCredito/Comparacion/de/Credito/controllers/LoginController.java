package cl.programatufuturo.compararCredito.Comparacion.de.Credito.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.models.Login;

@RestController
@RequestMapping("api/login")
public class LoginController {

//	Aqui deberia ir los servicios para hacer las validaciones de los datos
//	@Autowired
//	private LoginRepository repo;
	
	//Datos sensibles entonces se hacen por post en vez del get, get se usa mayorment en datos que no afecten realmente en cosas senbiles de nuestro usuario
	@PostMapping("User")
	public Login user(@RequestBody Login user){
		System.out.println("Login de usuario: " + user);
		return user;
	}
	
	@GetMapping("administracion")
	public Login administracion(@RequestBody Login administracion) {
		//NT: Crear login con el administrador y el ejecutivo
		System.out.println("Login de ejecutivo o administrador:" + administracion);
		return administracion; 
	}

	//crear objeto para hacer el login
}
