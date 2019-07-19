package cl.programatufuturo.compararCredito.Comparacion.de.Credito.repository;

import javax.persistence.Table;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity.ReportesEntity;

@Repository
@Table(name = "report")
public interface ReportesRepository extends JpaRepository<ReportesEntity, Long>{
	//metodos para la base de datos
}
