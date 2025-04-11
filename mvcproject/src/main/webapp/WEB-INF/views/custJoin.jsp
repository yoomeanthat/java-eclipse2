<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/mvcproject/CustInsert" method="post">
		<table>

			<tr>
				<td>아이디</td>
				<td><input type="text" name="id"></td>
				<td></td>
			</tr>

			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
				<td></td>
			</tr>

			<tr>
				<td>성별</td>
				<td><input type="text" name="gender"></td>
				<td></td>
			</tr>
			
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="tel"></td>
				<td></td>
			</tr>
			
			<tr>
				<td>등급</td>
				<td><input type="text" name="grade"></td>
				<td></td>
			</tr>
			
			<tr>
				<td>예약번호</td>
				<td><input type="text" name="reserv"></td>
				<td></td>
			</tr>

			<tr>
				<td colspan="2">
					<button>가입</button>
				</td>
			</tr>

		</table>
	</form>
</body>
</html>