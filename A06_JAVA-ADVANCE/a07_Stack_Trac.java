public class a07_Stack_Trac {
    public static void main(String[] args) {
        try{
            level1();
        }
        catch(Exception e){
            StackTraceElement[] arr =  e.getStackTrace();
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    }

    public static void level3(){
        int arr[] = new int[5];
        arr[6] = 20;
    }

    public static void level2(){
        level3();
    }

    public static void level1(){
        level2();
    }
}
