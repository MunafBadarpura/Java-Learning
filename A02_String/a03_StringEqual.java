public class a03_StringEqual {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        if(s1 == s2) System.out.println("s1 == s2");
        else System.out.println("s1 != s2");

        if(s1 == s3) System.out.println("s1 == s3");
        else System.out.println("s1 != s3");

        // if you want to check inner value
        if(s1.equals(s3)) System.out.println("s1 value and s3 values same");
        System.out.println(s1.equals(s3));
    }   
}
