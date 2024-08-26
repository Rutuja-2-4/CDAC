/*14. Write a program to print the following pattern: 
* 
** 
*** 
***** 
******* 
*********
*/

class Pattern14{
	public static void main(String args[]){
	int n =6;
	{
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
}
