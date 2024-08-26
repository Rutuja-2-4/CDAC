//Snippet 14:  
public class Main { 
    public static void main(String[] args) { 
        double num = "Hello"; 
        System.out.println(num); 
    } 
} 
// What compilation error occurs? Why does Java enforce data type constraints?//
/*Main.java:4: error: incompatible types: String cannot be converted to double
        double num = "Hello";
                     ^
1 error*/
//data type constrain is used to improve code readability and catch type-related errors at compile time. 
//java is typed lanuagae so varible should be delecar in suitable datatype
