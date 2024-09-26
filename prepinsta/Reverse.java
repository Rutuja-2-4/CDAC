//Find the Reverse of a Number in Java
public class Reverse {
    public static void main(String[] args) {
    int num = 123,reverse =0, rem;
    while (num != 0){
        rem = num %10;
        reverse =reverse *10+rem;
        num/=10; 
    };
    System.out.println("Reverse of the number is: "+reverse);
}
}
