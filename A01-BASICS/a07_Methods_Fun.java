import java.util.Scanner;

public class a07_Methods_Fun {

    static void fun(){
        System.out.println("Function Called");
    }

    static int sumOfTwoNum(int a, int b){  // parameters or formal parameters
        return a+b;
    }

    static void swapTwoNum(int i, int j){ // java always pass by value
        int t = i;
        i = j;
        j = t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N : ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            fun();
            // a07_Methods_Fun.fun();
        }

        int c = sumOfTwoNum(10, 10); // arguments or actual parms
        System.out.println(c);

        int i = 10;
        int j = 20;

        swapTwoNum(i, j);
        System.out.println("i = "+ i);
        System.out.println("j = "+ j);

    }
}