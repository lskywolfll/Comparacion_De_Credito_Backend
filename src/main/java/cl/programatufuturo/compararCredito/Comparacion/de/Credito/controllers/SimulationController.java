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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity.SimulationEntity;
import cl.programatufuturo.compararCredito.Comparacion.de.Credito.Services.SimulationService;
import cl.programatufuturo.compararCredito.Comparacion.de.Credito.models.Simulation;

@RestController
@RequestMapping("api/simulations")
public class SimulationController {
	
	@Autowired
	private SimulationService repoSimulation;

	@PostMapping("create")
	public ResponseEntity<SimulationEntity> create(@RequestBody Simulation simulacion){
		SimulationEntity simulation = new SimulationEntity();
		
		simulation.setMonto(simulacion.getMonto());
		simulacion.setCuotas(simulacion.getCuotas());
		
		return new ResponseEntity<>(this.repoSimulation.create(simulation), HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") long id){
		this.repoSimulation.findById(id);
	}
	
	@PutMapping("edit/{id}")
	public ResponseEntity<SimulationEntity> edit(@PathVariable("id") long id,@RequestBody Simulation simulacion){
		SimulationEntity simulation = this.repoSimulation.findById(id);
		
		if(simulation == null) {
			return new ResponseEntity<SimulationEntity>(HttpStatus.NOT_FOUND);
		}else {
			simulation.setMonto(simulacion.getMonto());
			simulation.setCuotas(simulacion.getCuotas());
		}
		
		return new ResponseEntity<>(this.repoSimulation.update(simulation), HttpStatus.OK);
	}
	
	@DeleteMapping("delete/all")
	public void deleteAll(){
		this.repoSimulation.deleteAll();
	}
	
	@GetMapping("lista")
	public ResponseEntity<List<SimulationEntity>> findAll(){
		return ResponseEntity.ok(this.repoSimulation.findAll());
	}
}
