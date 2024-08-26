//Snippet 13:  
public class Main { 
    public static void main(String[] args) { 
        String str = null; 
        System.out.println(str.length()); 
    } 
} 
// What exception is thrown? Why does it occur?

//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
//        at Main.main(Main.java:5)
//nullPointerException is thrown when a program attempts to use an object reference that has the null value.
//takes the length of null, as if ther is an array.
