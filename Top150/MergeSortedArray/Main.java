package Top150.MergeSortedArray;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] array1 = {1,2,3,0,0,0};
    int m = 3; 
    int[] array2 = {2,5,6};
    int n = 3;

    merge(array1,m,array2,n);
  } 

  public static int[] merge(int[] array1, int m, int[] array2, int n) {
    for (int i=0; i<n; i++ ) {
      array1[m + i] = array2[i];
    }
    Arrays.sort(array1);
    System.out.println(Arrays.toString(array1));
    return array1;
  }
}

