import java.util.Scanner;

public class a01{
    public static void main(String args[]){

        int a = 20;
        // float b = 20.20; // not allowed
        float b = 20.20f; // allowed

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String input = sc.nextLine();
        System.out.println(input);

        System.out.print("Enter Number : ");
        int number = sc.nextInt();
        System.out.println(number);

        System.out.print("Enter Float : ");
        float fl = sc.nextFloat();
        System.out.println(fl);

        System.out.print("Enter Bool : ");
        boolean bl = sc.nextBoolean();
        System.out.println(bl);

    }
}