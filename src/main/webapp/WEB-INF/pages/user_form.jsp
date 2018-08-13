<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
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
    <h2>редактирование пользователя:</h2>
    <f:form action="/users/save" modelAttribute="user">
        <table class="table">
            <colgroup>
                <col width="20%"/>
                <col width="20%"/>
                <col width="60%"/>
            </colgroup>
            <tr>
                <td>
                    <label>id:</label>
                </td>
                <td>
                    <f:input path="id" readonly="true" class="form-control"/>
                </td>
                <td>

                </td>
            </tr>
            <tr>
                <td>
                    <label>Имя:</label>
                </td>
                <td>
                    <f:input path="name" class="form-control"/>
                </td>
                <td>

                </td>
            </tr>
            <tr>
                <td>
                    <label>Фамилия:</label>
                </td>
                <td>
                    <f:input path="surname" class="form-control"/>
                </td>
                <td>

                </td>
            </tr>
            <tr>
                <td>
                    <label>Логин:</label>
                </td>
                <td>
                    <f:input path="login" class="form-control"/>
                </td>
                <td>

                </td>
            </tr>
            <tr>
                <td>
                    <label>Пароль:</label>
                </td>
                <td>
                    <f:input path="password" class="form-control"/>
                </td>
                <td>
                    ...
                </td>
            </tr>
            <tr>
                <td colspan="2" align="right">
                    <input type="submit" class="form-control"/>
                </td>
                <td></td>
            </tr>
        </table>
    </f:form>
    <c:import url="utils/footer.jsp"/>
</body>
</html>