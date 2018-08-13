<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Users</title>
    <c:import url="utils/import.jsp"/>
</head>
<body class="container">
    <c:import url="utils/header.jsp"/>
    <h2>Страница пользователей:</h2>
    <table class="table">
        <tr>
            <th>Id</th>
            <th>Имя</th>
            <th>Фамилия</th>
            <th>Логин</th>
            <th>Пароль</th>
            <th>Роли</th>
        </tr>
        <c:forEach var="u" items="${users}">
            ${u} |
            <a href="/users/delete/${u.id}">delete</a> |
            <a href="/users/edit/${u.id}">edit</a><br>
        </c:forEach>
    </table>
    <hr>
    <a href="/users/edit/-1">Добавить нового</a>
    <c:import url="utils/footer.jsp"/>
</body>
</html>