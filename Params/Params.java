package Params;

import BreakingEncapsulation.Employee;

public class Params{
  // • Primitive types (numbers, boolean values) 
  // • Object references

  Employee Bobby = new Employee();

  public static void main(String[] args) {
    Employee Bobby = new Employee();
    System.out.println(Bobby.getVacationDays());
  }
}

