<%@page import="project.Cinema"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% Cinema cinema = (Cinema) request.getAttribute("cinema"); %>

<h2>영화관 정보</h2>
<form action="/day04Prac/updateCinema" method="post">
	<table>
	
	<tr>
	<td>코드</td>
	<td><input type = "text" name = "code" value = "<%= cinema.getCode()%>"></td>
	</tr>
	
	<tr>
	<td>지점명</td>
	<td><input type = "text" name = "name" value = "<%= cinema.getName()%>"></td>
	</tr> 
	
	<tr>
	<td>브랜드</td>
	<td><input type = "text" name = "brand" value = "<%= cinema.getBrand()%>"></td>
	</tr> 
	
	<tr>
	<td>전화번호</td>
	<td><input type = "text" name = "tel" value = "<%= cinema.getTel()%>"></td>
	</tr> 
	
	<tr>
	<td><button>수정하기</button></td>
	</tr>
	
	</table>
</form>
</body>
</html>