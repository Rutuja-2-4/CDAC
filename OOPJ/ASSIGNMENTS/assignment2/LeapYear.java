//using Switch case
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year:");
        int n = sc.nextInt();

        
        int leap = (n % 400 == 0) ? 1 : (n % 100 == 0) ? 0 : (n % 4 == 0) ? 1 : 0;

        switch (leap) {
            case 1:
                System.out.println(n + " is a leap year.");
                break;
            case 0:
                System.out.println(n + " is not a leap year.");
                break;
            default:
                System.out.println("Invalid year.");
                break;
        }

        
    }
}
