package cl.programatufuturo.compararCredito.Comparacion.de.Credito.repository;

import javax.persistence.Table;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity.FiltroEntity;


@Repository
@Table(name = "filtro")
public interface FiltroRepository extends JpaRepository<FiltroEntity, Long>{
	//Metodos para la base de datos
}
