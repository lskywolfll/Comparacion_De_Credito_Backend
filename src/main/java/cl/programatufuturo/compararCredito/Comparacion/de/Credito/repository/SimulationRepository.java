package cl.programatufuturo.compararCredito.Comparacion.de.Credito.repository;

import java.util.List;

import javax.persistence.Table;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity.SimulationEntity;

@Repository
@Table(name = "simulations")
public interface SimulationRepository extends JpaRepository<SimulationEntity, Long>{
	/**
	 * Metodo para poder tener todas las simulaciones
	 */
	public List<SimulationEntity> findAll();
	/**
	 * Metodo par poder tener una lista de simulaciones con un sueldo establecido
	 * @param sueldo
	 * @return
	 */
	public List<SimulationEntity> findByListSueldo(int sueldo);
	/**
	 * Metodo para poder tener una lista en base al credito querido
	 * @param credito
	 * @return
	 */
	public List<SimulationEntity> findByListCredito(int credito);
	//meotodos para encontrar solo una simulacion ej: en relacion al sueldo,credito,plazo
	public SimulationEntity findByMeses(int meses);
}
