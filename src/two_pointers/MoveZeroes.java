package two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
//**************************(TC - o(n), SC - o(n))************************
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(num != 0) list.add(num);
        }
        for(int i=0; i<list.size(); i++){
            nums[i] = list.get(i);
        }
        for(int i=list.size(); i<n; i++){
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
