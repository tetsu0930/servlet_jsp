<%@ page contentType="text/html; charset=UTF-8" %>

<%@include file="../header.html" %>

<% request.setCharacterEncoding("UTF-8"); %>

<%
	String user = request.getParameter("user");
%>

<p>こんにちは、<%=user%>さん</p>

<%@include file="../footer.html" %>