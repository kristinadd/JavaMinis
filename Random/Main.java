package Random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Kristina");
    names.add("Bobby");
    names.add("Lia");
    names.add("Neo");

    // for (int i=0; i<=names.size(); i++) {
    //   Random random = new Random();
    //   int randomIndex = random.nextInt(names.size());
    //   System.out.println(names.get(randomIndex));
    //   names.remove(randomIndex);
    //   System.out.println(names);
    // }

    // Random random = new Random();

    // while (!names.isEmpty()) {
    //   int randomIndex = random.nextInt(names.size());
    //   System.out.println(names.get(randomIndex));
    //   names.remove(randomIndex);
    // }

    Collections.shuffle(names);
    System.out.println(names);

    // while (!names.isEmpty()) {
    //   System.out.println(names);
    //   names.remove(0);
    // } 
  }
}
