//Snippet 4:  
public class Main { 
    public static void main() { 
        System.out.println("Hello, World!"); 
    } 
} 
// What happens when you compile and run this code? Why is String[] args needed?// 
/*Error: Main method not found in class Main, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/
 // we got this error becase (String[] args) is missing in this code
 // String args in Java is used to pass command-line arguments to a Java program.
 //It allows inputs data in prorgam.
 //corrected code 
   public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 
//output :
//Hello, World!
