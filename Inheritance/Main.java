package Inheritance;

public class Main {
  public static void main(String[] args) {
    Manager manager = new Manager("Kristina", 100, 50);

    // System.out.println(manager.name); the field is private
    System.out.println(manager.getName());

    System.out.println(manager.getMSalary());
  }
}
