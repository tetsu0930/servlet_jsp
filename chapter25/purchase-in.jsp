<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>

<%@include file="../header.html" %>
<%@include file="menu.jsp" %>

<p>${cart.size()}種類の商品があります。</p>
<hr>

<table style="border-collapse:separate;border-spacing:10px;">
	<tr>
		<th>商品</th>
		<th>価格</th>
		<th>個数</th>
	</tr>
	<c:forEach var="item" items="${cart}">
		<tr>
		<td>${item.product.name}</td>
		<td>${item.product.price}</td>
		<td>${item.count}</td>
		</tr>
	</c:forEach>
</table>

<form action="Purchase.action" method="post">
	<p>お名前<input type="text" name="name"></p>
	<p>ご住所<input type="text" name="address"></p>
	<p><input type="submit" value="購入を確定"></p>
</form>

<%@include file="../footer.html" %>