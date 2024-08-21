<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>

<%@include file="../header.html" %>
<%@include file="menu.jsp" %>

<c:choose>
	<c:when test="${cart.size() > 0}">
		<p>${cart.size()}種類の商品があります。</p>
		<hr>
	</c:when>
	<c:otherwise>
		<p>カートに商品がありません。</p>
	</c:otherwise>
</c:choose>

<table style="border-collapse:separate;border-spacing:10px;">
	<tr>
		<th>商品</th>
		<th>価格</th>
	</tr>
	<c:forEach var="item" items="${cart}">
		<tr>
		<td>${item.product.name}</td>
		<td>${item.product.price}</td>
		<td><a href="CartRemove.action?id=${item.product.id}">カートから削除</a></td>
		</tr>
	</c:forEach>
</table>

<%@include file="../footer.html" %>