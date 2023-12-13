package com.kaiokenapi.models;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;

@Entity
public class Viajante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String cpf;
	
	
	@Transient
	@OneToMany(mappedBy = "destino")
	@JsonIgnore
	
	private Set<Destino> destino = new HashSet<>();
	
	
	
	
	
	
	

	public Set<Destino> getDestino() {
		return destino;
	}

	public void setDestino(Set<Destino> destino) {
		this.destino = destino;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	

}
