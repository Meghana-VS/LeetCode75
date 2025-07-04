package array_string;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int[] nums = {2,1,5,0,4,6};
        System.out.println(increasingTriplet(nums));
    }
    public static boolean increasingTriplet(int[] nums) {
        int nums_i = Integer.MAX_VALUE;
        int nums_j = Integer.MAX_VALUE;

        for(int n : nums){
            if(n <= nums_i) nums_i = n;
            else if(n <= nums_j) nums_j = n;
            else return true;
        }
        return false;
    }
}
