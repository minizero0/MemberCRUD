<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>멤버 목록</h2>
	<br>
	<a href="insertMember">멤버등록</a>
	<hr>
	<c:forEach var="m" items="${list}">
		<a href="detailMember?no=${m.no}">${m.name}</a><br>
	</c:forEach>
</body>
</html>