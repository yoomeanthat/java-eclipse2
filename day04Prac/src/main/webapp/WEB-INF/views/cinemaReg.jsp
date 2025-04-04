<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/day04Prac/regCinema" method="post">

<table>
<tr>
<td>코드명</td>
<td><input type="text" name="code"></td>
</tr>
<tr>
<td>지점명</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>브랜드</td>
<td><input type="text" name="brand"></td>
</tr>
<tr>
<td>전화번호</td>
<td><input type="text" name="tel"></td>
</tr>
<tr>
<button>등록하기</button>
</tr>
</table>

</form>

</body>
</html>