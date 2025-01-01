package MaxScoreAfterSplitingString;

public class VersionThree {
  public int maxScore(String s) {
    int[] zeroes=new int[s.length()];
    int[] ones=new int[s.length()];

    char[] sarr=s.toCharArray();

    if(sarr[0]=='0'){
        zeroes[0]=1;
    }
    
    if(sarr[sarr.length-1]=='1'){
        ones[sarr.length-1]=1;
    }

    for(int i=1;i<sarr.length-1;i++){
        int isZero=(sarr[i]=='0')?1:0;
        int isOne=(sarr[sarr.length-1-i]=='1')?1:0;
        zeroes[i]=zeroes[i-1]+isZero;
        ones[sarr.length-1-i]=ones[sarr.length-i]+isOne;
    }
    int max=-1;
    for(int i=1;i<sarr.length;i++){
       max= Math.max(max,zeroes[i-1]+ones[i]);
    }
    return max;
  }
}
