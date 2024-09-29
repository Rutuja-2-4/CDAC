public class RemoveSpace {
    public static void main(String[] args){
        String str1 = "Hello world";
        String strr = str1.replaceAll("\\s","");
        System.out.println(strr);
        String str = ("  Java   Programming  ");
        String str2 = str.replaceAll("\\s","");
        System.out.println(str2);
    }
}
