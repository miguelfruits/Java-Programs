public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println("After append: " + sb);  // Output: Hello World

        
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);  // Output: Hello Java World

        sb.delete(6, 11);
        System.out.println("After delete: " + sb);  // Output: Hello World

    
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);  // Output: Hello Java

        sb.reverse();
        System.out.println("After reverse: " + sb);  // Output: avaJ olleH

        sb.reverse();
        System.out.println("Reversed back: " + sb);  // Output: Hello Java

     
        System.out.println("Capacity: " + sb.capacity());  // Output: Default 16 + length of "Hello Java"

        System.out.println("Length: " + sb.length());  // Output: 10

        System.out.println("Character at index 4: " + sb.charAt(4));  // Output: o

        // 9. substring(int start) - Returns substring from start index to end
        System.out.println("Substring from index 6: " + sb.substring(6));  // Output: Java

        // 10. substring(int start, int end) - Returns substring from start to end index
        System.out.println("Substring (0,5): " + sb.substring(0, 5));  // Output: Hello

        // 11. setLength(int newLength) - Changes the length of the string
        sb.setLength(15);
        System.out.println("After setLength(15): '" + sb + "'");  // Output: "Hello Java    " (extra spaces or null characters)

        // 13. setCharAt(int index, char ch) - Sets a character at a specific index
        sb.setCharAt(6, 'G');
        System.out.println("After setCharAt(6, 'P'): " + sb);  // Output: Hello Gava   

        // 14. deleteCharAt(int index) - Removes a character at a specific index
        sb.deleteCharAt(6);
        System.out.println("After deleteCharAt(6): " + sb);  // Output: Hello ava   
    }
}
