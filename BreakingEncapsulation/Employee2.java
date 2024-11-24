package BreakingEncapsulation;

import java.util.Date;

public class Employee2 {
  private Date hireDay;

  public Employee2(Date hireDay) {  // passign an Object as a parameter is passign the object by reference
      this.hireDay = hireDay;       // The hireDay parameter in the constructor holds a reference to the same Date object that was passed by the caller.
  }                                 // When you assign this.hireDay = hireDay;, the Employee2 class now holds a reference to the same object, not a new object.
                                    // To solve this issue, you need to create a new Date object (a copy) inside the constructor instead of directly assigning the reference.
  public Date getHireDay() {        // this.hireDay = new Date(hireDay.getTime()); // Create a copy of the Date object
      return hireDay;
  }
  // Return a defensive copy to protect internal state
  // return new Date(hireDay.getTime());
}

// You’re not creating an arbitrary new Date; you’re creating a new instance with the same value as the original, 
// preserving the intended behavior while maintaining encapsulation.

// The problem occurs when the reference to a mutable object (like Date) is passed to a constructor and assigned directly to a field.

// Any external modification to the object affects the internal state of the class, breaking encapsulation.

//Fix:
// Constructor: Use defensive copying to store a new instance of the object in the field.
// Getter: Return a defensive copy to ensure external code cannot modify the internal object.