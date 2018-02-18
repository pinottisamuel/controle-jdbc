package br.com.jdbc.test;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.jdbc.connection.ConnectionFactory;
import br.com.jdbc.connection.ConnectionPool;
import br.com.jdbc.dao.ProdutosDAO;
import br.com.jdbc.entities.Produto;

public class TestaProduto {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		BigDecimal valor = new BigDecimal("1000.00");
		
		Produto som = new Produto("Aparelho de Som", valor, "Aparelho de Som Philips");
		
		try(Connection con = new ConnectionFactory().getConnection()){
			ProdutosDAO dao = new ProdutosDAO(con);
			
			dao.insert(som);
			
			List<Produto> produtos = dao.lista();
			
			for (Produto produto : produtos) {
				System.out.println("Produtos: " + produto);
			}
		}
	}
}
