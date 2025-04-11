<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/acorn.css" rel="stylesheet">
</head>
<body>


<h2>상품상세페이지</h2> 


<% String tops  =(String) request.getAttribute("tops"); %>

<%= tops %>
<h3>상의</h3>
<%=tops%> 35,000원 <a href="/project/addCloset?name=<%=tops%>">옷장 추가</a>


</body>
</html>