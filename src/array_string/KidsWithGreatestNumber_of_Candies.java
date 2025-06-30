package array_string;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumber_of_Candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for(int candy : candies){
            maxi = Math.max(maxi, candy);
        }
        for(int candy : candies){
            result.add(candy + extraCandies >= maxi);

//            if(candy + extraCandies >= maxi){
//                result.add(true);
//            }else {
//                result.add(false);
//            }
        }
        return result;
    }
}
