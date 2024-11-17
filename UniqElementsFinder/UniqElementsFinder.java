package UniqElementsFinder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqElementsFinder {
  // An element is considered unique if it appears exactly once in the array.

  public static int[] findUniq(int[] nums) {
    // Handle edge cases
    if (nums == null || nums.length ==0) {
      throw new IllegalArgumentException("Array must contain at least one element");
    }

    // Count frequencies
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      if (map.containsKey(num)) {
        map.put(num, map.getOrDefault(num, 0) + 1);
      }
    }

    // Filter uniq elements
    List<Integer> uniqList = new ArrayList<>();
    for (int num : nums) {
      if (map.get(num) == 1) {
        uniqList.add(num);
      }
    }

    // Conver the ArrayList into Array of integers
    int[] uniqArray = uniqList.stream().mapToInt(Integer::intValue).toArray();

    return uniqArray;
  }
}
