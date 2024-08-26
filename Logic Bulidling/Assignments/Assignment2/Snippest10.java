//Snippet 10:  
/*public class Main { 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
        display(); 
        display(5); 
    } 
} */
// What happens when you compile and run this code? Is method overloading allowed?
//overlodaing is allowed in  java whn two or more methods in in same class with same name with different paramerts 
/*Main.java:10: error: non-static method display() cannot be referenced from a static context
        display();
        ^
Main.java:11: error: non-static method display(int) cannot be referenced from a static context
        display(5);
        ^
2 errors*/
//corrected code 
public class Main { 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    
    public static void main(String[] args) { 
        Main obj = new Main(); 
        obj.display();     
        obj.display(5);      
    } 
}
//output:
No parameters
With parameter: 5