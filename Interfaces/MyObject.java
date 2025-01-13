package Interfaces;

public class MyObject implements Comparable<MyObject> {
  private int number;

  public MyObject(int number) {
    this.number = number;
  }

 @Override
 public int compareTo(MyObject other) {
  return Integer.compare(this.number, other.number);
 }

 @Override
 public String toString() {
     return "MyObject{" + "number=" + number + '}';
 }

 // Always override the toString() method when you want objects to have a meaningful string representation.

 // When working with arrays or collections, methods like Arrays.toString() or Collections.toString() 
 // rely on the toString() method of the objects they contain.
}
