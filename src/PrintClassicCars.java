
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class PrintClassicCars {
    public void printProductList(String productLine) throws Exception {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classicmodels", "root", "1mysqlserver!");

             PreparedStatement preparedStatement = connection
                     .prepareStatement("select * "
                             + "from products "
                             + "where productLine = ?"
                     );) {
            preparedStatement.setString(1, productLine);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {
                    String name = resultSet.getString("productName");
                    String line = resultSet.getString("productLine");
                    double price = resultSet.getDouble("buyPrice");

                    System.out.format("%-45s %5s %10.2f%n", name, line, price);
                }
            }
        }
    }
}
