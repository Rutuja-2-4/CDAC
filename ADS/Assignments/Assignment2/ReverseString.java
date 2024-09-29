public class ReverseString {
    public static void main(String[] args) {
        
        String[] testCases = {"hello", "Java"};
        for (String str : testCases) {
            String reversed = reverseString(str);  

            System.out.println("Reversed: " + reversed);
            System.out.println();
        }
    }


    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString(); 
    }
}
