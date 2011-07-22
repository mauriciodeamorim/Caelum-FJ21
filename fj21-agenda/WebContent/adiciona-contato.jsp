<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" href="css/jquery.css" rel="stylesheet"/>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery-ui.js"></script>
<title>Insert title here</title>
</head>
<body>
<c:import url="cabecalho.jsp"></c:import>
<br>
	<form action="adicionaContato">
		Nome: <input type="text" name="nome"/><br><br>
		Email: <input type="text" name="email"/><br><br>
		Data com calendario: <caelum:campoData id="dataNascimento" />
		Data: <input type="text" name="dataNascimento"/><br><br><br>
		<input type="submit" value="Gravar"></input> 
	</form>
</body>
</html>