<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/reset.css">
<link rel="stylesheet" type="text/css" href="css/style.css">

<title>Lista de Produtos</title>
</head>
<body>
	<h2>Produtos</h2>
	<div>
		<table>
			<tr>
				<th>Id</th>
				<th>Nome</th>
				<th>Valor</th>
				<th>Data de Cadastro</th>
				<th>Observação</th>
				<th class="acao" colspan="2">Ação</th>
			</tr>

			<c:forEach var="p" items="${produtos}">
				<tr>
					<td>${p.id }</td>
					<td>${p.nome }</td>
					<td><fmt:formatNumber value="${p.valor }" type="currency" /></td>
					<td><fmt:formatDate value="${p.dataCadastro.time }" pattern="dd/MM/yyyy" /></td>
					<td>${p.observacao }</td>
					<td><a href="execute?action=ListaProdutosService&filtro=${p.id }">Alterar</a></td>
					<td><a href="execute?action=DeleteProdutoService&filtro=${p.id }&acao=delete">Excluir</a></td>
				</tr>

			</c:forEach>
		</table>
	</div>	
</body>
</html>