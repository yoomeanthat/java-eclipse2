<%@page import="acorn.Acorn"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/acorn.css"	rel="styleSheet">
</head>
<body>

<!-- request 저장소에서 데이터꺼내기 -->
<% ArrayList<Acorn> list = (ArrayList<Acorn>) request.getAttribute("list"); %>

<table>

<tr>
<td>아이디</td>
<td>비번</td>
<td>이름</td>
</tr>


<!-- 데이터응답하기 -->

<% for (Acorn acorn : list) { %>
<tr>
<td><%= acorn.getId() %></td>
<td><%= acorn.getPw() %></td>
<td><%= acorn.getName() %></td>
<td><a href="/day04Prac/acornOne?id=<%= acorn.getId() %>">수정</a></td>
</tr>


<%} %>
<tr>
<td></td>
<td></td>
<td></td>
</tr>

</table>

</body>
</html>