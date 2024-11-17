package SecondLargestFinder;

public class SecondLargestFinder {

  public static int findSecondLargest(int[] arr) {
      // Handle edge cases
      if (arr == null || arr.length < 2) {
          throw new IllegalArgumentException("Array must contain at least two elements");
      }
      int largest = Integer.MIN_VALUE;      // This ensures any number in the array will be larger; -2,147,483,648
      int secondLargest = Integer.MIN_VALUE; 
      // Traverse the array
      for (int num : arr) {
          if (num > largest) { 
              secondLargest = largest; 
              largest = num;  
          } else if (num > secondLargest && num != largest) {
              secondLargest = num; 
          }
      }
      // Check if secondLargest was updated
      if (secondLargest == Integer.MIN_VALUE) {
          throw new IllegalArgumentException("No valid second-largest number found");
      }

      return secondLargest;
  }

  public static void main(String[] args) {
      int[] numbers = {3, 5, 2, 7, 7, 1};
      System.out.println("Second Largest: " + findSecondLargest(numbers));
  }
}
