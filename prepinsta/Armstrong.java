
import java.util.*;
public class Armstrong {
    public static void main(String args[]){
        int num = 371, reverse = 0;
        int len = order(num);
        if (num ==  getArmstrongsum(num,len))
        System.out.println(num + "is an Armstrong number");
        else
        System.out.println(num + "is not an Armstrong number");
    }
    private static int getArmstrongsum(int num , int order){
        if(num == 0)
        return 0;

int digit = num %10;    

return (int) Math.pow(digit,order) + getArmstrongsum(num/10,order);
}
private static int order(int num){
    int len =0;
    while(num!=0)
    {
        len++;
        num = num/10;
    }
    return len;
}
}