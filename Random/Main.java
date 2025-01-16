package Random;

import java.util.ArrayList;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    // String[] names = {"Kristina", "Bobby", "Alice", "John"};

    // Random random = new Random();

    // int randomIndex = random.nextInt(names.length);

    // System.out.println(names[randomIndex]);

    ArrayList<String> names = new ArrayList<>();
    names.add("Kristina");
    names.add("Bobby");
    names.add("Lia");
    names.add("Neo");

    Random random = new Random();

    int randomIndex = random.nextInt(names.size());

    System.out.println(names.get(randomIndex));

  }
}
