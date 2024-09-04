//4)Write a program that takes a month (1-12) and prints the corresponding season (Winter, Spring, Summer, Autumn) using a switch case
import java.util.*;
public class seasons {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month (1-12)");
        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 3:
            System.out.println("Winter");
            break;
            case 4:
            case 5:
            case 6:
            System.out.println("Spring");
            break;
            case 7:
            case 8:
            case 9:
            System.out.println("Summer");
            break;
            case 10:
            case 11:
            case 12:
            System.out.println("Autumn");
            break;
            default:
            System.out.println("Invalid month");
            }
    }
    
}
