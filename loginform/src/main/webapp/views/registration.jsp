<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 7/21/2016
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<form name="registration" action="registration" method="post">
    <br>
    Login <input type="text" name="login"/>
    <br>
    Password <input type="password" name="password"/>
    <br>
    Firstname <input type="text" name="firstname"/>
    <br>
    Secondname <input type="text" name="secondname"/>
    <br>
    Select language
    <select name="language" size="1">
        <option value="ru" > ru </option>
        <option value="eng"> eng </option>
    </select>
    <br>
    <input type="submit"name="Aloha!">

</form>

</body>
</html>
