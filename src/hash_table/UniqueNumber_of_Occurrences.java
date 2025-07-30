package hash_table;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumber_of_Occurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> countOccurrences = new HashMap<>();
        for(int num : arr){
            countOccurrences.put(num, countOccurrences.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> uniqueOccurrence = new HashSet<>(countOccurrences.values());
        return countOccurrences.size() == uniqueOccurrence.size();
    }
}
