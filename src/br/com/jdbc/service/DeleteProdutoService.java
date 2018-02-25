package br.com.jdbc.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jdbc.connection.ConnectionPool;
import br.com.jdbc.dao.ProdutosDAO;

public class DeleteProdutoService implements Execute {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ClassNotFoundException {
		
		String filtro = req.getParameter("filtro");
		
		
		try(Connection con = new ConnectionPool().getConnection()){
			ProdutosDAO dao = new ProdutosDAO(con);
			Integer codigo = Integer.parseInt(filtro);
			dao.delete(codigo);
		}
				
		return "execute?action=ListaProdutosService";
	}

}
