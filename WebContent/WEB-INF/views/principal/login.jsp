<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../general/jstl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<%@include file="../general/head.jsp"%>
	</head>
	<body>
		<h1>Hola</h1>
		
		<core:forEach items="${listaUsuarios}" var="i">
			<core:out value="${i.name}"></core:out>
		</core:forEach>
		
		<%@include file="../general/js.jsp"%>
	</body>
</html>