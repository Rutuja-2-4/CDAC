//3)Write a program that checks if a person is eligible to vote based on their age.


import java.util.*;
public class vote {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();
        if(age>=10){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote"); 
        }
    }
}

