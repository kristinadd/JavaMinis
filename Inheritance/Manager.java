package Inheritance;

public class Manager extends Employee {
  private double bonus;

  public Manager(String name, double salary, double bonus) {
    super(name, salary);
    this.bonus = bonus;
  }

  // public double getMSalary() {
  //   double baseSalary = getSalary();
  //   return baseSalary + bonus;
  // }

  public double getSalary() {
    double baseSalary = super.getSalary(); // recursive need to specify it's called on the super class
    return baseSalary + bonus;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  public double getBonus() {
    return bonus;
  }
}
