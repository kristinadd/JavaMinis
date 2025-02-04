package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7,8,9,10};
    int target = 7;

    int[] result = twoSum(nums, target);
    System.out.println(Arrays.toString(result));
  }


  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i =0; i<nums.length; i++) {
      int complement = target - nums[i];
      
      if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i};
      }
      map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order. Return the indices
