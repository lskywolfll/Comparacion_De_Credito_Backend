package cl.programatufuturo.compararCredito.Comparacion.de.Credito.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity.SimulationEntity;
import cl.programatufuturo.compararCredito.Comparacion.de.Credito.repository.SimulationRepository;

@Service
public class SimulationService {
	private final SimulationRepository repoSimulation;
	
	public SimulationService(SimulationRepository repoSimulation) {
		this.repoSimulation = repoSimulation;
	}
	//Base de datos
	/**
	 * Metodo para crear una simulacion
	 * @param simulacion
	 * @return
	 */
	@Transactional
	public SimulationEntity create(SimulationEntity simulacion){
		return this.repoSimulation.save(simulacion);
	}
	/**
	 * Metdo para editar una simulacion
	 * @param simulacion
	 * @return
	 */
	@Transactional
	public SimulationEntity update(SimulationEntity simulacion) {
		return this.repoSimulation.save(simulacion);
	}
	/**
	 * Metodo para eliminar una simulacion
	 * @param simulacion
	 */
	@Transactional
	public void delete(SimulationEntity simulacion){
		this.repoSimulation.delete(simulacion);
	}
	/**
	 * Metodo para encontrar una lista con un sueldo especifico
	 * @param sueldo
	 * @return
	 */
	//Recibimiento de datos que no afectan a la base de datos
	public List<SimulationEntity> findBySueldo(int sueldo){
		return this.repoSimulation.findBySueldo(sueldo);
	}
	/**
	 * Metodo para encontrar una lista de simulaciones en base al credito
	 * @param montoCredito
	 * @return
	 */
	public List<SimulationEntity> findByMontoCredito(int montoCredito){
		return this.repoSimulation.findByMontoCredito(montoCredito);
	}
	/**
	 * Metodo para encontrar una lista de simulaciones en base a los meses
	 * @param meses
	 * @return
	 */
	public List<SimulationEntity> findByMeses(int meses){
		return this.repoSimulation.findByMeses(meses);
	}
	/**
	 * Metodo para mostrar todos los resultados
	 * @return
	 */
	public List<SimulationEntity> findAll(){
		return this.repoSimulation.findAll();
	}
	/**
	 * Metodo para encontrar una simulacion en base al id
	 * @param id
	 * @return
	 */
	public SimulationEntity findById(long id) {
		return this.repoSimulation.findById(id);
	}
	/**
	 * Metodo para eliminar todas las simulaciones creadas
	 */
	public void deleteAll(){
		this.repoSimulation.deleteAll();
	}
	/**
	 * Metodo para eliminar una simulacion con el id
	 * @param id
	 */
	public void delete(long id){
		this.repoSimulation.deleteById(id);
	}
	
}
