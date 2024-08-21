<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../header.html" %>

<form action="el5-2.jsp" method="post">
	${param.price}円×
	${param.count}個＝
	${param.price * param.count}円
</form>

<%@include file="../footer.html" %>
