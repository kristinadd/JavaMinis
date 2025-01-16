package Random;

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    String[] names = {"Kristina", "Bobby", "Alice", "John"};

    Random random = new Random();

    int randomIndex = random.nextInt(names.length);

    System.out.println(names[randomIndex]);

    
  }
}
