import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
class Update_Table{
    public static void main(String[] args) {
     // Database URL, Username, and Password
			String url = "jdbc:mysql://localhost:3306/mydatabase"; // Database details
	        String username = "root"; // MySQL credentials
	        String password = "root";;

        String updateQuery = "UPDATE employees SET name = ?, age = ? WHERE id = ?";

        try {
            // Establish database connection
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            // Create PreparedStatement
            PreparedStatement pstmt = conn.prepareStatement(updateQuery);
            pstmt.setString(1, "John Doe");  // Set name
            pstmt.setInt(2, 25);            // Set age
            pstmt.setInt(3, 1);             // Set ID condition

            // Execute update
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Record updated successfully!");
            } else {
                System.out.println("No record found with the given ID.");
            }

            // Close resources
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



