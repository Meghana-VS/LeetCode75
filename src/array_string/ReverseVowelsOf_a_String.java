package array_string;

public class ReverseVowelsOf_a_String {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s){
        char[] ch = s.toCharArray();
        int left = 0, right = ch.length-1;
        while (left < right){
            if(!isVowel(ch[left])) left++;
            if(!isVowel(ch[right])) right--;
            if(isVowel(ch[left]) && isVowel(ch[right])){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(ch);
    }
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' ||
                ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
}
