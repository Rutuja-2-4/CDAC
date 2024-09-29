import java.util.*;
public class ReverseString6 {
    static String reverseWords(String str) {
        
        
        List<String> words = new ArrayList<>();
        String[] parts = str.split("\\.");
        
        for (String word : parts) {
            if (!word.isEmpty()) {
                
             
                words.add(word);
            }
        }
        
        // Reverse the words
        Collections.reverse(words);
        
        // Join the reversed words back into a string
        return String.join(".", words);
    }

    public static void main(String[] args) {
        String str = "Hello.World";
        System.out.println(reverseWords(str));
    }
}
