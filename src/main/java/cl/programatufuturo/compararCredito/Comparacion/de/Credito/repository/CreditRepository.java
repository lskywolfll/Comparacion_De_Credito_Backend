package cl.programatufuturo.compararCredito.Comparacion.de.Credito.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity.CreditEntity;


@Repository
public interface CreditRepository extends JpaRepository<CreditEntity, Long>{
	//Metodos para la base de datos
//	@Query("Select c from CreditEntity c where c.banco =:bancoinicio and c.banco =:bancosegundo")
//	public List<CreditEntity> find();
}
