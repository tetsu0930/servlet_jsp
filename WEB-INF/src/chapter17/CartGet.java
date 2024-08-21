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

@WebServlet(urlPatterns={"/chapter17/cart-get"})
public class CartGet extends HttpServlet {
	
	@SuppressWarnings("uncheked")
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);
		
		HttpSession session = request.getSession();
		
		List<Product> cart = (List<Product>)session.getAttribute("cart");
		if (cart != null) {
			for (Product p : cart) {
				out.println("<p>");
				out.println(p.getName());
				out.println(":");
				out.println(p.getPrice());
				out.println("</p>");
			}
		}
		Page.footer(out);
	}
}
