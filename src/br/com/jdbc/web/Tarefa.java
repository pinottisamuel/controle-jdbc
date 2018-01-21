package br.com.jdbc.web;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Tarefa {
	
	String executa(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ClassNotFoundException;
}
