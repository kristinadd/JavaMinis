package MaxScoreAfterSplitingString;
public class MaxScoreAfterSplitingString {
  public static int maxScore(String s) {
    if (s == null || s.length() < 2 || s.length() > 500) {
        throw new IllegalArgumentException("Input string must have at least 2 characters.");
    }

    int totalOnes = 0; // Count total number of 1s in the string
    for (char c : s.toCharArray()) {
        if (c == '1') {
            totalOnes++;
        }
    }

    int leftZeros = 0; // Number of 0s in the left substring
    int rightOnes = totalOnes; // Initially, all 1s are in the right substring
    int maxScore = 0;

    // Start sliding the split point
    for (int i = 0; i < s.length() - 1; i++) {
        if (s.charAt(i) == '0') {
            leftZeros++;
        } else if (s.charAt(i) == '1') {
            rightOnes--;
        }

        // Calculate the score for the current split
        int score = leftZeros + rightOnes;
        maxScore = Math.max(maxScore, score);
    }

    return maxScore;
  }

  public static void main(String[] args) {
      String s = "1110011";
      System.out.println("Maximum score: " + maxScore(s)); // Output: 4
  }
}
