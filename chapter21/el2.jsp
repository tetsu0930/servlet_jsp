<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../header.html" %>

<p>
${Math.random() < 0.5 ? "当たり" : "ハズレ"}
</p>

<%@include file="../footer.html" %>
