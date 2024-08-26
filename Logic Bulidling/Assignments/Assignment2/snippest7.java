//Snippet 7:  
/*public class Main { 
    public static void main(String[] args) { 
        int x = "Hello"; 
        System.out.println(x); 
    } 
} */
// What compilation error do you see? Why does Java enforce type safety?
/*Main.java:4: error: incompatible types: String cannot be converted to int
        int x = "Hello";
                ^
1 error*/
//corrected code 
//we declear varible in int x =any number so we get the output as x
public class Main { 
    public static void main(String[] args) { 
        int x = 8; 
        System.out.println(x); 
    } 
}
output:
8