package Variables;

public class Main {
  public static void main(String[] args) {
    Employee employee = new Employee("Kristina", 99, 7);
    employee.displayInfo();
    System.out.println(Employee.getEmployeeeCount());

    Employee employee2 = new Employee("KDD", 100, 78);
    employee2.displayInfo();
    System.out.println(Employee.getEmployeeeCount()); // static field should be accessed in a static way
    System.out.println(employee2.getEmployeeeCount()); // still woks but employeeCount belongs to the class not to the instance

    System.out.println(Employee.employeeCount); // the static field is public

    System.out.println(employee2.name); // the field is public 

    System.out.println(Employee.getStartDate()); // private static 

    Employee employee3 = new Employee("Kristina", 88, 19);

    System.out.println(employee3.luckyNumber);

    employee2.name = "Pebbles";

    System.out.println(employee2.name);

    // employee3.luckyNumber = 65; // Cannot assign a new value to a final variable


  }
}
