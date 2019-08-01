package cl.programatufuturo.compararCredito.Comparacion.de.Credito.controllers;

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
	
	//Testear
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") long id) {
		CreditEntity credit = this.service.findById(id);
		if(credit != null) {
			this.service.delete(credit);
		}
	}
	
//	@GetMapping("comparar/{}")
//	public Credit comparecredit(@RequestBody Credit firstcredit,@RequestBody Credit secondcredit) {
//		return null;
//	}
	
	@PutMapping("editCredit/{id}")
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

	
}
