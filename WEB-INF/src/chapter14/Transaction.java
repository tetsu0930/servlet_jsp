package chapter14;

import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet(urlPatterns={"/chapter14/transaction"})
public class Transaction extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:/comp/env/jdbc/book");
			Connection con = ds.getConnection();
			
			String name = request.getParameter("name");
			int price = Integer.parseInt(request.getParameter("price"));
			
			con.setAutoCommit(false);
			
			PreparedStatement st = con.prepareStatement(
				"INSERT INTO product(name, price) values(?, ?)");
			st.setString(1, name);
			st.setInt(2, price);
			st.executeUpdate();
			
			st = con.prepareStatement(
				"SELECT * FROM product WHERE name = ?");
			st.setString(1, name);
			ResultSet rs = st.executeQuery();
			
			int line = 0;
			while (rs.next()) {
				line++;
			}
			
			if (line == 1) {
				con.commit();
				out.println("商品を登録しました。");
			} else {
				con.rollback();
				out.println("商品はすでに登録されています。");
			}
			
			con.setAutoCommit(true);
				
			st.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace(out);
		}		
		Page.footer(out);
	}
}