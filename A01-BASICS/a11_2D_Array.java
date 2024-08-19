public class a11_2D_Array {

    public static void main(String[] args) {
        // int arr[][] = new int[row][column];
        int arr[][] = {{1,2,3},{4,5,6}};

        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[1].length;j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // for each loop
        for(int[] row : arr){
            for(int i: row){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}