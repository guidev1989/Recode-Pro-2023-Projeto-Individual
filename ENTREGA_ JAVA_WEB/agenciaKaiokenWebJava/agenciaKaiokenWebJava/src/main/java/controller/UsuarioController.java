package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDAO;
import model.Usuario;

@WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            List<Usuario> usuarios = usuarioDAO.getAllUsuarios();
            request.setAttribute("usuarios", usuarios);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

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
        // M�todo para criar usu�rio
    }

    private void updateUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // M�todo para atualizar usu�rio
    }

    private void deleteUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // M�todo para deletar usu�rio
    }
}
