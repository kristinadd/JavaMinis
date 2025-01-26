package Top150.RemoveElement;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] nums = {0,1,2,2,3,0,4,2};
    int val = 2;
    removeElement(nums, val);
  }


  // public static int removeElement(int[] nums, int val) {
  //   ArrayList<Integer> sanitizedList = new ArrayList<>();
  //   for (int i=0; i<nums.length; i++) {
  //     if (nums[i] != val) {
  //       sanitizedList.add(nums[i]);
  //     }
  //   }
  //   System.out.println(sanitizedList.size());
  //   System.out.println(sanitizedList);
  //   return sanitizedList.size();
  //   }


  // Solution
  public static int removeElement(int[] nums, int val) {
    int k = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != val) {
            nums[k] = nums[i];
            k++; 
        }
    }
    System.out.println(Arrays.toString(nums));
    System.out.println(k);
    return k; 
  }
}
