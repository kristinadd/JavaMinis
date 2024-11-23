package Classes;

public class TransactionService {
  public static void main(String[] args) {
    BankAccount account1 = new BankAccount("12345", 500.0);

    account1.deposit(200.0);

    System.out.println("Account1 balance: " + account1.getBalance());

    // The field balance is not visible
    // account1.balance = 900.00;
    // System.out.println(account1.balance);

  }
  
}
