
//Check Whether a number is Even or Odd using Java 
import java.util.*;
public class EvenOrOdd {
    public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the the number");
int number = sc.nextInt();
if(number % 2 ==0){
    System.out.println("Number is Even");
}else{
    System.out.println("number is odd");
}
    }
    
}
