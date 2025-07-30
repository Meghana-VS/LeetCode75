package hash_table;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DetermineIfTwoStringsAreClose {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "bca";
        System.out.println(closeStrings(word1, word2));
    }
    public static boolean closeStrings(String word1, String word2) {

        //********************(TC - o(nlogn), SC - 0(1))***************************
//          if(word1.length() != word2.length()) return false;
//        int[] w1 = new int[26];
//        int[] w2 = new int[26];
//
//        for(char c : word1.toCharArray()){
//            w1[c - 'a']++;
//        }
//        for(char c : word2.toCharArray()){
//            w2[c - 'a']++;
//        }
//        //step1
//        for(int i=0; i<26; i++){
//            if((w1[i] == 0 && w2[i] != 0) || (w1[i] != 0 && w2[i] == 0)){
//                return false;
//            }
//        }
//        Arrays.sort(w1);
//        Arrays.sort(w2);
//
//        return Arrays.equals(w1, w2);

//*****************************************************************************

        //********************(TC - o(n), SC - 0(1))***************************
        if(word1.length() != word2.length()) return  false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for(char c : word1.toCharArray()){
            freq1[c - 'a']++;
            set1.add(c);
        }
        for(char c : word2.toCharArray()){
            freq2[c - 'a']++;
            set2.add(c);
        }
        //check if both words have same characters
        if(!set1.equals(set2)) return false;

        //check if frequency patterns match (order agnostic)
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);

    }
}
