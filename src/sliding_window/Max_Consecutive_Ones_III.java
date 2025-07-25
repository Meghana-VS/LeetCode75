package sliding_window;

public class Max_Consecutive_Ones_III {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
//        int[] nums = {1,1,1,0};
//        int k = 1;
        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {
//***********************(TC - o(n), SC - o(1))*************************
//        int i = 0;
//        int j = 0;
//        while(i < nums.length){
//            if(nums[i] == 0) k--;
//            if(k < 0){
//                if(nums[j] == 0) k++;
//                j++;
//            }
//            i++;
//        }
//        return i-j;

//**********************************************************************
        int start = 0;
        int max_length = 0;
        int zero_count = 0;

        for(int end = 0; end < nums.length; end++){
            if(nums[end] == 0) zero_count++;
            if(zero_count > k){
                if(nums[start] == 0){
                    zero_count--;
                }
                start++;
            }
            max_length = Math.max(max_length, end-start+1);
        }
        return  max_length;
    }
}
