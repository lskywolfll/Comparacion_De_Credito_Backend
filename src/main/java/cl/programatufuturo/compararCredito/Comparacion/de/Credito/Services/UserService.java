package cl.programatufuturo.compararCredito.Comparacion.de.Credito.Services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity.UserEntity;
import cl.programatufuturo.compararCredito.Comparacion.de.Credito.repository.UserRepository;

/**
 * Clase para definir los servicios de usuario
 * @author renea
 *
 *NT:Transactional de spring -> cuando nosotros tenemos algunas @Transactional pero queremos hacerlas todas
 *entonces en ese caso nos viene bien usar una al inicio y dejar de solamente lectura a las que no tengan el transactional :)
 */
//@Transactional(readOnly = true) -> establece que todos los que no tienen el transactional sean simplemente de lectura de datos, sin poder cambiar algo en la base de datos
@Service
public class UserService {
	private final UserRepository repoUser;
	
	public UserService(UserRepository repoUser) {
		this.repoUser = repoUser;
	}
	
	/**
	 * Metodo para guardar un usuario, osea no tendria un id para que ya que seria nuevo
	 * @param user
	 * @return
	 */
	@Transactional
	public UserEntity create(UserEntity user) {
		return this.repoUser.save(user);
	}
	/**
	 * Metodo para realizar la operacion de actualizar un cliente por ende ya posee un id y actualiza simplemente el contenido
	 * @param user
	 * @return
	 */
	@Transactional
	public UserEntity update(UserEntity user) {
		return this.repoUser.save(user);
	}
	/**
	 * Metodo para eliminar un usuario
	 * @param user
	 */
	@Transactional
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
