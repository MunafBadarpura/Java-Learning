// package A03_OOPS;


public class a01_Basics {

    public static void main(String[] args) {
        Pen p1 = new Pen();  // created a pen object called p1
        p1.setColour("blue");
        p1.tipSize = 20;
        System.out.println(p1.colour);

        // Access Modifires
        BankAccount myAcc = new BankAccount();
        myAcc.username = "munaf"; 
        myAcc.setPassword("PASS@65473");
        // myAcc.password = "658465"; // not allowed 
        String acPass = myAcc.getPassword();
        System.out.println(acPass);
    }
}

class Pen{
    String colour;
    int tipSize;

    void setColour(String newColour){
        colour = newColour;
    }

    void setTipSize(int newTipSize){
        tipSize = newTipSize;
    }
}

// Access Modifires - public private protected default
class BankAccount{
    public String username;
    private String password;

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    } 
}


