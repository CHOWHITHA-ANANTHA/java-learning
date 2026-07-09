import java.util.regex.*;

public class Main{
    public static void main(String[] args) {
        String text = "My email is test123@example.com";

        // Compile a regex pattern
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+"); 
        Matcher matcher = pattern.matcher(text);

        // Check if the regex matches
        if (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        } else {
            System.out.println("No match found");
        }
    }
}
