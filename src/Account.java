// 1. Create a class called "BankAccount" with attributes such as account number, account
// holder name, and balance. Implement a method called "transferAmount" that takes two
// BankAccount objects as arguments, along with the amount to transfer, and transfers the
// specified amount from one account to another. Ensure that the balance is updated
// accordingly for both accounts. Test the method by creating two BankAccount objects,
// transferring amounts between them, and printing their updated balances.
public class Account {
    int accountNumber;
    String accountHolderName;
    double balance;
    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public void transferAmount(Account account, double amount) {
        this.balance -= amount;
        account.balance += amount;
    }
    public static void main(String[] args) {
        Account account1 = new Account(123, "John", 1000);
        Account account2 = new Account(456, "Jane", 2000);
        System.out.println("Initial balance of account1: " + account1.balance);
        System.out.println("Initial balance of account2: " + account2.balance);
        account1.transferAmount(account2, 500);
        System.out.println("Balance of account1 after transfer: " + account1.balance);
        System.out.println("Balance of account2 after transfer: " + account2.balance);
    }
    

    
}
