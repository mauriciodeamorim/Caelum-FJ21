<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page import="java.util.*, br.com.caelum.agenda.dao.*, br.com.caelum.agenda.modelo.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Com JSTL</title>
</head>
<body>
	<c:import url="cabecalho.jsp"></c:import>
	<h3><a href="index.html">Adiciona contato</a></h3>
	<jsp:useBean id="dao" class="br.com.caelum.agenda.dao.ContatoDAO">
	<table border="1" cellpadding="1" cellspacing="1"">
	<c:forEach var="contato" items="${dao.lista }" varStatus="id">
		<tr bgcolor="#${id.count % 2 == 0 ? 'aabbcc	' : 'ffff00' }">
			<td width="300px">${contato.nome}</td>
			<td width="300px">
				<c:if test="${not empty contato.email }">
					<a href="mailto:${contato.email}">${contato.email}</a>
				</c:if>
				<c:if test="${empty contato.email }">
					Não tem email
				</c:if>
			</td>
			<td width="100">${contato.endereco}</td>
			<td width="200"></td>
			<td><fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy"/></td>
		</tr>
	</c:forEach>
	</table>
	</jsp:useBean>
</body>
</html>