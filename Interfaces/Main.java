package Interfaces;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] nums= {7,8,9,1,2,3,4,5,6};

    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));

    MyObject object = new MyObject(19);
    MyObject object2 = new MyObject(13);
    MyObject object3 = new MyObject(7);

    MyObject[] arrayOfObjects = new MyObject[3];
    arrayOfObjects[0] = object;
    arrayOfObjects[1] = object2;
    arrayOfObjects[2] = object3;

    Arrays.sort(arrayOfObjects);

    System.out.println(Arrays.toString(arrayOfObjects));
    // custom objects, need to override the toString for meaningful representation

    

  }
}
