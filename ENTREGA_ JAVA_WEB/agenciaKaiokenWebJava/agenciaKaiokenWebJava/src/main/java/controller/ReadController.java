package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDAO;


@WebServlet("/ReadController")
public class ReadController<Usuario> extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		UsuarioDAO uDAO = new UsuarioDAO();
		
		List<model.Usuario> usuario = uDAO.findUsuario(); 
		
		request.setAttribute("usuario", usuario);
		
		RequestDispatcher rd = request.getRequestDispatcher("lista.jsp");
		rd.forward(request, response);
		
		response.sendRedirect("lista.jsp");
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
 		

		
	}

}
