package br.com.jdbc.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/executa")
public class Controller extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String tarefa = req.getParameter("tarefa");
		
		if(tarefa == null) {
			throw new IllegalArgumentException("Informe a tarefa que deseja executar");
		}
		
		tarefa = "br.com.jdbc.web." + tarefa;
		
		try {
			Class<?> tipo = Class.forName(tarefa);
			Tarefa instancia = (Tarefa) tipo.newInstance();
			String page = instancia.executa(req, resp);
			RequestDispatcher dispatcher = req.getRequestDispatcher(page);
			dispatcher.forward(req, resp);
			
		} catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
			throw new ServletException(e);
		} 
	}
}
