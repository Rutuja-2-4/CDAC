//Snippet 2:  
public class Main { 
    static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 
// What happens when you compile and run this code?
/*Here public is missing in this code so the Main method not found in class 
The first keyword public is also called an access modifier in Java 
It the compiler call this function. 
Error: Main method not found in class Main, please define the main method as:
or a JavaFX application class must extend javafx. application.Application   
   public static void main(String[] args)
*/
//corrected code 
   public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 
//output :
//Hello, World!