package HashSet;

import java.util.HashSet;

public class HashSetTesting {
  // A HashSet is a class in Java that implements the Set interface and is part of the java.util package. 
  // It represents a collection of unique elements, meaning it does not allow duplicate values.
  // A HashSet is backed by a HashMap, and it uses hashing to store and retrieve elements efficiently.
  // A HashSet does not allow duplicate elements. If you try to add a duplicate, the operation will be ignored.
  // The elements in a HashSet are not stored in the order they were added. The order is determined by the hash values.
  // A HashSet can store one null value because it treats null as a unique value.
  // The HashSet provides constant-time performance (O(1) on average) for common operations like add, remove, and contains.
  // Internally, a HashSet is backed by a HashMap, where the elements are stored as keys in the HashMap and a dummy object acts as the value.

  public static void main(String[] args) {
    HashSet<String> set = new HashSet<>();
    set.add("Apple");
    set.add("Orange");
    set.add("Cherry");
    set.add("Cherry"); // duplicate; ignored 

    System.out.println(set.contains("Orange"));
    System.out.println(set.contains("Brrrr"));

    System.out.println(set.remove("Apple"));
    System.out.println(set.remove("Brrrr"));

    System.out.println(set.size());

    for (String fruit : set) {
      System.out.println(fruit);
    }

    System.out.println(set);
  }
}
