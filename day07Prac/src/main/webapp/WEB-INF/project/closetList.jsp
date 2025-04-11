<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import="java.util.ArrayList"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/acorn.css" rel="stylesheet">
</head>
<body>


<% 
 
//세션에서 장바구니가져오기
ArrayList<String> list =(ArrayList<String>)  session.getAttribute("closetList"); %>

<h2> 옷장 목록</h2>

<% if( list.size()==0) {  
%>
    <h3> 옷장에 옷이 없습니다</h3>	

<%} %>	

<%
 for( String s :  list){
 	out.println( "<a href=\"/day07Prac/deleteCloset?name="+s+"\">"  +s   +" 삭제</a>  <br>");
 }
%>

<a href="/day07Prac/Closet">메인으로</a> 

</body>
</html>