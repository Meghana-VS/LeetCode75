package sliding_window;

public class LongestSubarray_of_one_s_AfterDeletingOneElement {
    public static void main(String[] args) {
//        int[] nums = {0,1,1,1,0,1,1,0,1};
        int[] nums = {1,1,0,1};
        System.out.println(longestSubarray(nums));
    }
    public static int longestSubarray(int[] nums) {
        int maxLen = 0;
        int start = 0;
        int indexOfLastZero = -1;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                start = indexOfLastZero + 1;
                indexOfLastZero = i;
            }
            maxLen = Math.max(maxLen, i-start);
        }
        return maxLen;
    }
}
