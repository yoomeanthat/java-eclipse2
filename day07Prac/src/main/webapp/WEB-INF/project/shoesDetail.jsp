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


<% String shoes  =(String) request.getAttribute("shoes"); %>

<%= shoes %>
<h3>상의</h3>
<%=shoes%> 35,000원 <a href="/project/addCloset?name=<%=shoes%>">옷장 추가</a>


</body>
</html>