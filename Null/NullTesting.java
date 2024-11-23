package Null;

public class NullTesting {

  static String s = null;

  public static void main(String[] args) {
    System.out.println(s);

    System.out.println(s.toString());
    // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toString()" because "Null.NullTesting.s" is null
    // at Null.NullTesting.main(NullTesting.java:10)
  }
  
}
