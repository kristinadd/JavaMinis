package Classes;

import java.time.LocalDate;

public class BankAccount {
  private String accountNumber;
  private double balance;
  private LocalDate creationDate;

  // Constructor 
  public BankAccount(String accountNumber, double balance, LocalDate creationDate) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.creationDate = creationDate;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    balance += amount;
  }
  

}
