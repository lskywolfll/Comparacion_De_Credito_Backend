package cl.programatufuturo.compararCredito.Comparacion.de.Credito.Services;

import java.util.List;

import javax.management.RuntimeErrorException;

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
	/**
	 * Metodo para logearse el usuario
	 * @param correo
	 * @param password
	 * @return
	 */
	public UserEntity login(String correo, String password) {
		UserEntity verificacion = this.repoUser.findByLogin(correo, password);
		if(null == verificacion) {
			throw new RuntimeException("error");
		}
		return this.repoUser.findByLogin(correo, password);
	}
	/**
	 * Metodo para recibir una lista de usuarios (michael ->hola rene te quiero mucho :3), yo tbm
	 * @return
	 */
	public List<UserEntity> findAll(){
		return this.repoUser.findAll();
	}
	/**
	 * Eliminar todos los usuarios para dejar en blanco la bd con los datos, por ahora falta que nosotros hagamos los foreign key(id externos de otra tabla)
	 */
	public void deleteAll(){
		this.repoUser.deleteAll();
	}
	
}
