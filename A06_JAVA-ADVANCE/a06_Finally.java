public class a06_Finally {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try{
            j = 20/i;
        }
        catch(Exception e){ 
            System.out.println("Something went wrong");
        }
        finally{  // this block always execute if try execute or catch, it will always wxecute
            System.out.println("Byee");
            System.out.println("Some extra statemenets");
        }
    }
}
