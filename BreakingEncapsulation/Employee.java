package BreakingEncapsulation;

import java.util.Date;

public class Employee {
  private Date hireDay; // Date is mutable
  // What private does: Prevents direct access or reassignment of the field outside the class.

    // public Employee(Date hireDay) {
    //     this.hireDay = hireDay;
    // }

    public Employee() {
        this.hireDay = new Date(); 
        // Still bad because the getHireDay() method exposes the reference to the mutable Date object stored in the hireDay field. 
        // Even though you’ve removed the constructor that takes a Date as an argument and now initialize hireDay to a new Date() 
        // in the default constructor, the getHireDay() method still allows external code to modify the internal state of the Employee object.
    }

    public Date getHireDay() {
        return hireDay; // BAD: This exposes the mutable Date object
        // When you return hireDay, you are giving external code direct access to the Date object stored in the hireDay field. 
        // Because Date is mutable, external code can modify it, breaking encapsulation.

        // return new Date(hireDay.getTime());
    }
}
