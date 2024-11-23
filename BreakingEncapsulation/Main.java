package BreakingEncapsulation;

import java.util.Date;

public class Main {
  public static void main(String[] args) {
    Employee employee1 = new Employee(new Date());
    System.out.println("Initialized with value: " + employee1.getHireDay());

    // Date date = employee1.getHireDay();
    // System.out.println( "New variable date : " + date);

    Date date = new Date();
    date.setTime(date.getTime() - 30 * 365 * 24 * 60 * 60 * 1000L); // Mutating date ; Subtract 30 years
    System.out.println("Se the date variable to new date: " + date);

    System.out.println("employee hire day: " + employee1.getHireDay());

  }
}
