<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- /hat.jsp -->
<!DOCTYPE html>
<html>
<head><meta charset="UTF-8"><title>모자 선택</title></head>
<link href="css/acorn.css" rel="stylesheet">
<body>
    <h2>모자 고르기</h2>
    <form action="/day07Prac/hat" method="post">
        <select name="hat">
            <option value="야구모자 5000">야구모자 - 5000원</option>
            <option value="비니 7000">비니 - 7000원</option>
            <option value="버킷햇 8000">버킷햇 - 8000원</option>
        </select>
        <button type="submit">장바구니에 담기</button>
    </form>
    <a href="/day07Prac/cartlist.jsp">장바구니 보기</a>
</body>
</html>
