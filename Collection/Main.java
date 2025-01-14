package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.print.attribute.standard.Copies;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(); // ArrayList implements Collection indirectly by implementing the List interface
    // List interface  extends Collection interface

    list.add(5);
    list.add(2);
    list.add(17);
    list.add(12);
    list.add(5);

    System.out.println(list);

    Collections.sort(list); // sort in natural order
    System.out.println(list);

    Collections.reverse(list);
    System.out.println(list);

    Collections.shuffle(list);
    System.out.println(list);

    int min = Collections.min(list);
    System.out.println(min);

    int max = Collections.max(list);
    System.out.println(max);

    Collections.synchronizedList(list); // Makes a List thread-safe.
    System.out.println(list);

    System.out.println("########");
    System.out.println(list);
    Collections.unmodifiableList(list);
    list.add(100);
    System.out.println(list);
    // The reason the 100 was added to the list even after calling Collections.unmodifiableList(list) 
    // is because the method does not modify the original list. Instead, it returns a new unmodifiable 
    // view of the list. If you don't use or assign the returned unmodifiable view, the original list remains modifiable.
    System.out.println("####--Unmodifiable--####");
    System.out.println(list);
    List<Integer> unmodifiableList = Collections.unmodifiableList(list); // returns list 
    // unmodifiableList.add(50); // throws java.lang.UnsupportedOperationException
    System.out.println(unmodifiableList);
    ArrayList<Integer> arrayList = new ArrayList<>(unmodifiableList);
    System.out.println(arrayList);


    // The Collections.binarySearch(list, key) method performs a binary search to locate the position of a 
    // key in a sorted List. Binary search is a fast search algorithm with a time complexity of O(log n), 
    // but it works only on sorted data.
    System.out.println("####--Rotate--####");
    System.out.println(list);
    Collections.rotate(list, 2);
    System.out.println(list);

    System.out.println("####--Frequency--####");
    System.out.println(list);
    int count = Collections.frequency(list, 5);
    System.out.println(count);

    System.out.println("####--Fill--####");
    // Replaces all elements in the list with the specified object.
    System.out.println(list);
    Collections.fill(list, 5);
    System.out.println(list);

    System.out.println("####--Copy--####");
    // Copies elements from the source list to the destination list.
    ArrayList<String> destList = new ArrayList<>();
    destList.add("nothing");
    destList.add("nothing_two");
    ArrayList<String> srcList = new ArrayList<>();
    srcList.add("something");
    Collections.copy(destList, srcList);
    System.out.println(destList);
    // The Collections.copy(dest, src) method copies elements from the source list (src) to the destination list (dest). 
    // The destination list must already have at least as many elements as the source list, because Collections.copy 
    // replaces elements in the destination list, rather than adding to it.


    
  }
}
