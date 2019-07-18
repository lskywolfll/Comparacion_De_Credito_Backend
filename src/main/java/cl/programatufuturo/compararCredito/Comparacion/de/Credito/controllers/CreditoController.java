package cl.programatufuturo.compararCredito.Comparacion.de.Credito.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.Request
import org.springframework.web.bind.annotation.RequestMapping;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.models.Credit;

@Controller
@RequestMapping( value = "/api/creditos " )
public class CreditoController {

	@GetMapping
	public Credit addcredit( Credit credito ) {
		return null;
	}
	
	@DeleteMapping
	public Credit deletecredit( Credit credito) {
		return null;
	}
	
	@GetMapping("compare")
	public Credit comparecredit( Credit firstcredit, Credit secondcredit) {
		return null;
	}

	@GetMapping("simulations")
	public Credit simulation( Credit credito) {
		return null;
	}
	
	@PutMapping
	public Credit editcredit( Credit credito) {
		return null;
	}

}
