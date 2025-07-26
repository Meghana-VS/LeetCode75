package prefix_sum;

public class Find_The_HighestAltitude {
    public static void main(String[] args) {
        int[] nums = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(nums));
    }

    public static int largestAltitude(int[] gain) {
        int highAltitude = 0;
        int currentAltitude = 0;
        for(int i=0; i<gain.length; i++){
            currentAltitude += gain[i];
            highAltitude = Math.max(highAltitude, currentAltitude);
        }
//******************************************************************************
//        int n = gain.length;
//        int[] prefix = new int[n+1];
//        prefix[0] = 0;
//        for(int i=1; i<prefix.length; i++){
//            prefix[i] = prefix[i-1] + gain[i-1];
//        }
//        int highAltitude = Integer.MIN_VALUE;
//        for(int num : prefix){
//            highAltitude = Math.max(highAltitude, num);
//        }
        return highAltitude;
    }
}
