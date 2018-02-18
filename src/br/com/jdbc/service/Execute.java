package br.com.jdbc.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Execute {
	
	String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ClassNotFoundException;
}
