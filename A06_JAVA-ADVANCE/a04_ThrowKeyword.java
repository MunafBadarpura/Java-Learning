// Custom Exceptions
class munafException extends Exception{
    public munafException(String str){
        super(str);
    }
}

public class a04_ThrowKeyword {
    public static void main(String[] args) {
        int i = -20;
        int j = 0;

        try{
            j = 18/i;
            if(i<1) throw new munafException("i is less than 1");
        }
        catch(ArithmeticException e){
            j = 18/1;  // default if i<1
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }


        System.out.println(j);
    }
}
