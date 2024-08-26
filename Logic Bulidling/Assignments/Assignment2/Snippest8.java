//Snippet 8:  
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!" 
    } 
} 
// What syntax errors are present? How do they affect compilation?
/*Main.java:4: error: ')' or ',' expected
        System.out.println("Hello, World!"
                                          ^
1 error*/
//Her we got this error due to systax mistake becase print statems not properly closed by brackets and semicolns so we didn't get 
//desire output or get error message from the compiler
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
}   
 output :
//Hello, World!