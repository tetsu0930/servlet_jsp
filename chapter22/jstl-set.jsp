<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<%@taglib prefix="c" uri="jakarta.tags.core" %>

<c:set var="message" value="Hello" />
<p>message: ${message}</p>

<c:set var="message2">Welcome</c:set>
<p>message: ${message2}</p>

<jsp:useBean id="map" class="java.util.HashMap" />
<c:set target="${map}" property="apple" value="りんご" />
<p>map.apple : ${map.apple}</p>

<%@include file="../footer.html" %>