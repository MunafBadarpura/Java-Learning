enum Laptop{
    Macbook(2000), Surface(1500), Elitebook, Gamimg(1000);
    
    private int price;

    // Constructor For default price (if user not sending price)
    private Laptop(){
        price = 100;
    }
    // Constructor for setting paramter price
    private Laptop(int price) {
        this.price = price;
    }


    //getter - setter
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}

public class a04_EnumInCLASS {
    public static void main(String[] args) {
        
        Laptop mac = Laptop.Macbook; // created Macbbok
        System.out.println(mac + " : " + mac.getPrice()); // print macbook and price

        mac.setPrice(6000); // changed macbook price with setter
        System.out.println(mac + " : " + mac.getPrice()); // print macbook and updated price

        Laptop elite = Laptop.Elitebook; // created Elitebook
        System.out.println(elite + " : " + elite.getPrice()); // print ELitebook and default price

    }    
}