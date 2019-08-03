package cl.programatufuturo.compararCredito.Comparacion.de.Credito.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.models.Edit_report;
import cl.programatufuturo.compararCredito.Comparacion.de.Credito.models.Filtro;
import cl.programatufuturo.compararCredito.Comparacion.de.Credito.models.Reportes;

@RestController
@RequestMapping("/api/reportes")
@CrossOrigin( origins = "*")
public class ReporteController {
	
	//Crear reportes => tipo de reporte,ID,Comentario
	@PostMapping("create")
	public Reportes create(@RequestBody Reportes report) {
		System.out.println("Reporte creado: " + report);
		return report;
	}
	
	//Editar Reportes => tipo de reporte,ID,Comentario
	@PutMapping("edit")
	public Reportes edit(@RequestBody Reportes report_edit) {
		System.out.println("Reporte editado: " + report_edit);
		return report_edit;
	}
	
	//eliminar un reporte => tipo de reporte, ID
	@DeleteMapping("delete")
	public Edit_report delete(@RequestBody Edit_report report_delete) {
		System.out.println("Eliminar reporte: " + report_delete);
		return report_delete;
	}
	
	//ver un reporte => tipo de reporte
	@GetMapping("show")
	public Filtro show(@RequestBody Filtro report_view) {
		System.out.println("Filtro: " + report_view);
		return report_view;
	}

//	@GetMapping("report/{id}")
//	public Reportes info(  @PathVariable("id") int idreporte) {
//		return new Reportes("test",1,"prueba");
//	}
	
}
