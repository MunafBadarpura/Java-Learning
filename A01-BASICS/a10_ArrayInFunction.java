import java.util.Scanner;

public class a10_ArrayInFunction {

        static void input(int arr[]){
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        

        // input function call
        input(arr);

        // print with func
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
