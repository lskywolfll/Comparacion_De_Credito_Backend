package cl.programatufuturo.compararCredito.Comparacion.de.Credito.repository;

import java.util.List;

import javax.persistence.Table;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity.UserEntity;

@Repository
@Table(name = "users")
public interface UserRepository extends JpaRepository<UserEntity, Long>{
	//metodos
	
	/**
	 * Metodos para poder encontrar un usuario por el correo y apellido
	 * @param correo
	 * @return
	 */
	public UserEntity findByCorreo(String correo);
	//List of values use List<ObjectEntity>
	/**
	 * Metodo para encontar una lista de usuarios con un nombre
	 * @param nombre
	 * @return
	 */
	public List<UserEntity> findByListNombre(String nombre);
	/**
	 * Metodo para encontrar por la identificacion que seria en este caso el rut
	 * @param rut
	 * @return
	 */
	public UserEntity findByIdentificacion(String rut);
	/**
	 * Metodo para ingresar a la pagina,logearse'
	 * @param correo
	 * @param password
	 * @return
	 */
	public UserEntity findByLogin(String correo, String password);
}
