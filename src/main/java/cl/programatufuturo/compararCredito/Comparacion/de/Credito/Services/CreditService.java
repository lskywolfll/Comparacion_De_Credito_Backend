package cl.programatufuturo.compararCredito.Comparacion.de.Credito.Services;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity.CreditEntity;
import cl.programatufuturo.compararCredito.Comparacion.de.Credito.repository.CreditRepository;

/**
 * Clase para definir servicios de creditos
 * @author renea
 *
 */
@Service
public class CreditService {
	private final CreditRepository repoCredit;

	public CreditService(CreditRepository repoCredit) {
		this.repoCredit = repoCredit;
	}
	/**
	 * Metodo para crear un credito
	 * @param credit
	 * @return
	 */
	@Transactional
	public CreditEntity create(CreditEntity credit) {
		return this.repoCredit.save(credit);
	}
	/**
	 * Metodo para actualizar informacion del credito
	 * @param credit
	 * @return
	 */
	@Transactional
	public CreditEntity update(CreditEntity credit) {
		return this.repoCredit.save(credit);
	}
	/**
	 * Metodo para eliminar un credito
	 * @param credit
	 */
	@Transactional
	public void delete(CreditEntity credit) {
		this.repoCredit.delete(credit);
	}
	/**
	 * Metodo para encontrar creditos con un monto y cuotas dado como parametros
	 * @param monto
	 * @param cuotas
	 * @return
	 */
	public List<CreditEntity> find(int monto, int cuotas){
		return this.repoCredit.find(monto, cuotas);
	}
	/**
	 * Metodo para que me retorne una lista de credito con el nombre del banco
	 * @param banco
	 * @return
	 */
	public List<CreditEntity> findByBanco(String banco){
		return this.repoCredit.findByBanco(banco);
	}
	/**
	 * Metodo para poder obtener un credito en base al id
	 * @param id
	 * @return
	 */
	public CreditEntity findById(long id){
		return this.repoCredit.findById(id);
	}
	/**
	 * Metodo para eliminar todos los creditos
	 */
	public void deleteAll(){
		 this.repoCredit.deleteAll();
	}
	/**
	 * Metodo para encontrar todos los creditos
	 * @return
	 */
	public List<CreditEntity> findAll(){
		return this.repoCredit.findAll();
	}
	/**
	 * Metodo para encontrar un credito con un monto dado y con una cantidad de cuotas
	 * @param monto
	 * @param cuotas
	 * @return
	 */
	public List<CreditEntity> findByMontoAndCuotas(int monto,int cuotas){
		return this.repoCredit.find(monto, cuotas);
	}
	/**
	 * Metodo para encontrar un credito con un monto dado y me devuelve todos los creditos con ese monto
	 * @param monto
	 * @return
	 */
	public List<CreditEntity> findByMonto(int monto) {
		return this.repoCredit.findByAllMonto(monto);
	}
	/**
	 * Metodo para encontrar una lista de creditos con esa cantidad de cuotas
	 * @param cuotas
	 * @return
	 */
	public List<CreditEntity> findByCuotas(int cuotas){
		return this.repoCredit.findByAllCuotas(cuotas);
	}
	/**
	 * Metodo para encontrar una lista de creditos con una tasa de interes dado
	 * @param intereses
	 * @return
	 */
	public List<CreditEntity> findByAllIntereses(double intereses){
		return this.repoCredit.findByAllIntereses(intereses);
	}
	
	
//	public CreditEntity simulation(int monto,int plazos,int sueldo, int bancoId) {
//		return this.repoCredit.simular(monto,plazo,sueldo,bancoId);
//	}
}
