package Inheritance;

import java.util.Arrays;

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

    // In Java, arrays of subclass references can be converted to arrays of
    // superclass references without a cast. For example, consider this array of
    // managers:
    Manager[] arrayManager = new Manager[10];
    System.out.println(Arrays.toString(arrayManager));

    Employee[] team = arrayManager; // Sure, why not, you may think. After all, if arrayManager[i] is a Manager, it is also
    // an Employee. But actually, something surprising is going on. Keep in mind that
    // managers and staff are references to the same array. Now consider the
    // statement

    team[0] = new Employee("Kristina", 300);
    // The compiler will cheerfully allow this assignment. But staff[0] and
    // arrayManager[0] are the same reference, so it looks as if we managed to smuggle
    // a mere employee into the management ranks. That would be very bad—
    // calling arrayManager[0].setBonus(1000) would try to access a nonexistent
    // instance field and would corrupt neighboring memory.

    double bonus = arrayManager[0].getBonus();
    System.out.println(bonus);
    // throws Exception in thread "main" java.lang.ArrayStoreException: Inheritance.Employee
    // at Inheritance.Main.main(Main.java:35)

    // To make sure no such corruption can occur, all arrays remember the element
    // type with which they were created, 
    // and they monitor that only compatible
    // references are stored into them. For example, the array created as new
    // Manager[10] remembers that it is an array of managers. Attempting to store an
    // Employee reference causes an ArrayStoreException. 

// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //
    // Arrays Can Be Assigned to Superclass References In Java, you can assign an array of subclass references 
    // (e.g., Manager[]) to a reference of a superclass array (e.g., Employee[]) because a Manager is also an Employee.

    // Manager[] arrayManager = new Manager[10];
    // Employee[] team = arrayManager; // This is allowed because Manager extends Employee.
    // At this point:
    // Both arrayManager and team refer to the same array in memory.
    // Any change to the array through team will also reflect in arrayManager.
  }
}
