package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDAO;
import model.Usuario;

@javax.servlet.annotation.WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet {

    private static final long serialVersionUID = 1L;
   

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null) {
            switch (action) {
                case "create":
                    createUsuario(request, response);
                    break;
                case "update":
                    updateUsuario(request, response);
                    break;
                case "delete":
                    deleteUsuario(request, response);
                    break;
            }
        } else {
        	response.sendRedirect("index.jsp");
        }
    }

    private void createUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	Usuario usuario = new Usuario();
    	usuario.setTelefone(request.getParameter("telefone")); 
    	usuario.setCpf(request.getParameter("cpf"));
    	usuario.setSenha(request.getParameter("senha"));
    	usuario.setEmail(request.getParameter("email"));
    	usuario.setNome(request.getParameter("nome")); 	
    	
    	try {
			UsuarioDAO usuarioDAO = new UsuarioDAO();
			usuarioDAO.createUsuario(usuario);
			
		} catch (SQLException e) {			
			
			e.printStackTrace();
		}
    	
    	
        
    }

    private void updateUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
    }

    private void deleteUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
    }
}
