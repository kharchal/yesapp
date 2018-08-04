<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <c:import url="utils/import.jsp"/>
</head>
<body class="container text-center">
    <c:import url="utils/header.jsp"/>
    <h2>Представьтесь пожалуйста:</h2>
    <form action="./login" method="get">
        <input name="login" placeholder="Login" value="test"/>
        <input name="pass" placeholder="Password" value="123"/>
        <input type="submit"/>
    </form>
    <c:import url="utils/footer.jsp"/>
</body>
</html>