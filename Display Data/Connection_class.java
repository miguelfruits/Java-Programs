import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
public class Connection_class {

	    public static void main(String[] args) throws Exception {
	        String url = "jdbc:mysql://localhost:3306/world"; // Database details
	        String username = "root"; // MySQL credentials
	        String password = "root";
	        String query = "select * from city"; // Query to be run

	        // Load and register the driver
	        Class.forName("com.mysql.cj.jdbc.Driver");

	        // Establish connection
	        Connection con = DriverManager.getConnection(url, username, password);
	        System.out.println("Connection Established successfully");

	        // Create a statement
	        Statement st = con.createStatement();

	        // Execute the query
	        ResultSet rs = st.executeQuery(query);

	        // Process the results
	        while (rs.next()) {
	            String name = rs.getString("name"); // Retrieve name from db
	            System.out.println(name); // Print result on console
	        }

	        // Close the statement and connection
	        st.close();
	        con.close();
	        System.out.println("Connection Closed....");
	    
	}
}
