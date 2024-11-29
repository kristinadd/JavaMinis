package Variables;

public class Main {
  public static void main(String[] args) {
    Employee employee = new Employee("Kristina", 99);
    employee.displayInfo();
    System.out.println(Employee.getEmployeeeCount());

    Employee employee2 = new Employee("KDD", 100);
    employee2.displayInfo();
    System.out.println(Employee.getEmployeeeCount()); // static field should be accessed in a static way
    System.out.println(employee2.getEmployeeeCount()); // still woks but employeeCount belongs to the class not to the instance

    System.out.println(Employee.employeeCount); // the static field is public

    System.out.println(employee2.name); // the field is public 

    System.out.println(Employee.getStartDate()); // private static 
  }
}
