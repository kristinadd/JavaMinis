package Banking;

public class Main {
  public static void main(String[] args) {
    BankAccount basicBankAccount = new BasicBankAccount(5);

    // basicBankAccount.applyInterest();

    if (basicBankAccount instanceof BasicBankAccount) {
      BasicBankAccount account = (BasicBankAccount) basicBankAccount;
      account.applyInterest();
    } else {
      System.out.println("The object can't be an instance of BasicBankAccount");
    }

    System.out.println(basicBankAccount.getBalance());
  }
}
