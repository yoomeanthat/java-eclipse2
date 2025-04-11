<%@page import="day03실습.Movie"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>

table{
border:1px solid black;
margin: 0 auto;
}

td{
border:1px solid black;
}
</style>

</head>
<body>

<% ArrayList<Movie> list = (ArrayList<Movie>) request.getAttribute("fakeMovie"); %>

<table>
<caption> 영화 리스트 </caption>
<tr>
<td>영화이름</td>
<td>감독</td>
<td>상영시간</td>
<td>개봉일</td>
<td>누적관객수</td>
<td>평점</td>
</tr>

<%for(Movie a : list){ %>
			<tr>
				<td><%=a.getName() %></td>
				<td><%=a.getDirname() %></td>
				<td><%=a.getPlaytime() %></td>
				<td><%=a.getReldate() %></td>
				<td><%=a.getAccumseen() %></td>
				<td><%=a.getGrade() %>점</td>
			</tr>
		<%} %>

<%=list  %>
</table>

</body>
</html>