
//1. Write a program to calculate the sum of the first 50 natural numbers
class NaturalNumber{
	public static void main(String args[]){
		int i = 50;
		int sum = 0;
		for(i=1;i<=50;i++){
			sum = sum+i;
		}
		System.out.println(sum);
	}
}