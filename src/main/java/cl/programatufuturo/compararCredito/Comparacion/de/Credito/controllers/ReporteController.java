package cl.programatufuturo.compararCredito.Comparacion.de.Credito.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.models.Reportes;

@RestController
@RequestMapping("/api/reportes")
public class ReporteController {
	
	//Crear reportes => tipo de reporte,ID,Comentario
	@PostMapping("create")
	public Reportes create(Reportes report) {
		return report;
	}
	
	//Editar Reportes => tipo de reporte,ID
	@PutMapping("edit")
	public Reportes edit(Reportes report_edit) {
		return report_edit;
	}
	
	//eliminar un reporte => tipo de reporte, ID
	@DeleteMapping("delete")
	public Reportes delete(Reportes report_delete) {
		return report_delete;
	}
	
	//ver un reporte => tipo de reporte
	@GetMapping("show")
	public Reportes show(Reportes report_view) {
		return report_view;
	}

//	@GetMapping("report/{id}")
//	public Reportes info(  @PathVariable("id") int idreporte) {
//		return new Reportes("test",1,"prueba");
//	}
}
