package com.kaioken.model;

public class Usuario {
	
	private int id_usuario;	

	private String telefone;
	
	private String cpf;
	
	private String email;
	
	private String nome;


public Usuario(String telefone, String cpf, String email, String nome) {
	super();
	this.telefone = telefone;
	this.cpf = cpf;
	this.email = email;
	this.nome = nome;
}


@Override
public String toString() {
	return "Usuario [id_usuario=" + id_usuario + ", telefone=" + telefone + ", cpf=" + cpf + ", email=" + email
			+ ", nome=" + nome + "]";
}


public Usuario() {
	super();
	// TODO Auto-generated constructor stub
}


public int getId_usuario() {
	return id_usuario;
}


public void setId_usuario(int id_usuario) {
	this.id_usuario = id_usuario;
}


public String getTelefone() {
	return telefone;
}


public void setTelefone(String telefone) {
	this.telefone = telefone;
}


public String getCpf() {
	return cpf;
}


public void setCpf(String cpf) {
	this.cpf = cpf;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public void setTelefoneUsuario(String string) {
	// TODO Auto-generated method stub
	
}
}
