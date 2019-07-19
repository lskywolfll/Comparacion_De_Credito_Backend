package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.Edit_reportEntity;

@Repository
public interface Edit_reportRepository extends JpaRepository<Edit_reportEntity, Long>{
	//Metodos para la base de datos
}
