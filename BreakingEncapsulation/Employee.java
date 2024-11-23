package BreakingEncapsulation;

import java.util.Date;

public class Employee {
  private Date hireDay; // Date is mutable

    public Employee(Date hireDay) {
        this.hireDay = hireDay;
    }

    public Date getHireDay() {
        return hireDay; // BAD: This exposes the mutable Date object
    }
}
