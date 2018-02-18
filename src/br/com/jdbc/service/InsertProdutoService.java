package br.com.jdbc.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jdbc.connection.ConnectionPool;
import br.com.jdbc.dao.ProdutosDAO;
import br.com.jdbc.entities.Produto;

public class InsertProdutoService implements Execute {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp)
			throws SQLException, ClassNotFoundException {
		
		String nome = req.getParameter("nome-produto");
		String aux = req.getParameter("valor");
		BigDecimal valor = new BigDecimal(aux.replaceAll(",", ""));
		System.out.println(valor);
		String observacao = req.getParameter("observacao");
		
		Produto produto = new Produto(nome, valor, observacao);
		
		try(Connection con = new ConnectionPool().getConnection()){
			ProdutosDAO dao = new ProdutosDAO(con);
			dao.insert(produto);
		}
		
		return "execute?action=ListaProdutosService";
	}	
}

