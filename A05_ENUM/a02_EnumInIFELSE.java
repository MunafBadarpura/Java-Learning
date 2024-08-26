enum Status{
    Running,
    Pending,
    Failed
}

public class a02_EnumInIFELSE {
    public static void main(String[] args) {
        Status s = Status.Pending;

        if(s == s.Running) System.out.println("ALL GOOD");
        else if(s == s.Pending) System.out.println("WAIT IT'S PENDING");
        else if(s == s.Failed) System.out.println("TRY AGAIN");
        else System.out.println("DONE (Default)");
    }
}
