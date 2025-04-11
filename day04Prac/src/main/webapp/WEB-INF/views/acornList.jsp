<%@page import="project.Cinema"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>영화관 지점</h2>

<% ArrayList<Cinema> list = (ArrayList<Cinema>) request.getAttribute("list"); %>

<table>
<tr>
<td>영화관</td>
<td>브랜드</td>
<td>전화번호</td>
</tr>
<% for(Cinema cinema : list) { %>
<tr>
<td><%= cinema.getName() %></td>
<td><%= cinema.getBrand() %></td>
<td><%= cinema.getTel() %></td>
<td><a href = "/day04Prac/cinemaSelect?code=<%= cinema.getCode() %>">수정</a></td>
</tr>
<% } %>
</table>

</body>
</html>