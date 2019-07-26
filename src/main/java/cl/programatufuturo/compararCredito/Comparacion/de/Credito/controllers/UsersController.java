package cl.programatufuturo.compararCredito.Comparacion.de.Credito.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity.UserEntity;
import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Services.UserService;
import cl.programatufuturo.compararCredito.Comparacion.de.Credito.models.User;

@RestController
@RequestMapping("/api/users")
@CrossOrigin( origins = "*")
public class UsersController {

	@Autowired
	private UserService repo;
	
	// Registro

	@PostMapping( "createUser")
	public ResponseEntity<UserEntity> create(@RequestBody User user){
		UserEntity usuario = new UserEntity();
		
		usuario.setNombre(user.getNombre());
		usuario.setApellido(user.getApellido());
		usuario.setPassword(user.getPassword());
		usuario.setRut(user.getRut());
		usuario.setFecha_de_nacimiento(user.getFecha_de_nacimiento());
		usuario.setGenero(user.getGenero());
		usuario.setCorreo(user.getCorreo());
		usuario.setSueldo_bruto(user.getSueldo_bruto());
		
		System.out.println(usuario);
		return new ResponseEntity<UserEntity>(this.repo.create(usuario), HttpStatus.CREATED);		
	}
	
	//testear
	@PutMapping("{rut}")
	public ResponseEntity<UserEntity> update(@PathVariable("rut") String rut,User user){
		UserEntity usuario = this.repo.findByIdentificacion(rut);
		
		if(usuario  == null) {
			return new ResponseEntity<UserEntity>(HttpStatus.NOT_FOUND);
		}else{
			usuario.setNombre(user.getNombre());
			usuario.setApellido(user.getApellido());
			usuario.setPassword(user.getPassword());
			usuario.setRut(user.getRut());
			usuario.setFecha_de_nacimiento(user.getFecha_de_nacimiento());
			usuario.setGenero(user.getGenero());
			usuario.setCorreo(user.getCorreo());
			usuario.setSueldo_bruto(user.getSueldo_bruto());
			System.out.println(usuario);
		}
		
		return new ResponseEntity<>(this.repo.update(usuario), HttpStatus.OK);
	}
	
	
}
