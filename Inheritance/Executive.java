package Inheritance;

public class Executive extends Manager{
  private double stockOptions;

  public Executive(String name, double salary, double bonus, double stockOptions) {
    super(name, salary, bonus);
    this.stockOptions = stockOptions;
  }
}
