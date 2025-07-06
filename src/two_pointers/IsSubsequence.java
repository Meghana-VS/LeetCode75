package two_pointers;

import java.util.ArrayList;
import java.util.List;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "acb", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        while(i < sChar.length && j < tChar.length){
            if(sChar[i] == tChar[j]){
                i++;
            }
            j++;
        }
        return i == sChar.length;

//******************************************************************
//        while(i < s.length() && j < t.length()){
//            if(s.charAt(i) == t.charAt(j)){
//                i++;
//            }
//            j++;
//        }
//        return i==s.length();
    }
}
