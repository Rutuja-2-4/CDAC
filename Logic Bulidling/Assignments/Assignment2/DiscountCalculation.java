/*Question 4: Discount Calculation  
Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount.*/

import java.util.Scanner;

class DiscountCalculation {
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter price ");
    int price =sc.nextInt();
    System.out.println("Enter 1 if membership present else 0");
    int membership = sc.nextInt();
    if(price >=1000){
        if(membership==1){
            System.out.println("Discount is : " + ((price*25)/100));
        }else{
            System.out.println("Discount is : "+(price*20)/100);
        }
    }else if(price >=500 && price<=999){
        if(membership==1){
            System.out.println("Discount is : "+(price*15)/100);
        }else{
        System.out.println("Discount is : "+(price*10)/100);
    }
    }else{
        if(membership==1){
System.out.println("Discount is : "+(price*10)/100);
        }else{
        System.out.println("Discount is : "+(price*5)/100);
    }
    }
}
}

    