<%--
  Created by IntelliJ IDEA.
  User: YanMing
  Date: 2017/3/14
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<body>
<h1>Title:${title}</h1>

<c:if test="${pageContext.request.userPrincipal.name != null}">
    <h2>Welcome:${pageContext.request.userPrincipal.name}
        |<a href="<c:url value="/logout" />" > Logout</a></h2>
</c:if>
</body>
</html>