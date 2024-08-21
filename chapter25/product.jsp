<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>

<%@include file="../header.html" %>
<%@include file="menu.jsp" %>

<p>検索キーワードを入力してください。</p>
<form action="Product.action" method="post">
	<p><input type="text" name="keyword"></p>
	<p><input type="submit" value="検索"></p>
</form>
<hr>

<table style="border-collapse:separate;border-spacing:10px;">
	<tr>
		<th>商品</th>
		<th>価格</th>
	</tr>
	<c:forEach var="product" items="${list}">
		<tr>
		<td>${product.name}</td>
		<td>${product.price}</td>
		<td><a href="CartAdd.action?id=${product.id}">カートに追加</a></td>
		</tr>
	</c:forEach>
</table>

<%@include file="../footer.html" %>