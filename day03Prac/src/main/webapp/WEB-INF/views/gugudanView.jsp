<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
<style>
	.box {
        width: 500px;
        height: 500px;
        background-color: aqua;
        display: flex;
        align-items: center;
        justify-content: center;
        font-size: 20px;
        font-weight: bold;
    }

    .box:hover {
        background-color: blue;
        color: white;
        font-size: 30px;
        font-weight: bold;
        }
</style>
</head>
<body>

<% ArrayList<String> list = (ArrayList<String>) request.getAttribute("gugudan");%> 

<div class = "box">
<%=list %>
</div>
</body>
</html>