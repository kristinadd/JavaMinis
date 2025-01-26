package Top150.MergeSortedArray;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] array1 = {1,2,3,0,0,0};
    int m = 3; 
    int[] array2 = {2,5,6};
    int n = 3;

    mergeEfficiently(array1,m,array2,n);
  } 

  public static int[] merge(int[] array1, int m, int[] array2, int n) {
    for (int i=0; i<n; i++ ) {
      array1[m + i] = array2[i];
    }
    Arrays.sort(array1);
    System.out.println(Arrays.toString(array1));
    return array1;
  }
// merge in-place
  public static int[] mergeEfficiently(int[] nums1, int m, int[] nums2, int n) {
    int i = m-1;
    int j = n-1;
    int k = (m+n)-1;

    while (i >= 0 && j >= 0) {
      if (nums1[i] > nums2[j]) {
        nums1[k] = nums1[i];
        i --;
      } else {
        nums1[k] = nums2[j];
        j --;
      }
      k --;
    }
    System.out.println(Arrays.toString(nums1));
    return nums1;
  }
}

