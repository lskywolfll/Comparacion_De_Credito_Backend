package cl.programatufuturo.compararCredito.Comparacion.de.Credito.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.Request
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.models.Credit;

@RestController
@RequestMapping("/api/creditos")
public class CreditoController {

	@PostMapping("createCredit")
	public Credit addcredit(@RequestBody Credit credito ) {
		return credito;
	}
	
	//Testear
	@DeleteMapping("deleteCredit")
	public int deletecredit(@RequestParam int id) {
		return id;
	}
	
	@GetMapping("compare")
	public Credit comparecredit( Credit firstcredit, Credit secondcredit) {
		return null;
	}

	@GetMapping("simulations")
	public Credit simulation(@RequestBody Credit credito) {
		return credito;
	}
	
	@PutMapping("editCredit")
	public Credit editcredit(@RequestBody Credit credito) {
		return credito;
	}

}
