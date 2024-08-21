<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../header.html" %>

<p>追加する商品を入力してください。</p>
<form action="transaction" method="post">
	<p>商品名：<input type="text" name="name"></p>
	<p>価格：<input type="text" name="price"></p>
	<input type="submit" value="追加">
</form>

<%@include file="../footer.html" %>