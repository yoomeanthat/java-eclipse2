<%@page import="project.Cust"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	Cust c = (Cust) request.getAttribute("cust");
	%>

	<h2>회원정보</h2>

	<form action="/mvcproject/updateCust" method="post">
		<table>

			<tr>
				<td>아이디</td>
				<td><input type="text" name="id" value="<%=c.getId()%>"></td>
			</tr>

			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value="<%=c.getName()%>"></td>
			</tr>

			<tr>
				<td>성별</td>
				<td><input type="text" name="gender" value="<%=c.getGender()%>"></td>
			</tr>
			
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="tel" value="<%=c.getTel()%>"></td>
			</tr>
			
			<tr>
				<td>등급</td>
				<td><input type="text" name="grade" value="<%=c.getGrade()%>"></td>
			</tr>
			
			<tr>
				<td>예약번호</td>
				<td><input type="text" name="reserv" value="<%=c.getReserv()%>"></td>
			</tr>

			<tr>
				<td>
					<button>수정하기</button>
				</td>
			</tr>

		</table>
	</form>
</body>
</html>