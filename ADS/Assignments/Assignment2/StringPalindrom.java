public class StringPalindrom {
    static String reverseString(String str){
		int e = str.length() - 1;
		String temp = "";
		while(e >= 0) {
			temp = temp+str.charAt(e);
			e--;
		}
		return temp;
	}
    static boolean isPalindrome(String s){
        return s.equals(reverseString(s));
    }
	public static void main(String[] args) {
		String s = "helleh";
		System.out.println(isPalindrome(s));
	}
}
