/*Next Step: Write a Java program that finds and prints the largest of three predefined 
numbers using if-else statements. */
class largestNumber{
	public static void main(String args[]){
		int a =8;
		int b =16;
		int c =24;
		
        if (a >= b && a >= c) {
            System.out.println("a is the largest number: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("b is the largest number: " + b);
        } else {
            System.out.println("c is the largest number: " + c);
        }
    }
}