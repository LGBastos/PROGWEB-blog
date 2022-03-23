package br.ucsal.blog.controller;

import java.io.IOException;
import java.util.List;

import br.ucsal.blog.model.Post;
import br.ucsal.blog.persistencia.PostDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/", "/index"})
public class ListarPostController extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PostDAO dao= new PostDAO();
		List<Post> lista = dao.listar();
		req.setAttribute("lista", lista);
		RequestDispatcher dispacher = req.getRequestDispatcher("./WEB-INF/index.jsp");
		dispacher.forward(req, resp);
		
	}
}
