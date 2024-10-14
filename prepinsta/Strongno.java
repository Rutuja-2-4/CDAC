public class Strongno {
    public static void main(String []args){
        int num =145;
        if(detectStrong(num))
        System.out.println(num+ "is Strong Number");
        else
        System.out.println(num +"is not a Strong Number");
    }
        static int facto(int n){
            int fact = 1;
            for(int i =1; i<=n; i++)
            fact = fact*i;
            return fact;
        }
        static boolean dectectStrong(int num)
        {
            int digit,sum=0;
            int temp =num;
            boolean flag = false;

            while(temp != 0)
            {
                digit = temp %10;
                sum =sum+facto (digit);
                temp/=10;
            }
            if(sum == num)
            flag = true;
            else
            flag = false;
            return flag;
        }
    }

