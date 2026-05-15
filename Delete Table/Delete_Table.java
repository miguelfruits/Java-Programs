import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Delete_Table{
    public static void main(String[] args) {
     // Database URL, Username, and Password
			String url = "jdbc:mysql://localhost:3306/mydatabase"; // Database details
	        String username = "root"; // MySQL credentials
	        String password = "root";
			
			String deleteRowQuery = "DELETE FROM employees WHERE id = ?"; // Change table and column name accordingly
        try {
            // Establish database connection
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            // Create a PreparedStatement
            PreparedStatement pstmt = conn.prepareStatement(deleteRowQuery);
            pstmt.setInt(1, 1); // Set the ID of the row to delete (change as needed)

            // Execute the DELETE command
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Row deleted successfully!");
            } else {
                System.out.println("No matching record found.");
            }

            // Close resources
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}





