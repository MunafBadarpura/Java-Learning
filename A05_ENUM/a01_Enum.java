enum Status{
    Running,
    Coding,
    Playing,
    Writing
}

public class a01_Enum {
    public static void main(String[] args) {
        Status myVar = Status.Playing;

        System.out.println(myVar);
        System.out.println(myVar.ordinal());

        // Array of Status
        Status sValues[] = Status.values();
        // System.out.println(sValues[0]);
        // System.out.println(sValues[1]);
        // System.out.println(sValues[2]);
        // System.out.println(sValues[3]);

        // Loop
        for(Status s : sValues){
            System.out.println(s + " : " + s.ordinal());
        }
    }
}
