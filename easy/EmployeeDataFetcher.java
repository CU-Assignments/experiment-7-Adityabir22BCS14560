import java.sql.*;

public class EmployeeDataFetcher {
    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/Employee.sql"; // Replace 'your_database' with your actual database name
        String user = "your_username"; // Replace with your MySQL username
        String password = "your_password"; // Replace with your MySQL password

        // SQL query to fetch data
        String query = "SELECT EmpID, Name, Salary FROM Employee";

        // Establish the database connection
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("Employee Data:");
            System.out.println("----------------------------");

            // Display the result set
            while (rs.next()) {
                int empId = rs.getInt("EmpID");
                String name = rs.getString("Name");
                double salary = rs.getDouble("Salary");

                System.out.printf("EmpID: %d | Name: %s | Salary: %.2f%n", empId, name, salary);
            }
        } catch (SQLException e) {
            System.err.println("Database connection or query error: " + e.getMessage());
        }
    }
}
