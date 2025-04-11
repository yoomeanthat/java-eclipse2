<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/acorn.css" rel="stylesheet">
</head>
<body>

<%
    ArrayList<String> cart = (ArrayList<String>) session.getAttribute("cart");
%>
<h2>장바구니 목록</h2>
<ul>
<% if (cart != null) {
    for (String item : cart) {
%>
        <li><%= item %></li>
<%  }
} else { %>
    <li>장바구니가 비어 있습니다.</li>
<% } %>
</ul>

</body>
</html>