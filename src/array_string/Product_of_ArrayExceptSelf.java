package array_string;

import java.util.Arrays;
import java.util.List;

public class Product_of_ArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
//        for(int x : ans) System.out.print(x+" ");
    }
    public static int[] productExceptSelf(int[] nums){
//*************************** (TC - o(n) )****************************
        int n = nums.length;
        int[] res = new int[n];

        //Building prefix product
        res[0] = 1;
        for(int i=1; i<n; i++){
            res[i] = res[i-1] * nums[i-1];
        }

        //Multiplying with suffix products on the go
        int suffix = 1;
        for(int i=n-1; i>=0; i--){
            res[i] = res[i] * suffix;
            suffix *= nums[i];
        }
        return res;
    }
}
