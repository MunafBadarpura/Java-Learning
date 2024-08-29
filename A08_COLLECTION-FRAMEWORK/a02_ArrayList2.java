import java.util.ArrayList;
import java.util.Scanner;

public class a02_ArrayList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        int n;
        System.out.print("Enter N : ");
        n = sc.nextInt();

        System.out.println("Enter Arr : ");
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            arr.add(x);
        }


        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }

        // print reverese
        System.out.println("\nReverse Arr : ");
        for(int i=arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i) + " ");
        }
    }
}
