package IntersectionOfTwoArraysFinder;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
  // The intersection contains elements that are present in both arrays, without duplicates.
  public static int[] intersectionOfTwoArrays(int[] nums_one, int[] nums_two) {

    // Handle edge cases
    if (nums_one == null || nums_two == null || nums_one.length == 0 || nums_two.length == 0) {
      throw new IllegalArgumentException("Array cannot be null or empty");
    }

    // Store all uniq elements from the first array
    Set<Integer> set1 = new HashSet<>();
    for (int num : nums_one) {
      set1.add(num);
    }


    return new int[0]; 
  }
}
