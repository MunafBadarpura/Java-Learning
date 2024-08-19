import java.util.Scanner;

public class a01_StringBasic {
    public static void main(String[] args) {
        // Strings are IMMUTABLE

        char arr[] = {'a', 'b', 'c', 'd'};

        String str = "abcd";
        String str2 = new String("abcdd");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        String name = sc.nextLine();

        System.out.println(name);
        System.out.println("String length : " + name.length());

        // Concanitaion 
        String firstName = "Munaf";
        String lastName = "Badarpura";
        String fullName = firstName + " " + lastName; // Munaf Badarpura

        System.out.println(fullName); // Munaf Badarpura
        System.out.println("Char at 7 : " + fullName.charAt(6)); // B

    }
}
