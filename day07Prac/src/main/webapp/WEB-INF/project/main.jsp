<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지</title>
<link href="css/acorn.css" rel="stylesheet">
</head>
<body>

<h2>에이콘 옷장에 오신 것을 환영합니다</h2>

<% String id = (String)session.getAttribute("id"); %>
<% if(id != null) {%>
<%= id%>님 반갑습니다
	<a href="/day07Prac/logout">로그아웃</a>
	<a href="/day07Prac/top"> 상의 </a>
	<a href="/day07Prac/bottom"> 하의 </a>
	<a href="/day07Prac/hats">모자</a>
	<a href="/day07Prac/shoes">신발</a>
	<a href="/day07Prac/closet"> 옷장 확인하기 </a>
<%}else{ %>
	<a href="/day07Prac/login">로그인</a>
	<a href="/day07Prac/top"> 상의 </a>
	<a href="/day07Prac/bottom"> 하의 </a>
	<a href="/day07Prac/hats">모자</a>
	<a href="/day07Prac/shoes">신발</a>
	<a href="/day07Prac/closet"> 옷장 확인하기 </a>
<%}%>

</body>
</html>