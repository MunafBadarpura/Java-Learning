// Diffrence Between StringBuffer And StringBuilder
// 1. StringBuffer: Due to synchronization, operations on StringBuffer are generally slower compared to StringBuilder when only a single thread is involved.
// 3.USECASE : 
        // StringBuffer: Use it when you need to modify strings in a multithreaded environment, and thread safety is required.
        // StringBuilder: Use it when you don’t need thread safety (most of the time in single-threaded applications) and are looking for better performance.

 

public class StringBufferAndBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(0));


        // set char at index - it remove pre char
        sb.setCharAt(0,'C');
        System.out.println(sb);

        // inset char at index - it not remove pre char
        sb.insert(1, 'O');
        System.out.println(sb);

        // delete string - first index is ok but second index in idx-1
        sb.delete(1,3);
        System.out.println(sb);

        // append string
        sb.append(" Tony");
        System.out.println(sb);


        // we also have StringBuffer
        StringBuffer sb2 = new StringBuffer("Hello");


    }
}












