import java.util.Scanner;

public class a12_2D_Input {

    static void input(int arr[][]){
        Scanner sc = new Scanner(System.in);
    
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[1].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows : ");
        int n = sc.nextInt();
        System.out.print("Enter Columns : ");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        System.out.println("Enter Arr : ");
        input(arr);

        System.out.println("Print : ");
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        for(int row[] : arr){
            for(int i: row){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
