import java.util.*;
public class PositiveOrNegative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER the number");
        int number = sc.nextInt();
        if(number<0){
            System.out.println("Number is negative"+number);
        }
        else if(number>0){
            System.out.println("Number is positive"+number);
        }else{
            System.out.println("Number is zero");
        }
    }
}
