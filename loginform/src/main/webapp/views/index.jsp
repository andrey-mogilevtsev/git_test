<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 7/19/2016
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
    <style>
        a.knopka {
            color: #fff; /* цвет текста */
            text-decoration: none; /* убирать подчёркивание у ссылок */
            user-select: none; /* убирать выделение текста */
            background: rgb(212,75,56); /* фон кнопки */
            padding: .7em 1.5em; /* отступ от текста */
            outline: none; /* убирать контур в Mozilla */
        }
        a.knopka:hover { background: rgb(232,95,76); } /* при наведении курсора мышки */
        a.knopka:active { background: rgb(152,15,0); } /* при нажатии */
    </style>
</head>
<body>
    <c:choose>
        <c:when test="${requestScope.get('again')=='true'}">
            <h2>INCORRECT  DATA! Enter login and password again</h2>
        </c:when>
        <c:otherwise>
            <h2>enter login and password</h2>
        </c:otherwise>
    </c:choose>
    <form name="signup" action="signup" method="post">
        <input type="text" name="login">
        <input type="password" name="password">
        <select name="language" size="1">
             <option value="ru" > ru </option>
             <option value="eng"> eng </option>
        </select>
        <input type="submit" name="Aloha!">
    </form>
    <a class="knopka" href="/views/registration.jsp">Зарегестрироваться</a>
    <br>
<hr>
<img src="<%=request.getContextPath()%>/uk.png">
</body>
</html>
