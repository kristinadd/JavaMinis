package BreakingEncapsulation;

import java.util.Date;

public class Main {
  public static void main(String[] args) {
    // Employee employee1 = new Employee();
    // System.out.println(employee1.getHireDay());

    // // Date date = employee1.getHireDay();
    // // System.out.println( "New variable date : " + date);

    // Date date = new Date();
    // date.setTime(date.getTime() - 30 * 365 * 24 * 60 * 60 * 1000L); // Mutating date ; Subtract 30 years
    // System.out.println(date);

    // System.out.println(employee1.getHireDay());


    // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //
    // Employee2

    Date externalDate = new Date();
    System.out.println("External date -------------------------------------------------:" + externalDate);
    
    Employee2 employee = new Employee2(externalDate); // externalDate is an Object and objects are passed by reference (the same object)
    System.out.println("Assigned hireDay to employee ----------------------------------:" + employee.getHireDay());
    System.out.println("Changed the externalDate which impacted the employee hireDay --:" + employee.getHireDay().getTime());
    externalDate.setTime(0);
    // Since emp.hireDay is a reference to the same object, the change is reflected in the Employee2 object, even though the field is private.
    
    System.out.println("Changed the externalDate which impacted the employee hireDay --:" + employee.getHireDay());

    // the getter method
    System.out.println("Changed the externalDate which impacted the employee hireDay --:" + employee.getHireDay().getTime());
  }
}
