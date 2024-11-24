package Classes;

import java.time.LocalDate;
import java.util.Objects;

public class BankAccount {
  private String accountNumber;
  private double balance;
  private LocalDate creationDate;

  // Constructor 
  public BankAccount(String accountNumber, double balance) {
    this.accountNumber = accountNumber;
    // this.accountNumber = Object.requireNonNull(accountNumber, "The Account Number cannot be null") ; avoiding potential NullPointerException issues
    // If accountNumber is null, it immediately throws a NullPointerException with the provided message ("The Account Number cannot be null").
    // This prevents the creation of an invalid BankAccount object.
    this.balance = balance;
    this.creationDate = LocalDate.now();
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited " + amount + ". New Balnce is " + balance);
    } else {
      System.out.println("Deposit amount must be possitive.");
    }
  }

  public String getAccountNumber() {
    return accountNumber;
  }

// "Whenever you accept an object reference as a construction parameter": This means whenever your class takes an object (like a String, List, or a custom class like BankAccount) 
// as an argument in a constructor, you should be mindful of whether you’re allowing it to be null.

// "Ask yourself whether you really intend to model values that can be present or absent": Think about whether it makes sense for this object reference to be optional. For example:

// If the parameter is critical (like an accountNumber in a BankAccount), it should not be null. Allowing null creates ambiguity and potential bugs.
// If the parameter is genuinely optional (like a nickname for a user), it might make sense to allow null.
// "If not, the 'tough love' approach is preferred": The "tough love" approach means being strict and not allowing null values for critical parameters. You enforce this by:

// Throwing exceptions (e.g., using Objects.requireNonNull).
// Using default values or alternative approaches (like Optional in some contexts).
// In essence: Only allow null when it makes logical sense for your model. Otherwise, prevent it with strict checks or design choices.

// Objects can be null: Any reference type (e.g., String, List, Map, or custom objects) can be null.
// Primitives cannot be null: Primitive types (like int, double, boolean, etc.) cannot be null. They always have a default value (e.g., 0 for int, false for boolean).
// However, String is not a primitive. It is an object (a reference type), so it can be null.
}
