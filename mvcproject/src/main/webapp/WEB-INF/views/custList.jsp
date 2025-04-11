<%@page import="project.Cust"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/cust.css" rel="stylesheet">

</head>
<body>

<% ArrayList<Cust> list = (ArrayList<Cust>) request.getAttribute("list"); %>

<table>

<tr>
<td>고객ID</td>
<td>고객이름</td>
<td>성별</td>
<td>전화번호</td>
<td>등급</td>
<td>예약번호</td>
</tr>

<% for(Cust c : list){ %>
<tr>
<td><%=c.getId()%></td>
<td><%=c.getName()%></td>
<td><%=c.getGender()%></td>
<td><%=c.getTel()%></td>
<td><%=c.getGrade()%></td>
<td><%=c.getReserv()%></td>
<td><a href="/mvcproject/CustUpdate?id=<%= c.getId() %>">수정</a></td>
<td><button><a href="/mvcproject/CustDelete?id=<%= c.getId() %>">삭제</a></button></td>
</tr>

<%} %>

</table>

<a href="/mvcproject/CustInsert"><button>회원가입</button></a>

</body>
</html>