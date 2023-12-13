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

import com.kaiokenapi.models.Viajante;
import com.kaiokenapi.repositories.ViajanteRepository;

@RestController
@RequestMapping("/viajante")
public class ViajanteController {
	
	
	@Autowired
	private ViajanteRepository cr;
	
	@GetMapping("/allviajantes")	
	public List<Viajante> getAllViajantes(){
		
		return cr.findAll();
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Viajante> getViajanteById(@PathVariable Long id){
		Viajante viajante = cr.findById(id).orElseThrow(() -> new RuntimeException(id + "Not found"));
		
		return ResponseEntity.ok(viajante);
		
	}

	
	@PostMapping("/saveViajante")
	public Viajante saveViajante(@RequestBody Viajante viajante) {
		return cr.save(viajante);
}
	
	@PutMapping("/{id}")
	public ResponseEntity<Viajante> updateViajante(@PathVariable Long id, @RequestBody Viajante viajanteUpdated){
		Viajante viajante = cr.findById(id).orElseThrow(() -> new RuntimeException(id + "Not found"));
		
		viajante.setName(viajanteUpdated.getName());
		viajante.setCpf(viajanteUpdated.getCpf());
		
		
		return ResponseEntity.ok(viajante);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteViajante(@PathVariable Long id) {
		Viajante viajante = cr.findById(id).orElseThrow(() -> new RuntimeException(id + "Not found"));	
		cr.delete(viajante);
		
		
	}
}
