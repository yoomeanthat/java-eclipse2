<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>멋있는 뷰</h2>

<% String data = (String) request.getAttribute("data"); %>

<!-- 세션저장소에서 값을 꺼내기 -->
<% String s = (String)session.getAttribute("data"); %>

<div>
<%=data%>
<%=s %>
</div>

</body>
</html>