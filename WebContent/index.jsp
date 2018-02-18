<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" type="text/css" href="css/reset.css">
<link rel="stylesheet" type="text/css" href="css/style.css">

<title>Pagina Inicial</title>
</head>
<body>	
	<h2 id="texto-inicial">Controle - JDBC</h2>

	<form id="form-produtos" action="execute" method="GET">
		<input type="hidden" name="action" value="ListaProdutosService" /> 
		<input id="lista-produtos" type="submit" value="Listar Produtos" />
		
		<a id="cadastro-produtos" href="form-produto.jsp">Cadastrar Produtos</a>
		
	</form>
</body>
</html>