package relation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSqlImpl {
    public static void main(String[] args) throws SQLException {
        try (Connection connection =
                     DriverManager.getConnection(
                             "jdbc:postgresql://localhost:5432/mytestdb", "postgres", "pswd")) {

            System.out.println(connection.getCatalog());
        }
    }
}