//2)Implement a program that calculates the Body Mass Index (BMI) based on height and weight input using if-else to classify the BMI int categories (underweight, normal weight, overweight,etc).
import java.util.*;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight : ");
        double weight = sc.nextDouble();
        System.out.println("Enter your height : ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
            } else if (bmi < 30) {
                System.out.println("You are normal weight.");
                } else if (bmi < 50) {
                    System.out.println("You are overweight.");
                    } 
                    else {
                        System.out.println("You are not fit.");
                        }
    }
    
}
