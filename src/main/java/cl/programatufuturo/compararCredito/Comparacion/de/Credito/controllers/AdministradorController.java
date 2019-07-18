package cl.programatufuturo.compararCredito.Comparacion.de.Credito.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.models.Administrador;
import cl.programatufuturo.compararCredito.Comparacion.de.Credito.models.Reportes;

@Controller
@RequestMapping( value = "/api/administrador" )
public class AdministradorController {
	
	@GetMapping
	public Administrador login( Administrador admin ) {
		return null;
	}
	
//	@GetMapping
//	public Reportes report( Reportes report ) {
//		return null;
//	}
	
}
