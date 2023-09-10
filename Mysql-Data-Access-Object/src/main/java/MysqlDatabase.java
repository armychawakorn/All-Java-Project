import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Tables.Product;

public class MysqlDatabase {
	private Connection con;
	private String dbURL = "jdbc:mysql://localhost/blueshop?characterEncoding=utf-8";
	public MysqlDatabase() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.con = DriverManager.getConnection(dbURL, "root", "");
	}
	public void close() throws SQLException {
		this.con.close();
	}
	public ArrayList<Product> getAllProduct() throws SQLException {
		String sql = "SELECT * FROM product";
		PreparedStatement stmt = this.con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		ArrayList<Product> products = new ArrayList<Product>();
		while(rs.next()) {
			Product p = new Product();
			p.setPid(rs.getInt("pid"));
			p.setProductName(rs.getString("pname"));
			p.setProductDetail(rs.getString("pdetail"));
			p.setPrice(rs.getInt("price"));
			products.add(p);
		}
		return products;
	}
	
}
