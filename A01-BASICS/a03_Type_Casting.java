import java.util.Scanner;

public class a03_Type_Casting {
    public static void main(String[] args) {
        
        float a = 10;
        int b = (int) a;     //this is not possible so we use typeCasting
        System.out.println(b);

        double db = 34324;
        short sh = (short) db;
        System.out.println(sh);
    }
}
