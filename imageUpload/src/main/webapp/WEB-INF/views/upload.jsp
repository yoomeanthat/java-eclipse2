<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>파일 업로드</title>
</head>
<body>
    <h2>파일 업로드 폼</h2>
    <form action="${pageContext.request.contextPath}/upload" method="post" enctype="multipart/form-data">
        파일 선택: <input type="file" name="file"><br><br>
        <button type="submit">업로드</button>
    </form>
</body>
</html>
