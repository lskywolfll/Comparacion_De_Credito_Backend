package cl.programatufuturo.compararCredito.Comparacion.de.Credito.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.Request
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity.CreditEntity;
import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Services.CreditService;
import cl.programatufuturo.compararCredito.Comparacion.de.Credito.models.Credit;

@RestController
@RequestMapping("/api/creditos")
public class CreditoController {
	
	@Autowired
	CreditService service;

	@PostMapping("create")
	public ResponseEntity<CreditEntity> create(@RequestBody Credit credit){
		CreditEntity credito = new CreditEntity();
		
		credito.setBanco(credit.getBanco());
		credito.setMonto(credit.getMonto());
		credito.setIntereses(credit.getIntereses());
		credito.setCae(credit.getCae());
		credito.setValor_cuota(credit.getValor_cuota());
		credito.setTotal(credit.getTotal());
		
		System.out.println(credito);
		return new ResponseEntity<>(this.service.create(credito), HttpStatus.CREATED);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") long id) {
		CreditEntity credit = this.service.findById(id);
		if(credit != null) {
			this.service.delete(credit);
		}
	}
	
	@PutMapping("edit/{id}")
	public ResponseEntity<CreditEntity> update(@PathVariable("id") long id,@RequestBody Credit credit){
		CreditEntity credito = this.service.findById(id);
		
		if(credito == null) {
			return new ResponseEntity<CreditEntity>(HttpStatus.NOT_FOUND);
		}else {
			credito.setBanco(credit.getBanco());
			credito.setMonto(credit.getMonto());
			credito.setIntereses(credit.getIntereses());
			credito.setCae(credit.getCae());
			credito.setCuotas(credit.getCuotas());
			credito.setValor_cuota(credit.getValor_cuota());
			credito.setTotal(credit.getTotal());
		}
		
		return new ResponseEntity<>(this.service.update(credito), HttpStatus.OK);
	}

	@GetMapping("lista")
	public ResponseEntity<List<CreditEntity>> findAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@GetMapping("especific/{monto}/{cuotas}")
	public ResponseEntity<List<CreditEntity>> findByMontoAndCuotas(@PathVariable("monto") int monto,@PathVariable("cuotas") int cuotas){
		List<CreditEntity> credito = this.service.findByMontoAndCuotas(monto,cuotas);
		
		if(credito == null) {
			return new ResponseEntity<List<CreditEntity>>(HttpStatus.NOT_ACCEPTABLE);
		}else {
			System.out.println(credito);
			return new ResponseEntity<List<CreditEntity>>(this.service.findByMontoAndCuotas(monto,cuotas), HttpStatus.OK);
		}
	}
	
	@GetMapping("list/{monto}")
	public ResponseEntity<List<CreditEntity>> listMonto(@PathVariable("monto") int monto){
		List<CreditEntity> credito = this.service.findByMonto(monto);
		
		if(credito == null) {
			return new ResponseEntity<List<CreditEntity>>(HttpStatus.NOT_FOUND);
		}else {
			System.out.println(credito);
			return new ResponseEntity<List<CreditEntity>>(this.service.findByMonto(monto), HttpStatus.OK);
		}
	}
	
	@GetMapping("list/{intereses}")
	public ResponseEntity<List<CreditEntity>> listIntereses(@PathVariable("intereses") double intereses){
		List<CreditEntity> credito = this.service.findByAllIntereses(intereses);
		
		if(credito == null) {
			System.out.println("Error 406");
			return new ResponseEntity<List<CreditEntity>>(HttpStatus.NOT_ACCEPTABLE);
		}else {
			System.out.println(credito);
			System.out.println("Bien 200");
			return new ResponseEntity<List<CreditEntity>>(this.service.findByAllIntereses(intereses), HttpStatus.OK);
		}
	}
	
	@GetMapping("list/{cuotas}")
	public ResponseEntity<List<CreditEntity>> listCuotas(@PathVariable("cuotas") int cuotas){
		List<CreditEntity> credito = this.service.findByCuotas(cuotas);
		
		if(credito == null) {
			System.out.println("Error 406");
			return new ResponseEntity<List<CreditEntity>>(HttpStatus.NOT_ACCEPTABLE);
		}else {
			System.out.println("Bien 200");
			return new ResponseEntity<List<CreditEntity>>(this.service.findByCuotas(cuotas), HttpStatus.OK);
		}
	}
	
	@GetMapping("list/{banco}")
	public ResponseEntity<List<CreditEntity>> listBanco(@PathVariable("banco") String banco){
		List<CreditEntity> credito = this.service.findByBanco(banco);
		
		if(credito == null) {
			return new ResponseEntity<List<CreditEntity>>(HttpStatus.NOT_ACCEPTABLE);
		}else {
			return new ResponseEntity<List<CreditEntity>>(this.service.findByBanco(banco), HttpStatus.OK);
		}
	}
	
	@DeleteMapping("delete/all")
	public void deleteAll(){
		this.service.deleteAll();
	}
	
	//comparar credito
}
