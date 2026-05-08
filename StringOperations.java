//Consider the following string: String ljuniversity = "University with a Difference.”
a.	What is the value displayed by the expression ljuniversity.length()?
b.	What is the value returned by the method call ljuniversity.charAt(12)?
c.	Write an expression that refers to the letter b in the string referred to by ljuniversity.

public class StringOperations {
    public static void main(String[] args) {
        // Given string
        String ljuniversity = "University with a Difference.";
        
        // a. Display the length of the string
        int length = ljuniversity.length();
        System.out.println("Length of the string: " + length);
        
        // b. Get the character at index 12
        char charAt12 = ljuniversity.charAt(12);
        System.out.println("Character at index 12: " + charAt12);
        
        // c. Expression that refers to the letter 'b'
        // Since the given string does not contain the letter 'b', we provide a general approach
        int indexOfB = ljuniversity.indexOf('b');
        if (indexOfB != -1) {
            System.out.println("Character 'b' found at index: " + indexOfB);
        } else {
            System.out.println("Character 'b' is not found in the string.");
        }
    }
}
