<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Produtos</h1>
		<table width="100%">
			<tr>
				<td>id</td>
				<td>Nome</td>
				<td>Valor</td>
				<td>Data de Cadastro</td>
				<td>Observação</td>
			</tr>
			
			<c:forEach var="p" items="${produtos}">			
				<tr>
					<td>${p.id }</td>
					<td>${p.nome }</td>
					<td>${p.valor }</td>
					<td>${p.dataCadastro }</td>
					<td>${p.observacao }</td>
				</tr>
			</c:forEach>			
		</table>	
	</body>
</html>