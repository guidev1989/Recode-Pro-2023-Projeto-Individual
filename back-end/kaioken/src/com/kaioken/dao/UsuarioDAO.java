package com.kaioken.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kaioken.model.Usuario;

import utils.Colors;

public class UsuarioDAO {
	
	private static String sql;
	
	private final Connection connection;
	
	public UsuarioDAO(Connection connection) {
		this.connection = connection;
	}
	
	
	//CREATE
	
	public void createUsuario(Usuario usuario) {
		sql = "INSERT INTO usuario (telefone, cpf, email, nome) VALUES(?,?,?,?)";
		try(PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setString(1, usuario.getTelefone());
			stmt.setString(2, usuario.getCpf());
			stmt.setString(3, usuario.getEmail());
			stmt.setString(4, usuario.getNome());
			
			stmt.executeUpdate();
			System.out.println(Colors.GREEN + "Usuario criado com sucesso: " + Colors.RESET + usuario.getNome() + "e CPF: " + usuario.getCpf());			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//READ	
	public void readAllUsers() {
		sql="SELECT * FROM usuario";
		try(PreparedStatement stmt = connection.prepareStatement(sql)){
			ResultSet r = stmt.executeQuery();
			while(r.next()) {				
				Usuario usuario = new Usuario();
				//usuario.setId_usuario(r.getInt("id_usuario"));
				usuario.setNome(r.getString("nome"));
				usuario.setCpf(r.getString("cpf"));
				usuario.setTelefone(r.getString("telefone"));
				usuario.setEmail(r.getString("email"));
				
				
				System.out.printf("Nome: %s\n CPF: %s\n Telefone: %s\n Email: %s\n",
						usuario.getNome(), usuario.getCpf(), usuario.getTelefone(), usuario.getEmail());
				
			}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//UPDATE
	public void updateUsuario(Usuario usuario) {
		sql="UPDATE usuario SET telefone= ?, cpf = ?, email = ?, nome = ? WHERE id_usuario = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, usuario.getTelefone() );			
			stmt.setString(2, usuario.getCpf());
			stmt.setString(3, usuario.getEmail());
			stmt.setString(4, usuario.getNome());			
			
			stmt.setInt(5, usuario.getId_usuario());
			
			stmt.executeUpdate();
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
						
		}
		
	}

	//DELETE
	
	public void deleteUsuario(int id) {
		sql = "DELETE from usuario WHERE id_usuario = ?";
		try(PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setInt(1, id);
			
			stmt.executeUpdate();			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	

}
