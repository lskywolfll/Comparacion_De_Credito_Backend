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
	public List<CreditEntity> find(@Param("monto") int monto,@Param("cuotas") int cuotas){
		return this.repoCredit.find(monto, cuotas);
	}
	/**
	 * Metodo para encontar una lista de creditos con el nombre del banco
	 * @param banco
	 * @return
	 */
	public List<CreditEntity> findByBanco(String banco){
		return this.repoCredit.findByBanco(banco);
	}
}
