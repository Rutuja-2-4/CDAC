//Snippet 5:  
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Main method with String[] args"); 
    } 
    public static void main(int[] args) { 
        System.out.println("Overloaded main method with int[] args"); 
    } 
} 
// Can you have multiple main methods? What do you observe?
// we got this as output Main method with String[] args
// yes we can have multiple main methods by using overloading method