package sliding_window;

public class MaximumAverageSubarray1 {
    public static void main(String[] args){
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }
    public static double findMaxAverage(int[] nums, int k){
        // Get sum for starting window
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        int max_sum = sum;

        // Start sliding the window
        int startIndex = 0;
        int endIndex = k;

        while(endIndex < nums.length){

            sum -= nums[startIndex];             //Remove previous element
            startIndex++;

            sum += nums[endIndex];              //Add next element
            endIndex++;

            max_sum = Math.max(max_sum, sum);   //Update max sum
        }
        return (double) max_sum / k;
    }
}
