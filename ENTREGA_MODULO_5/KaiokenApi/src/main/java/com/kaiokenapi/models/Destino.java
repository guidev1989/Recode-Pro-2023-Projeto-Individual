package com.kaiokenapi.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Destino {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String cidade;
	
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate data_ida;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate data_volta;
	
	@ManyToOne
	@JoinColumn(name = "viajante_fk")
	private Viajante viajante;
	
	
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public LocalDate getData_ida() {
		return data_ida;
	}

	public void setData_ida(LocalDate data_ida) {
		this.data_ida = data_ida;
	}

	public LocalDate getData_volta() {
		return data_volta;
	}

	public void setData_volta(LocalDate data_volta) {
		this.data_volta = data_volta;
	}

	public Viajante getViajante() {
		return viajante;
	}

	public void setViajante(Viajante viajante) {
		this.viajante = viajante;
	}
	
	
	
	
	
	
	
	
	
	

}
