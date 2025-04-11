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


<% String hats  =(String) request.getAttribute("hats"); %>

<%= hats %>
<h3>하의</h3>
<%=hats%>  <a href="/project/addCloset?name=<%=hats%>">옷장 추가</a>


</body>
</html>