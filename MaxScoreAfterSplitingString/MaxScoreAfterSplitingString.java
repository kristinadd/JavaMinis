package MaxScoreAfterSplitingString;

import java.util.Arrays;

public class MaxScoreAfterSplitingString {
  public static void main(String[] args) {
    String string = "011101";
    maxScore(string);
  }

  public static int maxScore(String string) {
    if (string.length() < 2) {
      throw new IllegalArgumentException("String must have at least 2 characters.");
    }
    char[] charString = string.toCharArray();
    for (int i=0; i<charString.length; i++) {
      char[] left;
      char[] right;

      
    }
    return 0;
  }
}
