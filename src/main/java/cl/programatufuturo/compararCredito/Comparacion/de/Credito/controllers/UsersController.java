package cl.programatufuturo.compararCredito.Comparacion.de.Credito.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.models.User;

@RestController
@RequestMapping("/api/users")
@CrossOrigin( origins = "*")
public class UsersController {

//	@Autowired
//	private UserRepository repo;
	
	// Registro

	@PostMapping( "createUser")
	public User create( @RequestBody User user ) {
		System.out.println("User: " + user);
		return user;
	}
	
	//testear
	@GetMapping("{id}")
	public User findById(@PathVariable("id") Long id){
		return new User();
	}
	
	
}
