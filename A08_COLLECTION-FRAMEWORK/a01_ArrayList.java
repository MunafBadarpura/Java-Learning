import java.util.ArrayList;

public class a01_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        System.out.println(arr.get(0));
        System.out.println(arr);
        System.out.println(arr.size());

        // Remove element at index = O(n)
        arr.remove(2); // it remove element at second index
        // 10, 20, 40

        // Set element at index = O(n)
        arr.set(2, 400); //it remove old value and add new
        // 10, 20, 400
 
        // Contains Element = O(n), it check elem exist or not
        System.out.println(arr.contains(400)); // true
        System.out.println(arr.contains(40));  // false

        // Add at index = O(n)
        System.out.println("before add : "+ arr); // 10, 20, 400
        arr.add(1, 15);
        System.out.println("after add : "+ arr); // 10, 15, 20, 400

        arr.clear(); // clear all elems
    }
}
