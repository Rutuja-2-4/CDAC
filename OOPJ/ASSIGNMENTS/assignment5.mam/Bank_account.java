//1	Create a base class BankAccount with methods like deposit() and withdraw(). Derive a class SavingsAccount that overrides the withdraw() method to impose a limit on the withdrawal amount. Write a program that demonstrates the use of overridden methods and proper access modifiers & return the details.
class BankAccount{
    protected double balance;
     protected double amount;
    //constructor
    public BankAccount(double balance,double amount){
        this.balance =balance;
        this.amount =amount;
    }
    // getter for balance
    public double getBalance(){
        return balance;
    }
    //setter for balance
    public void setBalance(double balance){
        this.balance =balance;
    }
    //getter for amount
    public double getAmount(){
        return amount;
    }
    //seeter for amount
    public void setAmount(double amount){
        this.amount =amount;
    }
    //method
    void deposit(){
        this.balance +=this.amount;
    }
    //method
    void withdraw(){
        this.balance -= this.amount;
    }
    //method
    void printRecord(){
    System.out.println("Balance in super class is"+this.balance);
    }
}
class SavingAccount extends BankAccount{
    private double withdrawlLimit;
    
    //constructor
    public SavingAccount(double balance,double amount,double withdrawl){
        super(balance,amount);
        this.withdrawalLimt =withdrawalLimit;
    }
    @Override
    public void withdraw() {
        if (amount <= withdrawalLimit && amount <= balance) {
            super.withdraw();
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Withdrawal amount exceeds limit or insufficient balance.");
        }
    }

    // Print account record for SavingsAccount
    @Override
    public void printRecord() {
        System.out.println("Balance in savings account is: ₹" + this.balance);
    }
}
public class program{
    public static void main(String []args){
        SavingAccount s =new SavingAccount(5000.00,1200,2000.00);
        s.withdraw();
        s.deposite();
        s.printRecord();
    }
}