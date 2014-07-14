<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<fmt:bundle basename="i18n.text">
    <head>
        <title><fmt:message key="default.title"></fmt:message></title>
    </head>
    <body>
    <form action="${pageContext.request.contextPath}/Servlet" method="post">
        <textarea name="text" cols="80" rows="20"></textarea>
        <input type="submit" name="<fmt:message key="default.submit"></fmt:message>">

    </form>
    </body>
</fmt:bundle>
</html>
