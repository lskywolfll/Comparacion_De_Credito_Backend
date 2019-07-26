package cl.programatufuturo.compararCredito.Comparacion.de.Credito.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity.CreditEntity;


@Repository
public interface CreditRepository extends JpaRepository<CreditEntity, Long>{
	//Metodos para la base de datos
	/**
	 * Metodo para recibir una lista de creditos en este caso en base al monto y la cantidad de cuotas
	 * @param monto
	 * @param cuotas
	 * @return
	 */
	@Query("Select c from CreditEntity c where c.monto =:monto and c.cuotas =:cuotas")
	public List<CreditEntity> find(@Param("monto") int monto,@Param("cuotas") int cuotas);
	/**
	 * Metodo para encontrar un banco por el nombre
	 * @param banco
	 * @return
	 */
	public List<CreditEntity> findByBanco(String banco);
	/**
	 * Metodo para encontrar por el monto del credito
	 * @param monto
	 * @return
	 */
	public CreditEntity findByMonto(int monto);
	/**
	 * Metodo para encontrar por la cantidad de plazo para pagar
	 * @param plazos
	 * @return
	 */
	public CreditEntity findByPlazos(int plazos);
	/**
	 * Metodo para encontrar por la cantidad de intereses
	 * @param intereses
	 * @return
	 */
	public CreditEntity findByIntereses(double intereses);
	
}
