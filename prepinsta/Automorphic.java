public class Automorphic
{
	public static void main(String[] args) {
	   
	int n = 376, sq = n * n ;
    if(isAutomorphic(n) == 1)
        System.out.println("Num: "+ n + ", Square: " + sq + " - is Automorphic");
    else
        System.out.println("Num: "+ n + ", Square: " + sq + " - is not Automorphic");
	   
		
	}
	
	static int isAutomorphic(int n){
    int square = n * n;
    while(n != 0)
    {
        
        if(n % 10 != square % 10){
            return 0;
        }
        
        n /= 10;
        square /= 10;
    }
    
    return 1;
}
}