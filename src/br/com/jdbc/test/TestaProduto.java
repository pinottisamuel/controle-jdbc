package br.com.jdbc.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.jdbc.connection.ConnectionPool;
import br.com.jdbc.dao.ProdutosDAO;
import br.com.jdbc.model.Produto;

public class TestaProduto {

	public static void main(String[] args) throws SQLException {
		
		Produto som = new Produto("Aparelho de Som", 1000.00, "Aparelho de Som Philips");
		
		try(Connection con = new ConnectionPool().getConnectioin()){
			ProdutosDAO dao = new ProdutosDAO(con);
			
			dao.insert(som);
			
			List<Produto> produtos = dao.lista();
			
			for (Produto produto : produtos) {
				System.out.println("Produtos: " + produto);
			}
		}
	}
}
