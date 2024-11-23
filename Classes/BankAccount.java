package Classes;

import java.time.LocalDate;

public class BankAccount {
  private String accountNumber;
  private double balance;
  private LocalDate creationDate;

  // Constructor 
  public BankAccount(String accountNumber, double balance) {
    this.accountNumber = accountNumber;
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

  
}
