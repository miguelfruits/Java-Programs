
//3	Input Username and Password using Console base Application. Check username and password is valid or not & print appropriate message. (Using Buffered Reader class & readLine method)
import java.io.*;

public class LoginSystem {

    // Hardcoded valid username and password for demonstration
    static final String VALID_USERNAME = "admin";
    static final String VALID_PASSWORD = "password123";

    public static void main(String[] args) {
        try {
            // Create BufferedReader to read input from console
            InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(input);

            
            // Read username
            System.out.print("Enter Username: ");
            String username = reader.readLine();

            // Read password
            System.out.print("Enter Password: ");
            String password = reader.readLine();

            // Check if username and password are valid
            if (VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password)) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Invalid Username or Password. Please try again.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}
