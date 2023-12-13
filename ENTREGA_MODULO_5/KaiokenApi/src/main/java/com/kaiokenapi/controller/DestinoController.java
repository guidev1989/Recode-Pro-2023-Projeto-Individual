package com.kaiokenapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaiokenapi.models.Destino;
import com.kaiokenapi.repositories.DestinoRepository;


@RestController
@RequestMapping("/destino")
public class DestinoController {
	
	@Autowired
	private DestinoRepository cr;
	
	@GetMapping("/alldestinos")	
	public List<Destino> getAllDestinos(){
		
		return cr.findAll();
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Destino> getDestinoById(@PathVariable Long id){
		Destino destino = cr.findById(id).orElseThrow(() -> new RuntimeException(id + "Not found"));
		
		return ResponseEntity.ok(destino);
		
	}

	
	@PostMapping("/saveDestino")
	public Destino saveDestino(@RequestBody Destino destino) {
		return cr.save(destino);
}
	
	@PutMapping("/{id}")
	public ResponseEntity<Destino> updateDestino(@PathVariable Long id, @RequestBody Destino destinoUpdated){
		Destino destino = cr.findById(id).orElseThrow(() -> new RuntimeException(id + "Not found"));
		
		destino.setCidade(destinoUpdated.getCidade());
		destino.setData_ida(destinoUpdated.getData_ida());
		destino.setData_volta(destinoUpdated.getData_volta());
		
		
		
		return ResponseEntity.ok(destino);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteDestino(@PathVariable Long id) {
		Destino destino = cr.findById(id).orElseThrow(() -> new RuntimeException(id + "Not found"));	
		cr.delete(destino);
		
		
	}
	
	
	
	
}
