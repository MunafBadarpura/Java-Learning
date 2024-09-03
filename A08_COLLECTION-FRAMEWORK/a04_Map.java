import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class a04_Map {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Sohil", 80);
        students.put("Munaf", 50);
        students.put("Hasan", 75);
        students.put("Afnan", 60);
        students.put("Sahad", 85);

        students.put("Munaf", 100); // added same key it dont create another key just update value  

        System.out.println(students);
        System.out.println("Hasan Marks : " + students.get("Hasan"));  //75
        System.out.println(students.containsKey("Sahad")); // true
        System.out.println(students.keySet()); // [Sahad, Hasan, Afnan, Munaf, Sohil]
        System.out.println(students.values()); // [85, 75, 60, 100, 80]

        for(String name : students.keySet()){
            System.out.println(name + " : " + students.get(name));
        }


        // SOME EXTRA METHODS
        // students.remove("Hasan"); // remove this element
        // students.clear();  // clear all elements
        // students.replace("Munaf", 10); // update value
        // students.replace("Munaf", 100, 200);
        // System.out.println(students.size());


        // Taking Input : -----------------------------------------
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> Students = new HashMap<>();
        System.out.print("Enter Number of students : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("Enter Student" + i + " Name: ");
            sc.nextLine(); // after n we click enter button so it take enter for flush
            String name = sc.nextLine();
            System.out.print("Enter Student" + i + " Marks : ");
            int marks = sc.nextInt();

            Students.put(name, marks);
        }

        for(String name : Students.keySet()){
            System.out.println(name + " : " + Students.get(name));
        }

    }
}
