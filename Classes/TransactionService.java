package Classes;

public class TransactionService {
  public static void main(String[] args) {
    BankAccount account1 = new BankAccount("12345", 500.0);

    account1.deposit(200.0);

    System.out.println("Account1 balance: " + account1.getBalance());

    // The field balance is not visible
    // account1.balance = 900.00;
    // System.out.println(account1.balance);

    // Breaking Encapsulation
    // Encapsulation is about hiding the internal details of a class and exposing only the necessary behavior through methods.
    // When fields are public, you expose the internal state of the object directly, making it vulnerable to unintended changes.
    // To prevent this, fields should be declared private and accessed or modified only through public methods. This allows you 
    // to control how the field is updated and enforce rules.
  }
  
}
