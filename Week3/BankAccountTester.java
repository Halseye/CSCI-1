package Week3;

public class BankAccountTester {
    // Tests methods of BankAccount
    public static void main(String[] args) {
        BankAccount gregChecking = new BankAccount();
        BankAccount bobChecking = new BankAccount(10000);
        System.out.println(gregChecking.getBalance()); 
        System.out.println(bobChecking.getBalance());
        gregChecking.monthlyFee();
        bobChecking.withdraw(1000);
        System.out.println(bobChecking.getBalance());
        System.out.println(gregChecking.getBalance());

        gregChecking.deposit(50000);
        gregChecking.calcInterest(gregChecking.getBalance(), 10, 0.07, 12);
    }
}
