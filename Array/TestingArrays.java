package Array;

public class TestingArrays {
  
  public static void main(String[] args) {
  int[] nums = new int[5];

  // Arrays do not have methods like .add() or .put() because they are fixed in size. To assign values to an array, you directly access its elements using their index positions

    // When you need to modify elements or access indices.
    for (int i =0; i< nums.length; i++) {
      nums[i] = i+1;
    }

    // When you only need to read values from an array.
    for (int num : nums) { // the variable num holds a copy of the current element's value in the array. It does not directly reference the element in the array.
      nums[num] = num +1; // Modifying nums[num] (or any other array element) does not affect the value of num in the current or subsequent iterations.
      System.out.println(num);
    }

    // The iteration variable (e.g., num in for (int num : nums)) is a copy of the array element.
    // Modifying num does not affect the actual array because you’re modifying the copy, not the original element.

  }
}
