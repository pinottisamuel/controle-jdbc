package br.com.jdbc.service;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/execute")
public class Controller extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String action = req.getParameter("action");
		
		if(action == null) {
			throw new IllegalArgumentException("Informe a tarefa que deseja executar");
		}
		
		action = "br.com.jdbc.service." + action;
		
		try {
			Class<?> tipo = Class.forName(action);
			Execute instancia = (Execute) tipo.newInstance();
			String page = instancia.execute(req, resp);
			RequestDispatcher dispatcher = req.getRequestDispatcher(page);
			dispatcher.forward(req, resp);
			
		} catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
			throw new ServletException(e);
		} 
	}
}
