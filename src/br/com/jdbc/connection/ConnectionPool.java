package br.com.jdbc.connection;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;

public class ConnectionPool {
	
	private DataSource dataSource;
	
	public ConnectionPool(){
		
		MysqlConnectionPoolDataSource pool = new MysqlConnectionPoolDataSource();
		pool.setUrl("jdbc:mysql://127.0.0.1:3306/controle_jdbc");
		pool.setUser("pinotti");
		pool.setPassword("pinotti2410");
		
		this.dataSource = pool;
	}
	
	public Connection getConnectioin() throws SQLException {
		Connection connection = dataSource.getConnection();
		return connection;
	}
}