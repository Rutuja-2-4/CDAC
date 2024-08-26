//Snippet 3:  
/*public class Main { 
    public static int main(String[] args) { 
        System.out.println("Hello, World!"); 
        return 0; 
    } 
 
 
} */
// What error do you encounter? Why is void used in the main method? 
//In THIS code void is missing so that got the following error Main methodshould return a value of type void in class
// void does not return any value
// Int is keyword used to declear variable  
/*Error: Main method must return a value of type void in class Main, please
define the main method as:
   public static void main(String[] args)*/
   //corrected code 
   public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 
//output :
//Hello, World!