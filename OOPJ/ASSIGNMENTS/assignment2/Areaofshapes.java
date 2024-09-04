//5)Write a program that allows the user to select a shape (Circle, Square, Rectangle, Triangle) and then calculates the area based on user-provided dimensions using a   switch case.
import java.util.*;
public class Areaofshapes{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select a shape: ");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
            System.out.println("Enter radius of circle: ");
            double r = sc.nextDouble();
            double area = 3.14*r*r;
            System.out.println("Area of circle is: "+area);
            break;

            case 2:
            System.out.println("Enter side of square: ");
            double s = sc.nextDouble(); 
            double area1 = s*s;
            System.out.println("Area of square is: "+area1);
            break;

            case 3:
            System.out.println("Enter length and breadth of rectangle: ");
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            double area2 = l*b;
            System.out.println("Area of rectangle is: "+area2);
            break;

            case 4:
            System.out.println("Enter base and height of triangle: ");
            double b1 = sc.nextDouble();
            double h = sc.nextDouble();
            double area3 = 0.5*b1*h;
            System.out.println("Area of triangle is: "+area3);
            break;
            default:
             System.out.println("Invalid choice");
            
        }

        
    }
    
}