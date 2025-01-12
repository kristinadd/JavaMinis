package Banking;

public class BasicBankAccount implements BankAccount {
  private double balance;
  private double interestRate;

  public BasicBankAccount(double interestRate) {
    this.balance = 100;
    this.interestRate = interestRate;
  }

  @Override
  public double getBalance() {
    return balance;
  }

  public double getInterestRate() {
    return interestRate;
  }

  public double calculateInterest() {
    return balance * (interestRate / 100);
  }

  public void applyInterest() {
    double interest = calculateInterest();
    balance += interest;
  }
}
