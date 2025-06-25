package array_string;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "", word2 = "pqrs";
        System.out.println(mergeStrings(word1, word2));
    }
    public static String mergeStrings(String s1, String s2){

//******************((TC - o(n+m)), (SC - o(n+m)))*******************

        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;

        while(i < s1.length() || j < s2.length()){
            if(i < s1.length()){
                sb.append(s1.charAt(i));
                i++;
            }
            if(j < s2.length()){
                sb.append(s2.charAt(j));
                j++;
            }
        }

        return sb.toString();
    }
}
