package Variables;

import java.time.LocalDate;

public class Employee {
  public String name; // instance variable; belongs to the instance
  public int age;
  public static int employeeCount = 0; // static variable; belongs to the class
  private static LocalDate startDate;

  public Employee(String name, int age) {
    this.name = name; //assigning the variable
    this.age = age;
    employeeCount ++;
    startDate = LocalDate.now();
  }

  public void displayInfo() {
    System.out.println("name: " + name + " age: " + age);
  }

  public static int getEmployeeeCount() {
    return employeeCount;
  }

  public static LocalDate getStartDate() {
    return startDate;
  }

  // Yes, if a field is declared as static, it is generally a good practice to make its getter (or any related methods) 
  // static as well. This is because static fields belong to the class, not to any specific instance, and accessing 
  // them through a non-static getter can be confusing or misleading.

  // Static fields represent class-level data, meaning they do not require an instance of the class.
  // A static getter ensures that the field can be accessed consistently without requiring an instance of the class.


}

