package chapter17;

import bean.Product;
import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.annotation.WebServlet;
import java.util.List;
import java.util.ArrayList;

@WebServlet(urlPatterns={"/chapter17/cart-remove"})
public class CartRemove extends HttpServlet {
	
	@SuppressWarnings("uncheked")
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);
		
		HttpSession session = request.getSession();
		session.removeAttribute("cart");
		out.println("カートを削除しました");
		Page.footer(out);
	}
}
