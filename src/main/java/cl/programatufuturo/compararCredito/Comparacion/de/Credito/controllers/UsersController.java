package cl.programatufuturo.compararCredito.Comparacion.de.Credito.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity.UserEntity;
import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Services.UserService;
import cl.programatufuturo.compararCredito.Comparacion.de.Credito.models.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/users")
@CrossOrigin( origins = "*")
@Api(tags = "usuario")
public class UsersController {

	@Autowired
	private UserService repo;
	
	// Registro

	@PostMapping( "createUser")
	@ApiOperation(value = "Crear usuario", notes = "Servicio para crear un nuevo usuario")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Usuario creado correctamente"),
			@ApiResponse(code = 400, message = "Solicitud invalida") })
	public ResponseEntity<UserEntity> create(@RequestBody User user){
		UserEntity verificador = this.repo.findByIdentificacion(user.getRut());
		
		if(verificador == null){
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
		}else {
			System.out.println("Esta registrado el usuario");
			return new ResponseEntity<UserEntity>(HttpStatus.IM_USED);
		}
	}
	
	//testear
	@PutMapping("{rut}")
	public ResponseEntity<UserEntity> update(@PathVariable("rut") String rut, @RequestBody User user){
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
	
	@PostMapping("login")
	public ResponseEntity<UserEntity> login(@RequestBody User user){
		UserEntity verificador = this.repo.login(user.getCorreo(), user.getPassword());
		if(verificador == null) {
			return new ResponseEntity<UserEntity>(HttpStatus.NOT_ACCEPTABLE);
		}else {
			System.out.println("Se ha ingresado el usuario: " + verificador.getNombre());
			return new ResponseEntity<>(this.repo.login(user.getCorreo(), user.getPassword()),HttpStatus.OK);
		}
		
	}
	
	@PostMapping("login/administracion")
	public ResponseEntity<UserEntity> loginAdministracion(@RequestBody User user){
//		UserEntity prueba = new UserEntity();
//		prueba.setNombre("admin");
//		prueba.setPassword("123");
//		this.repo.create(prueba);
		
		UserEntity verificador = this.repo.loginAdministracion(user.getNombre(), user.getPassword());
		System.out.println("nombre: " + user.getNombre() + " password: " + user.getPassword());
		
		if(verificador == null && user.getNombre() == null && user.getPassword() == null) {
			return new ResponseEntity<UserEntity>(HttpStatus.NOT_ACCEPTABLE);
		}else {
			System.out.println("Se ha ingresado el usuario: " + user.getNombre());
			return new ResponseEntity<UserEntity>(this.repo.loginAdministracion(user.getNombre(), user.getPassword()), HttpStatus.OK);
		}
	}

	@DeleteMapping("{identificacion}")
	public void delete(@PathVariable("identificacion") String identificacion) {
		UserEntity user = this.repo.findByIdentificacion(identificacion);
		System.out.println(user);
		if(user != null) {
			this.repo.delete(user);
		}
	}
	
	@GetMapping("lista")
	public ResponseEntity<List<UserEntity>> findAll(){
		return ResponseEntity.ok(this.repo.findAll());
	}
	
	@DeleteMapping("delete/all")
	public void deleteAll() {
		this.repo.deleteAll();
	}
	
	@GetMapping("logged/{correo}/{password}")
	public ResponseEntity<UserEntity> loged(@PathVariable("correo") String correo,@PathVariable("password") String password){
		UserEntity user = this.repo.findByCorreoAndPassword(correo, password);
		
		if(user == null) {
			return new ResponseEntity<UserEntity>(HttpStatus.NOT_ACCEPTABLE);
		}else {
			return new ResponseEntity<>(this.repo.findByCorreoAndPassword(correo, password), HttpStatus.OK);
		}
	}
	
}
