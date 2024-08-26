//Snippet 1:  
public class Main { 
    public void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 
// What error do you get when running this code
/*Here in this code static is missing so we get this error we should always write public static void main
becasue Main method is not static in class Main
Error: Main method is not static in class Main, please define the main method as:
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