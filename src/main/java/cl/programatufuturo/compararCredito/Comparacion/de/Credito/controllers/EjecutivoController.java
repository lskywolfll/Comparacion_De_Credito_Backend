package cl.programatufuturo.compararCredito.Comparacion.de.Credito.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.models.Credit;
import cl.programatufuturo.compararCredito.Comparacion.de.Credito.models.Ejecutivo;
import cl.programatufuturo.compararCredito.Comparacion.de.Credito.models.Reportes;

@Controller
@RequestMapping( value = "/api/ejecutivos" )
public class EjecutivoController {
	
//	@GetMapping
//	public Ejecutivo login( Ejecutivo ejecutivo) {
//		return null;
//	}
	
	@GetMapping
	public Reportes report( Reportes report) {
		return null;
	}
	
	//modificar creditos, modificar informacion personal, revisa estadisticas de usuario, puede mirar los registros de reporte(report)
	// eliminar historail de reportes hechos(ejecutivo) y puede ver historial, acceso a la informacion del usuario, al ultimo(chat con cliente)
	
}
