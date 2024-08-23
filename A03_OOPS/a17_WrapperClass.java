public class a17_WrapperClass {
    public static void main(String[] args) {
        int num = 10;
        Integer a = new Integer(num);   // boxing
        Integer b = num;   // auto - boxing

        int c = a.intValue();  // un-boxing

        // Integer d = 20;

        String str = "10";
        int num2 = Integer.parseInt(str);
        System.out.println(num2*2); //20
    }
}
