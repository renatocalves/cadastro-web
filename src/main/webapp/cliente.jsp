<%@page import="java.util.Collections"%>
<%@page import="br.com.fabricadeprogramador.model.Cliente"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>High Tech Cursos | Cadastro de cliente</title>
	</head>
	<body>
		<h1>Cadastro de cliente</h1>
		
		<hr>
		
		<form action="cliente" method="post">
			<label for="campoNome">Nome:</label>
			<input type="text" id="campoNome" name="nome">
			<input type="submit" value="Salvar">
		</form>
			
		<%
			Object atributo = request.getAttribute("lista");
		
			@SuppressWarnings("unchecked")
			List<Cliente> listaDeClientes = (List<Cliente>) atributo;
			
			for (Cliente cliente : listaDeClientes)
				out.println(cliente.getNome() + "<br>");
		%>
	</body>
</html>