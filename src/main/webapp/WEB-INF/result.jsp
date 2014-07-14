<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<fmt:bundle basename="i18n.text">
    <head>
        <title><fmt:message key="result.title"></fmt:message></title>
    </head>
    <body>
        ${text}
    </body>
</fmt:bundle>
</html>
