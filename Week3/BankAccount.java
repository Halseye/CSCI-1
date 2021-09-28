package Week3;


public class BankAccount {
    // Make it private because we dont want people to be able to see account balances 
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    
    public BankAccount(double initalBalance){
        balance = initalBalance;
        // this.balance = InitialBalance;
    }
    // Deposit Money into Bank
    // implicit parameter vs explicit parameters 
    // amount is the explicit parameter
    // BankAccount is the implicit parameter
    public void deposit(double amount){
        balance = balance + amount;
        // this.balance = this.balance + amount
        // this is used to help denote the implicit parameter 
    }
    // Withdraw Money from Bank
    public void withdraw(double amount){
        balance = balance - amount;
    }
    // Get current balance of the Account
    public double getBalance(){
        return balance;
    }
    // public BankAccount(double balance){
    //     this.balance = balance;
    // }
    public void monthlyFee(){
        withdraw(10);
    }
    // transfer 
}
