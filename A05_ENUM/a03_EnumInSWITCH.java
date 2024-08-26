enum Status{
    Running,
    Pending,
    Failed
}

public class a03_EnumInSWITCH {
    public static void main(String[] args) {
       Status s = Status.Failed;

       switch (s) {
        case Running:
            System.out.println("ALL GOOD");
            break;
        case Pending:
            System.out.println("WAIT IT'S PENDING");
            break;
        case Failed:
            System.out.println("TRY AGAIN");
            break;
       
        default:
            System.out.println("DONE (Default)");
            break;
       }
    }
}
