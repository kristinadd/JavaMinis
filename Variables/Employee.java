package Variables;

public class Employee {
  public String name; // instance variable; belongs to the instance
  public int age;
  public static int employeeCount = 0; // static variable; belongs to the class

  public Employee(String name, int age) {
    this.name = name; //assigning the variable
    this.age = age;
    employeeCount ++;
  }

  public void displayInfo() {
    System.out.println("name: " + name + " age: " + age);
  }

  public static int getEmployeeeCount() {
    return employeeCount;
  }
}

