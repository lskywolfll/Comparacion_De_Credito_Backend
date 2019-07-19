package cl.programatufuturo.compararCredito.Comparacion.de.Credito.repository;

import javax.persistence.Table;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity.UserEntity;

@Repository
@Table(name = "user")
public interface UserRepository extends JpaRepository<UserEntity, Long>{
	//metodos
}
