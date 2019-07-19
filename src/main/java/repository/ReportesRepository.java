package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.ReportesEntity;

@Repository
public interface ReportesRepository extends JpaRepository<ReportesEntity, Long>{
	//metodos para la base de datos
}
