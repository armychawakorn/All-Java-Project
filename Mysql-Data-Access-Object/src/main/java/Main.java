import java.sql.SQLException;
import java.util.ArrayList;

import Tables.Product;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		MysqlDatabase db = new MysqlDatabase();
		db.resetAutoIncrementToLastId();
	}

}
