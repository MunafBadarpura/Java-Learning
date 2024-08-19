public class a04_Type_Promotion {

    public static void main(String[] args) {
        short a = 20;
        char b = 'C';

        int c = b - a;
        System.out.println(c);

        // expression b/w int char short byte => int
        // expression b/w float long double => jo sabse zyada bada hoga  ex: float & long = long
    }
}