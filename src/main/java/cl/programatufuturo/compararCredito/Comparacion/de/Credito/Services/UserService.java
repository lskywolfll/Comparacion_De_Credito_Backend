package cl.programatufuturo.compararCredito.Comparacion.de.Credito.Services;

import org.springframework.stereotype.Service;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity.UserEntity;
import cl.programatufuturo.compararCredito.Comparacion.de.Credito.repository.UserRepository;

/**
 * Clase para definir los servicios de usuario
 * @author renea
 *
 */
@Service
public class UserService {
	private final UserRepository repoUser;
	
	public UserService(UserRepository user) {
		this.repoUser = user;
	}
	
	/**
	 * Metodo para guardar un usuario
	 * @param user
	 * @return
	 */
	public UserEntity create(UserEntity user) {
		return this.repoUser.save(user);
	}
	/**
	 * Metodo para realizar la operacion de actualizar un cliente
	 * @param user
	 * @return
	 */
	public UserEntity update(UserEntity user) {
		return this.repoUser.save(user);
	}
	/**
	 * Metodo para eliminar un usuario
	 * @param user
	 */
	public void delete(UserEntity user) {
		this.repoUser.delete(user);
	}
	/**
	 * Metodo para consultar un usuario por su identificacion
	 * @param rut
	 * @return
	 */
	public UserEntity findByIdentificacion(String rut) {
		return this.repoUser.findByIdentificacion(rut);
	}
}
