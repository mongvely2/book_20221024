<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-10-24
  Time: 오후 4:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>bookSave</title>
</head>
<body>
<h3>도서등록</h3>
<form action="/save" method="post">
    도서명: <input type="text" name="bookName" placeholder="도서명입력"> <br>
    저자: <input type="text" name="bookAuthor" placeholder="저자입력"> <br>
    도서가격: <input type="text" name="bookPrice" placeholder="도서가격입력"> <br>
    출판사: <input type="text" name="bookPublisher" placeholder="출판사입력"> <br>
    <input type="submit" value="저장">
</form>
</body>
</html>
