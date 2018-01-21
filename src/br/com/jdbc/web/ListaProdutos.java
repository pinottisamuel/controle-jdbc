package br.com.jdbc.web;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jdbc.connection.ConnectionFactory;
///import br.com.jdbc.connection.ConnectionPool;
import br.com.jdbc.dao.ProdutosDAO;
import br.com.jdbc.model.Produto;

public class ListaProdutos implements Tarefa {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ClassNotFoundException {
		
		String filtro = req.getParameter("filtro");
		
		if(filtro == null) {
			//try(Connection con = new ConnectionPool().getConnection()) {
			System.out.println("Entrou1");
			try(Connection con = new ConnectionFactory().getConnection()) {
				System.out.println("Entrou2");
				List<Produto> produtos = new ProdutosDAO(con).lista();
				req.setAttribute("produtos", produtos);
			}
		}
		
		return "WEB-INF/pages/listaProdutos.jsp";
	}
}
