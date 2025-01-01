package SlidingWindowProblem;

public class AdvancedSlidingWindow{

  public static void main(String[] args) {
    int[] nums = {15, 10, 10, 4, 5, 6, 7, 8, 9, 10};
    int windowSize = 3;

    int largestSum = findWindowSum(nums, windowSize);
    System.out.println("Largest sum of window size " + windowSize + ": " + largestSum);
  }

  public static int findWindowSum(int[] nums, int windowSize) {
    if (nums.length < windowSize) {
      throw new IllegalArgumentException("Array length must be greater than or equal to window size");
    }
    int sum = 0;
    int largest = 0;

    for (int i = 0; i < windowSize; i++) {
      sum += nums[i];
    }
    largest = sum;

    for (int i = windowSize; i < nums.length; i++) {
      sum += nums[i] - nums[i - windowSize];
      largest = Math.max(largest, sum);
    }
    return largest;
  }
}
