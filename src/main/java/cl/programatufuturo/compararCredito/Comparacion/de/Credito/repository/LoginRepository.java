package cl.programatufuturo.compararCredito.Comparacion.de.Credito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity.LoginEntity;


@Repository
public interface LoginRepository extends JpaRepository<LoginEntity, Long>{
	//Metodos para la base de datos
}
