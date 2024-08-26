public class a03_TryCatch {
    public static void main(String[] args) {
        
        int i = 0;
        int j = 0;
        int nums[] = new int[5];

        try{
            j = 20/i;
            System.out.println(nums[6]);
        }
        catch(ArithmeticException e){ // if arithmatic err this handle
            System.out.println(e);
            System.out.println("Cannot devide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){ // if ArrayIndexOutOfBoundsException err this handle
            System.out.println(e);
            System.out.println("Array outOf bound");
        }
        catch(Exception e){  // if above not execute than this execute
            System.out.println("Error : "+ e);
            System.out.println("Something Went Wrong....");
        }



        System.out.println(j);
        System.out.println("BYE");

    }
}
