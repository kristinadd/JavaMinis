package ComparatorTesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println("Testing Comparator interface");

    Person person_one = new Person("Kristina", 19);
    Person person_two = new Person("Boby", 29);
    Person person_three = new Person("Hey", 17);

    List<Person> people = new ArrayList();
    people.add(person_one);
    people.add(person_two);
    people.add(person_three);

    Comparator comparator = new ComparePersonByName();

    Collections.sort(people, comparator);

    System.out.println(people);

    // System.out.println calls the toString method of the object being printed.
    // #################################
    // When you pass a single object to System.out.println, it calls object.toString() to get a string representation of the object.
    // For a collection like a List, System.out.println internally calls the toString method of the List class.
    // The toString implementation in List iterates through the elements of the list and calls the toString method of each element.

    // Person Class Must Override toString:
    // If the Person class does not override the toString method, the default implementation from Object will be used.
    // The default toString from Object outputs something like:
    // Person@1a2b3c4d
  }
}
