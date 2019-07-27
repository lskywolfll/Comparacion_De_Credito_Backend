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
	public ResponseEntity<UserEntity> login(String correo,String password){
		UserEntity verificador = this.repo.login(correo, password);
		if(verificador == null) {
			return new ResponseEntity<UserEntity>(HttpStatus.NOT_ACCEPTABLE);
		}else {
			System.out.println("Correo:" + correo + "password" + password);
		}
		
		return new ResponseEntity<>(this.repo.login(correo, password),HttpStatus.OK);
	}
	/**
	 * Metodo para eliminar un usuario
	 * @param identificacion
	 */
	@DeleteMapping("{indetificacion}")
	public void delete(@PathVariable("identificacion") String identificacion) {
		UserEntity user = this.repo.findByIdentificacion(identificacion);
		if(user != null) {
			this.repo.delete(user);
		}
	}
	/**
	 * Metodo para recibir una lista de usuarios
	 * @return
	 */
	@GetMapping("lista")
	public ResponseEntity<List<UserEntity>> findAll(){
		return ResponseEntity.ok(this.repo.findAll());
	}
}
