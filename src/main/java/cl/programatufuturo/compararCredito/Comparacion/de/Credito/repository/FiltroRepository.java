package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.FiltroEntity;

@Repository
public interface FiltroRepository extends JpaRepository<FiltroEntity, Long>{
	//Metodos para la base de datos
}
