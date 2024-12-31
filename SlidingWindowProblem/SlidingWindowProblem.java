package SlidingWindowProblem;

public class SlidingWindowProblem {
  public static int[] window = new int[3];
  public static void main(String[] args) {
    int[] nums = {8,9,10,1,2,3,4,5,6,7};

    findWindowSum(nums);
  }

  public static int findWindowSum(int[] nums) {
    int sum = 0;
    int largest = 0;
    for (int i=0; i<nums.length-2; i++) {
      sum = nums[i] + nums[i+1] + nums[i+2];
      if (sum > largest) {
        largest = sum;
      }
    }
    System.out.println(largest);
    return largest;
  }
  
}
