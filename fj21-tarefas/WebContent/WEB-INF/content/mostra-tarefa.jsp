<%@ taglib prefix="s" uri="/struts-tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" href="css/jquery.css" rel="stylesheet"/>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery-ui.js"></script>
<title>Alterar tarefa - ${tarefa.id}</title>
</head>
<body>
	<h3>Alterar tarefa - ${tarefa.id} - ${tarefa.descricao}</h3>
	<s:fielderror fieldName="tarefa.descricao"></s:fielderror>
	<form action="alteraTarefa" method="post">
		<input type="hidden" name="tarefa.id" value="${tarefa.id}"/>
		Descricao: <br>
		<div class="descricao">
			<textarea name="tarefa.descricao" rows="5" cols="100">${tarefa.descricao}</textarea><br>
		</div>
		Finalizado? <input type="checkbox" name="tarefa.finalizado"
				value="true" ${tarefa.finalizado?'checked':'' } /> <br>
		Data de finalizacao: <caelum:campoData id="dataFinalizado" /> <br><br>
		<input type="submit" value="Alterar">
	</form>
</body>
</html>