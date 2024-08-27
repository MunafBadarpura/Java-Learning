// make private acno  balance owner etc and use getter/setter
// use constructors 


class BankAccount{
    private String accountNumber;
    private double balance;
    private String owner;

    // setter
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    //getter
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getOwner() {
        return owner;
    }

    void deposit(double amount){
        this.balance += amount;
    }

    void withdraw(double amount){
        if(amount <= this.balance) this.balance -= amount;
        else  System.out.println("amount is higher than balance");
    }

    void getAccountDetail() {
        System.out.println("owner : "+ this.owner);
        System.out.println("Account Number : "+ this.accountNumber);
        System.out.println("Balance : "+ this.balance);
    }
}

class SavingAccount extends BankAccount{
    private double interestRate;

    // getter-setter
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public double getInterestRate() {
        return interestRate;
    }

    // void addInterest(){
    //     this.balance += this.balance * (interestRate/100);
    // }
    void addInterest() {
        double currentBalance = this.getBalance();
        double newBalance = currentBalance + (currentBalance * (interestRate / 100));
        this.setBalance(newBalance);
    }
}

class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    // getter-setter
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    // void withdraw(double amount){
    //     if((this.balance + this.overdraftLimit) >= amount) this.balance -= amount;
    //     else System.out.println("amount is higher than overdraft limit");
    // }
    void withdraw(double amount) {
        double currentBalance = this.getBalance();
        if ((currentBalance + this.overdraftLimit) >= amount) {
            this.setBalance(currentBalance - amount);
        } else {
            System.out.println("Amount is higher than overdraft limit");
        }
    }
}


public class b {
    public static void main(String[] args) {
        // BankAccount me = new BankAccount();
        // me.setBalance(1000);

        // SavingAccount sa = new SavingAccount();
        // sa.setBalance(1000);
        // sa.setInterestRate(5);

        // System.out.println(sa.getBalance());
        // sa.addInterest();
        // System.out.println(sa.getBalance());

        // CheckingAccount ca = new CheckingAccount();
        // ca.setBalance(20000);
        // ca.setOverdraftLimit(40000);
        // ca.withdraw(50000);
        // System.out.println(ca.getBalance());

        BankAccount me = new BankAccount();
        me.setAccountNumber("1001");
        me.setBalance(50000);
        me.setOwner("munaf");

        me.deposit(50000);
        System.out.println(me.getBalance());


        SavingAccount sa = new SavingAccount();
        sa.setBalance(10000);
        sa.setInterestRate(5);
        sa.addInterest();
        System.out.println(sa.getBalance());


        

    }
}
