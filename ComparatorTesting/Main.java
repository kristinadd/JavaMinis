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
  }
}
