<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum"%>
	
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:import url="cabecalho.jsp"></c:import>
	Formulario para alteracao de contato
<br>
	<form action="mvc" method="post">
		ID: <input type="text" name="id"/><br><br>
		Nome: <input type="text" name="nome"/><br><br>
		Email: <input type="text" name="email"/><br><br>
		Data: <input type="text" name="dataNascimento" value="22/12/2011"/><br>
		
				<input type="hidden" name="logica" value="AlteraContatoLogic" />
		<input type="submit" value="Alterar"></input> 
	</form>
</body>
</html>