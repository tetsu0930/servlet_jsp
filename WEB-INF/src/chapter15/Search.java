package chapter15;

import bean.Product;
import dao.ProductDAO;
import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.util.List;

@WebServlet(urlPatterns={"/chapter15/search2"})
public class Search extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);
		
		try {
			String keyword = request.getParameter("keyword");
			
			ProductDAO dao = new ProductDAO();
			List<Product> list = dao.search(keyword);
			
			if(list.isEmpty()) {
				out.println("該当する商品が存在しませんでした。");
			} else {
				for (Product p : list) {
					out.println(p.getId());
					out.println(":");
					out.println(p.getName());
					out.println(":");
					out.println(p.getPrice());
					out.println("<br>");
				}
			}
		} catch (Exception e) {
			e.printStackTrace(out);
		}
		Page.footer(out);
	}
}