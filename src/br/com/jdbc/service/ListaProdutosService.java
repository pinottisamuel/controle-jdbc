package br.com.jdbc.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jdbc.connection.ConnectionPool;
import br.com.jdbc.dao.ProdutosDAO;
import br.com.jdbc.entities.Produto;

public class ListaProdutosService implements Execute {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ClassNotFoundException {
		
		String filtro = req.getParameter("filtro");
		
		if(filtro == null) {
			try(Connection con = new ConnectionPool().getConnection()) {
				List<Produto> produtos = new ProdutosDAO(con).lista();
				req.setAttribute("produtos", produtos);
			}
		}
		
		return "WEB-INF/jsp/lista-produtos.jsp";
	}
}
