//How long is the string returned by the following expression? What is the string? "Was it a Collage or a School I saw?”substring(9, 12)
public class SubstringExample{
    public static void main(String[] args) {
        String str = "Was it a Collage or a School I saw?";
        String subStr = str.substring(9, 12);
        System.out.println("Substring: " + subStr);
        System.out.println("Length of substring: " + subStr.length());
    }
}
