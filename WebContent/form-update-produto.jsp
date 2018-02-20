<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js" type="text/javascript"></script>
		<script src="js/jquery-mask-money.js" type="text/javascript"></script>
		<script src="js/java-script.js" type="text/javascript"></script>
		<title>Atualizar Produtos</title>
	</head>
	<body>
		<h2>Atualização de Produtos</h2>
		<form action="execute" method="POST">			
			<input type="hidden" name="action" value="UpdateProdutoService"/>
			<c:forEach var="p" items="${produtos}">
				<input type="text" name="id" value="${p.id }"/><br>
				<label>Nome Produto</label><br>  
				<input type="text" name="nome-produto" value="${p.nome }"/><br>
				<label>Valor</label><br>
				<input type="text" name="valor" id="currency" value="${p.valor }"/><br>
				<label>Observação</label><br>
				<input type="text" name="observacao" value="${p.observacao }"/><br>			
				
				<input type="submit" value="Salvar"/>
			</c:forEach>
		</form>
	</body>	
</html>