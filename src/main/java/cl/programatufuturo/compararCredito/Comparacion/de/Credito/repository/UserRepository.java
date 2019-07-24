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
	public UserEntity findByRut(String rut);
	//List of values use List<ObjectEntity>
	public List<UserEntity> findByNombre(String nombre);
	
	public UserEntity findByIdentificacion(String rut);
}
