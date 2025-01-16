package ComparatorTesting;

import java.util.Comparator;

public class ComparePersonByName implements Comparator<Person> {
  @Override
  public int compare(Person person_1, Person person_2) {
  return person_1.getName().compareTo(person_2.getName());
  }
}

  // has no constructor
  // does not need a constructor because it is being used as a stateless utility class, 
  // which means it does not maintain any internal state or require any initialization.

  // You can create an instance of ComparePersonByAge using its default constructor, 
  // which is automatically provided by Java if no constructors are explicitly defined. 
  // Then, you can use that instance as a comparator.

  // ##################################################################################
  // The String class implements the Comparable<String> interface, 
  // which defines the natural ordering of strings (i.e., alphabetical order).

  // Delegating to String.compareTo:
  // Instead of manually implementing string comparison logic, you can rely on the compareTo 
  // method of the String class for accurate and optimized comparisons.
  // This ensures that the sorting of Person objects by name is done correctly and efficiently.

  // Logic:
  // Returns a negative value: If person_1.getName() comes before person_2.getName() alphabetically.
  // Returns zero: If the names are equal.
  // Returns a positive value: If person_1.getName() comes after person_2.getName() alphabetically.

