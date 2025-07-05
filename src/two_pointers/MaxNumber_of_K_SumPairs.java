package two_pointers;

import java.util.HashMap;
import java.util.Map;

public class MaxNumber_of_K_SumPairs {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,3};
        int k = 5;
        System.out.println(maxOperations(nums, k));
    }
    public static int maxOperations(int[] nums, int k) {
//*************************(TC - o(n), SC - o(n))******************************
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int i : map.keySet()){
            if(map.containsKey(i) && map.containsKey(k-i)){
                if(i != k-i){
                    count += Math.min(map.get(i), map.get(k-i));
                    map.put(i,0);
                    map.put(k-i,0);
                }else{
                    count += Math.floor(map.get(i) / 2);
                    map.put(i, 0);
                }
            }
        }
        return count;
    }
}
