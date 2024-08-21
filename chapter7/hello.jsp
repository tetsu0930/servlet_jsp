<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.*"%>

<%! int add(int a, int b) {
		return a + b;
	}
%>
<%
	int a = 123456789;
	int b = 987654321;
%>

<%! int countA = 0; %>
<%
	int countB = 0;
	countA++;
	countB++;
%>

<%@include file="../header.html"%>

		<%-- コメント --%>
		<p>Hello</p>
		<p><% out.println(new java.util.Date()); %></p>
		<p><%= new java.util.Date() %></p>
		<p><%= new Date() %></p>
		<p><%=a%>＋<%=b%>＝<%=add(a, b)%>。</p>
		<p>宣言(<\%!)によるcountAは<%=countA%></p>
		<p>スクリプトレット内の変数(<\%)countBは<%=countB%></p>
		
<%@include file="../footer.html"%>