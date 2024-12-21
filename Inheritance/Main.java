package Inheritance;

public class Main {
  public static void main(String[] args) {
    Manager manager = new Manager("Kristina", 100, 50);
    System.out.println(manager.getName());

    manager.setBonus(300);
    System.out.println(manager.getBonus());

    var staff = new Employee[3];

    staff[0] = manager;
    staff[1] = new Employee("Lea", 50);
    staff[2] = new Employee("Bobby", 30);

    for (Employee employee : staff) {
      System.out.println("name ==> " + employee.getName() + "; salary ==> " + employee.getSalary());
    }
    
    Manager executive = new Executive("Tula", 300, 300, 300);

    System.out.println("the bonus is: " + executive.getBonus());
  }
}
