package array_string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWords_In_a_String {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s){
//******************* (TC - o(n), SC - o(n)) ******************************
        StringBuilder sb = new StringBuilder();
        int end = s.length()-1;
        while(end >= 0){
            while(end >= 0 && s.charAt(end) == ' ') {
                end--;
            }
            if(end < 0) break;

            int start = end;
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }
            sb.append(s.substring(start+1, end+1)).append(" ");
            end = start-1;
        }
        return sb.toString().trim();

//******************* (TC - o(n), SC - o(n)) ******************************
//        List<String> listOfWords = new ArrayList<>();
//        String[] words = s.trim().split(" ");
//        for(String word : words){
//            if(!word.isEmpty()){
//                listOfWords.add(word);
//            }
//        }
//        Collections.reverse(listOfWords);
//        return String.join(" ", listOfWords);
    }
}
