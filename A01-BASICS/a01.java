// Datatypes in JAVA 
// 1.Primitive (Combination not exist in JAVA)
//     : 1. boolean =  Size is JVM dependent (typically 1 byte)
//       2. char = 2 bytes.
//       3. byte = 1 byte
//       4. short =  2 bytes.
//       5.int = 4 bytes
//       6.long = 8 bytes
//       7.float = 4 bytes
//       8.double = 8 bytes

// 2.Non - Primitive
//       1.String
//       2.Array
//       etc...

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
        System.out.printf("%d\n", number);

        System.out.print("Enter Float : ");
        float fl = sc.nextFloat();
        System.out.println(fl);

        System.out.print("Enter Bool : ");
        boolean bl = sc.nextBoolean();
        System.out.println(bl);

        
        System.out.println(25.50);
    }
}