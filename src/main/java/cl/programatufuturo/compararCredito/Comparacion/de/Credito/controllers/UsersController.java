package cl.programatufuturo.compararCredito.Comparacion.de.Credito.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity.UserEntity;
import cl.programatufuturo.compararCredito.Comparacion.de.Credito.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	@Autowired
	private UserRepository repo;
	
	// Registro
	@PostMapping( "createUser")
	public UserEntity create( @RequestBody UserEntity user ) {
		System.out.println("User: " + user);
		repo.save(user);
		return user;
	}
	
	//testear
	@GetMapping("{id}")
	public UserEntity findById(@PathVariable("id") Long id){
		return repo.findById(id).get();
	}
	
	
}
