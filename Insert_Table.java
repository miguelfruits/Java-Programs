import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
class Insert_Table{
    public static void main(String[] args) {
     // Database URL, Username, and Password
			String url = "jdbc:mysql://localhost:3306/mydatabase"; // Database details
	        String username = "root"; // MySQL credentials
	        String password = "root";;
			// SQL Insert Query
			String sql = "INSERT INTO employees(id, name, age, salary) VALUES (?, ?, ?, ?)";
        try {
            // Establish Connection
            Connection conn = DriverManager.getConnection(url, username, password);

            // Create PreparedStatement
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Set Values for Parameters
            pstmt.setInt(1, 1);            // ID
            pstmt.setString(2, "John Doe"); // Name
            pstmt.setInt(3, 22);           // Age
            pstmt.setInt(4, 25000);    //salary

            // Execute Insert Query
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully!");
            }
            // Close Connection
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

