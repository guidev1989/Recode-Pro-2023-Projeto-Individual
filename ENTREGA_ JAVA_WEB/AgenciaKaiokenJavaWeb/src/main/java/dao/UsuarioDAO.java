package dao;

import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DatabaseConnection;

public class UsuarioDAO {

    private Connection connection;

    public UsuarioDAO() throws SQLException {
        connection = DatabaseConnection.createConnection();
    }


    public void createUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuario (nome, senha, cpf, email, telefone) VALUES(?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getCpf());
            stmt.setString(4, usuario.getEmail());
            stmt.setString(5, usuario.getTelefone());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	/*
	 * public List<Usuario> readAllUsuarios() { List<Usuario> usuarios = new
	 * ArrayList<>(); String sql = "SELECT * FROM usuario"; try (PreparedStatement
	 * stmt = connection.prepareStatement(sql)) { ResultSet rs =
	 * stmt.executeQuery(); while (rs.next()) { Usuario usuario = new Usuario();
	 * usuario.setId_usuario(rs.getInt("id_usuario"));
	 * usuario.setNome(rs.getString("nome"));
	 * usuario.setSenha(rs.getString("senha")); usuario.setCpf(rs.getString("cpf"));
	 * usuario.setEmail(rs.getString("email"));
	 * usuario.setTelefone(rs.getString("telefone")); usuarios.add(usuario); } }
	 * catch (SQLException e) { e.printStackTrace(); } return usuarios;
	 */
    

    public void updateUsuario(Usuario usuario) {
        String sql = "UPDATE usuario SET nome = ?, senha = ?, cpf = ?, email = ?, telefone = ? WHERE id_usuario = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getCpf());
            stmt.setString(4, usuario.getEmail());
            stmt.setString(5, usuario.getTelefone());
            stmt.setInt(6, usuario.getId_usuario());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUsuario(int id) {
        String sql = "DELETE FROM usuario WHERE id_usuario = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	
	
	public List<Usuario> findUsuarios() {

		String sql = "SELECT * FROM usuario";

		List<Usuario> usuarios = new ArrayList<Usuario>();

		ResultSet r = null;

		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			r = stmt.executeQuery();

			while (r.next()) {
				Usuario usuario = new Usuario();
				usuario.setId_usuario(r.getInt("id_usuario"));
				usuario.setNome(r.getString("nome"));
				usuario.setCpf(r.getString("cpf"));
				usuario.setEmail(r.getString("email"));
				usuario.setTelefone(r.getString("telefone"));
				usuarios.add(usuario);
			}
		} catch (Exception e) {

			e.printStackTrace();

		}
		return usuarios;

	}


	}
	
	
	
       


