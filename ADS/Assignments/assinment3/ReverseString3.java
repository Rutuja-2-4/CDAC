import java.util.Scanner;


class Stack {
    int size;
    int top;
    char[] a;

    boolean isEmpty() {
        return (top < 0);
    }

    Stack(int n) {
        top = -1;
        size = n;
        a = new char[size];
    }

   
    boolean push(char x) {
        if (top >= size - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    char pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0; 
        } else {
            return a[top--];
        }
    }
}

class ReverseString3 {
   
    public static void reverse(StringBuffer str) {
        int n = str.length();
        Stack obj = new Stack(n);

        for (int i = 0; i < n; i++) {
            obj.push(str.charAt(i));
        }

        for (int i = 0; i < n; i++) {
            char ch = obj.pop();
            str.setCharAt(i, ch);
        }
    }

    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the first string: ");
        StringBuffer firstString = new StringBuffer(scanner.nextLine());
        System.out.print("Enter the second string: ");
        StringBuffer secondString = new StringBuffer(scanner.nextLine());


        reverse(firstString);
        reverse(secondString);

    
        System.out.println("Reversed first string: " + firstString);
        System.out.println("Reversed second string: " + secondString);

        
        scanner.close();
    }
}
