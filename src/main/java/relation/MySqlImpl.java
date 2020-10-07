package relation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlImpl {
    public static void main(String[] args) throws SQLException {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "pswd")) {

            System.out.println(con.getCatalog());
        }
    }
}
