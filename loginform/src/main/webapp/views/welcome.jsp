<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 7/19/2016
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>hello - ${param.get("login")}</h2>

  ${param.get("password")}
  
  <img src="images/us.jpg" >
  <img src="${pageContext.servletContext.contextPath}/images/uk.jpg">
  <img src="images/ru.jpg">
<img src="images/rus.jpg">
<img src="/images/rus.jpg">

<br>
<c:out value="${pageContext.servletContext.contextPath}"/>
<img src="<c:url value="images/rus.jpg"/>"/>

  <c:url value="images/rus.jpg"/>

</body>
</html>
