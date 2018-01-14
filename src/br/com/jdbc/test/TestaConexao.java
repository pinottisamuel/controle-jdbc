package br.com.jdbc.test;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.jdbc.connection.ConnectionPool;

public class TestaConexao {
	
	public static void main(String[] args) throws SQLException {
		
		try(Connection con = new ConnectionPool().getConnectioin()){
			System.out.println("Conectado");
		}
	}
}
