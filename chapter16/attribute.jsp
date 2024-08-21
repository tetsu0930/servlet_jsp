<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../header.html" %>

<%@page import="bean.Product" %>

<% Product p = (Product)request.getAttribute("product"); %>

<p><%=p.getId() %>:<%=p.getName() %>:<%=p.getPrice() %></p>

<%@include file="../footer.html" %>