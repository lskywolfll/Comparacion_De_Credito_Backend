package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.CreditEntity;

@Repository
public interface CreditRepository extends JpaRepository<CreditEntity, Long>{
	//Metodos para la base de datos
}
