import java.util.Scanner;

public class a02_Type_Conersion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        // byte -> short -> int -> float -> long -> double  => POSSIBLE CONVERSION

        System.out.print("Enter Number : ");
        float num = sc.nextInt();   /// int value in float 
        System.out.println(num);

        System.out.print("Enter Number 2: ");
        int num2 = (int) sc.nextFloat();  // float value in int  with typecasting possible
        System.out.println(num2);

        System.out.print("Enter Number 3: ");
        char num3 = sc.next().charAt(1);  // float value in int  with typecasting possible
        System.out.println(num3);

        System.out.print("Enter Number 3: ");
        char num4 = (char) sc.nextInt();  // float value in int  with typecasting possible
        System.out.println(num4);
    }
}
