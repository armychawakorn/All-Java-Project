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
	public void insertProduct(Product p) throws SQLException {
		String sql = "INSERT INTO product(pname, pdetail, price) VALUES(?, ?, ?)";
		PreparedStatement statement = this.con.prepareStatement(sql);
		statement.setString(1, p.getProductName());
		statement.setString(2, p.getProductDetail());
		statement.setInt(3, p.getPrice());
		statement.executeUpdate();
	}
	public void updateProduct(Product p) throws SQLException {
		String sql = "UPDATE product SET pname = ?, pdetail = ?, price = ? WHERE pid = ?";
		PreparedStatement statement = this.con.prepareStatement(sql);
		statement.setString(1, p.getProductName());
		statement.setString(2, p.getProductDetail());
		statement.setInt(3, p.getPrice());
		statement.setInt(4, p.getPid());
		statement.executeUpdate();
	}
	public void deleteProduct(int pid) throws SQLException {
		String sql = "DELETE FROM product WHERE pid = ?";
		PreparedStatement statement = this.con.prepareStatement(sql);
		statement.setInt(1, pid);
		statement.executeUpdate();
	}
}
