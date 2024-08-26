//4. Write a program to reverse the digits of the number 1234. The output should be 4321. 
class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234;
        int result = 0;
        
        while(num != 0) {
            int rem = num % 10;
            result = result* 10 + rem;
            num = num /10;
        }
        
        System.out.println("Final result: " + result);
    }
}
