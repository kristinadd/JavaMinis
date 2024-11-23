package BreakingEncapsulation;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class BreakingEncapsulation {
  // The issue is about breaking encapsulation when an object’s private field is directly or indirectly modified through an accessor method (getter). 
 // Encapsulation is a core principle of object-oriented programming that ensures an object's internal state is only changed in controlled and predictable ways.
  
 // Immutable objects: Cannot be changed once created. Examples include String and LocalDate. They are safe to expose because their state cannot be modified.

 // Mutable objects: Can be changed after creation, like Date (from java.util.Date). They are risky to expose because external code can modify their internal state.

 class Employee {
  private Date hireDay;
  
  public Employee(Date hireDay) {
    this.hireDay = hireDay;
  }

  public Date getHire() {
    return hireDay; // BAD: This exposes the mutable Date object
  }

  // Here’s what happens when you use this code:
  public static void main(String[] args) {
    BreakingEncapsulation breakingEncapsulation = new BreakingEncapsulation();
    Employee harry = breakingEncapsulation.new Employee(new Date());
    Date d = harry.getHire(); // d refers to the same Date object as harry.hireDay
    d.setTime(d.getTime() - 10 * 365 * 24 * 60 * 60 * 1000L); // Mutating d

    // Employee object:
    //   hireDay -> [ Date object in memory ]

    // Variable d:
    //   -> [ Same Date object in memory ]

    // Calling d.setTime() modifies the same object!


    // It creates a hidden backdoor for modifying an object’s internal state:
    // Breaks encapsulation: External code can change the state of private fields.
    // Bugs: The Employee object might behave unexpectedly because its internal state has been altered.

    // FIX
    // The fix is to return a copy (clone) of the mutable object instead of the actual reference. By doing so, changes to the returned object don’t affect the original.

    // class Employee {
    //   private Date hireDay;
  
    //   public Employee(Date hireDay) {
    //       this.hireDay = new Date(hireDay.getTime()); // Clone the Date in the constructor
    //   }
  
    //   public Date getHireDay() {
    //       return new Date(hireDay.getTime()); // Return a clone of the Date
    //   }
    // }
  
    // new Date(hireDay.getTime()) creates a new object in memory that is a copy of hireDay.
    // External code can modify the returned Date object without affecting the internal state of the Employee object.

    // 7. Immutable Objects Don’t Have This Problem
    // If you use an immutable class like LocalDate (from java.time), this issue doesn’t occur because LocalDate cannot be modified after creation.

    // class Employee {
    //   private LocalDate hireDay;

    //   public Employee(LocalDate hireDay) {
    //       this.hireDay = hireDay; // LocalDate is immutable, no need to clone
    //   }

    //   public LocalDate getHireDay() {
    //       return hireDay; // Safe to return directly
    //   }
    // }

    // Why This Is Safe:
    // The hireDay field cannot be changed because LocalDate has no methods that modify its state.
    // Even if you return it directly, external code cannot alter the Employee’s internal state.

    // 8. Key Takeaways
    // Mutable objects like Date can be changed after creation, leading to unintended side effects if their references are exposed.
    // Immutable objects like LocalDate are safe to expose because they cannot be modified.
    // To protect mutable objects:
    // Clone them before returning from a getter.
    // Clone them before storing them in a field.
    // Always prefer immutable classes for sensitive or shared data to simplify your code and reduce bugs.

    // Summary
    // When you expose a mutable object reference via a getter, external code can modify the object, breaking encapsulation and causing bugs.
    // Use cloning to protect internal state, or prefer immutable objects like LocalDate to avoid the problem entirely. This ensures your object remains safe and behaves predictably.

  }
 }
}
