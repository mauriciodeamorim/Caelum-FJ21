<%@ page import="java.util.*, br.com.caelum.agenda.dao.*, br.com.caelum.agenda.modelo.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
	<% List<Contato> lista = new ContatoDAO().getLista();
		for(Contato contato : lista){
	%>
		<tr>
			<td><%=contato.getNome() %> </td>
			<td>${contato.nome} </td>
			<td><%=contato.getNome() %> </td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>