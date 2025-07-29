package prefix_sum;

public class Find_Pivot_Index {
    public static void main(String[] args) {
        int[] nums = {2,1,-1};
        System.out.println(pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int left = 0;
        for(int num : nums){
            sum += num;
        }
        for(int i=0; i<nums.length; i++){
            sum -= nums[i];
            if(left == sum) return i;
            left += nums[i];
        }
        return -1;
    }
}
