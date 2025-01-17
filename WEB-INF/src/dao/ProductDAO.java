package dao;

import bean.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class ProductDAO extends DAO {
	
	public List<Product> search(String keyword) throws Exception {
		List<Product> list = new ArrayList<>();
		
		Connection con = getConnection();
		
		PreparedStatement st = con.prepareStatement(
			"SELECT * FROM product WHERE name LIKE ?");
		st.setString(1, "%" + keyword + "%");
		ResultSet rs = st.executeQuery();
		
		while (rs.next()) {
			Product p = new Product();
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setPrice(rs.getInt("price"));
			list.add(p);
		}
		
		st.close();
		con.close();
		
		return list;
	}
	
	public int insert(Product product) throws Exception {
		Connection con = getConnection();
		
		PreparedStatement st = con.prepareStatement(
			"INSERT INTO product(name, price) values(?, ?)");
		st.setString(1, product.getName());
		st.setInt(2, product.getPrice());
		int line = st.executeUpdate();
		
		st.close();
		con.close();
		return line;
	}
}