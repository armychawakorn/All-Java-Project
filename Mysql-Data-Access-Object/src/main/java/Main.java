import java.sql.SQLException;
import java.util.ArrayList;

import Tables.Product;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		MysqlDatabase db = new MysqlDatabase();
		ArrayList<Product> products = db.getAllProduct();
		for(Product p : products) {
			System.out.println(p.getProductName());
		}
	}

}
