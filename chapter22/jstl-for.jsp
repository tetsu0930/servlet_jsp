<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<%@taglib prefix="c" uri="jakarta.tags.core" %>

<c:forEach var="i" begin="1" end="9">
	<p>${i}の段</p>
	<c:forEach var="j" begin="1" end="9">
		<p>${i} × ${j} = ${i * j} </p>
	</c:forEach><br>
</c:forEach>

<%@include file="../footer.html" %>