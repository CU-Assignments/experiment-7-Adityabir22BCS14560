import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class easy {

    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        // SQL query to fetch data from Employee table
        String query = "SELECT EmpID, Name, Salary FROM Employee";

        // Establishing a connection
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            // Displaying the fetched data
            System.out.println("EmpID\tName\tSalary");
            while (rs.next()) {
                int empID = rs.getInt("EmpID");
                String name = rs.getString("Name");
                double salary = rs.getDouble("Salary");
                System.out.println(empID + "\t" + name + "\t" + salary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
