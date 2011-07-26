<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" href="css/tarefa.css" rel="stylesheet"/>
<title>Insert title here</title>
</head>
<body>
	<h3>Adicionar tarefas</h3>
	<s:fielderror fieldName="tarefa.descricao"></s:fielderror>
	<form action="adicionaTarefas" method="post">
		Descricao: <br>
		<div class="descricao">
			<textarea name="tarefa.descricao" rows="5" cols="100"></textarea><br>
		</div>
		<input type="submit" value="Adicionar">
	</form>
</body>
</html>