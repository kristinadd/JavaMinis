package Variables;

public class LocalVar {
  public static void main(String[] args) {
    int x = 10;

    if (x > 5) {
      int y = 20;
      System.out.println("x + y = " + x + y);
    }
    // System.out.println(y);  ERROR: y is out of scope
  }
}
  // Local Variables are specific to the block where they are defined
  // Local Variables don't have access modifiers like private pr public 
  