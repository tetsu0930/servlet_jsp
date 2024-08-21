package chapter6;

import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/chapter6/select"})
public class Select extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		
		req.setCharacterEncoding("UTF-8");
		String count = req.getParameter("count");
		String payment = req.getParameter("payment");
		String review = req.getParameter("review");
		String mail = req.getParameter("mail");
		String mailStr = mail == null ? "メールはお送りしません。" : "メールをお送りします。";
		String[] genre = req.getParameterValues("genre");
		String genreStr = "";
		if (genre != null) {
			for (String s : genre) {
				genreStr += "「";
				genreStr += s;
				genreStr += "」";
			}
			genreStr += "に関するお買い物情報をお送りします。";
		} else {
			genreStr += "お買物情報はお送りしません。";
		}
		
		Page.header(out);
		out.println("<p>" + count + "個の商品をカートに追加しました。</p>");
		out.println("<p>お支払い方法を" + payment + "に設定しました。</p>");
		out.println("<p>感想ありがとうございます。</p>");
		out.println("<p>「" + review + "」</p>");
		out.println("<p>" + mailStr + "</p>");
		out.println("<p>" + genreStr + "</p>");
		Page.footer(out);
	}
}	