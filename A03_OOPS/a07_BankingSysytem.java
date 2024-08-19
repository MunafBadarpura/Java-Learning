// make private acno  balance owner etc and use getter/setter
// use constructors 


class BankAccount{
    String accountNumber;
    double balance;
    String owner;
    
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
    double interestRate;

    void addInterest(){
        this.balance += this.balance * (interestRate/100);
    }
}

class CheckingAccount extends BankAccount{
    double overdraftLimit;

    void withdraw(double amount){
        if((this.balance + this.overdraftLimit) >= amount) this.balance -= amount;
        else System.out.println("amount is higher than overdraft limit");
    }
}


public class a07_BankingSysytem {
    public static void main(String[] args) {
        BankAccount me = new BankAccount();
        me.balance = 1000;

        SavingAccount sa = new SavingAccount();
        sa.balance = 1000;
        sa.interestRate = 5;

        System.out.println(sa.balance);
        sa.addInterest();
        System.out.println(sa.balance);

        CheckingAccount ca = new CheckingAccount();
        ca.balance = 20000;
        ca.overdraftLimit = 40000;
        ca.withdraw(50000);
        System.out.println(ca.balance);
        

    }
}
