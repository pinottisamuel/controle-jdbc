<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js" type="text/javascript"></script>
		<script src="js/jquery-mask-money.js" type="text/javascript"></script>
		<script src="js/java-script.js" type="text/javascript"></script>
		<title>Cadastrar Produtos</title>
	</head>
	<body>
		<h2>Cadastro de Produtos</h2>
		<form action="execute" method="POST">
			<input type="hidden" name="action" value="InsertProdutoService"/>
			
			<label>Nome Produto</label><br>  
			<input type="text" name="nome-produto"/><br>
			<label>Valor</label><br>
			<input type="text" name="valor" id="currency"/><br>
			<label>Observação</label><br>
			<input type="text" name="observacao"/><br>			
			
			<input type="submit" value="Salvar"/>
		</form>
	</body>	
</html>