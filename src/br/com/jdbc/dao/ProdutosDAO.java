package br.com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.sql.Date;

import com.mysql.jdbc.Statement;

import br.com.jdbc.model.Produto;

public class ProdutosDAO {

	private Connection con;

	public ProdutosDAO(Connection con) {
		this.con = con;
	}

	public void insert(Produto produto) throws SQLException {	
		String sql = "insert into produtos (nome_produto, valor, data_cadastro, observacao) values (?,?,?,?);";
		Date date = new Date(Calendar.getInstance().getTimeInMillis());
		
		try(PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			stmt.setString(1, produto.getNome());
			stmt.setDouble(2, produto.getValor());
			stmt.setDate(3, date);
			stmt.setString(4, produto.getObservacao());
			stmt.execute();
			
			try(ResultSet rs = stmt.getGeneratedKeys()) {
				if(rs.next()) {
					int id = rs.getInt(1);
					produto.setId(id);
				}
			}
		}
	}

	public List<Produto> lista() throws SQLException {
		System.out.println("Entrou3");
		String sql = "select * from produtos;";
		List<Produto> produtos = new ArrayList<>();
		
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			
			try(ResultSet rs = stmt.getResultSet()){
				while(rs.next()) {
					int id = rs.getInt("id");
					String nome = rs.getString("nome_produto");
					Double valor = rs.getDouble("valor");
					String observacao = rs.getString("observacao");
					
					Produto produto = new Produto(nome, valor, observacao);
					produto.setId(id);
					
					produtos.add(produto);
				}
			}
		}
		
		return produtos;
	}
}
