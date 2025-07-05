package two_pointers;

//LC - 1456
public class MaximumVowelsIn_a_substring {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }
    public static int maxVowels(String s, int k) {
        int count = 0;
        char[] ch = s.toCharArray();
        for(int i=0; i<k; i++){
            if(isVowel(ch[i])) count++;
        }
        int max_vowels = count;

        int startIndx = 0;
        int endIndx = k;
        while(endIndx < ch.length){
            if(isVowel(ch[startIndx]))count --;
            startIndx++;

            if(isVowel(ch[endIndx])) count++;
            endIndx++;

            max_vowels = Math.max(max_vowels, count);
        }
        return max_vowels;
    }
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
}
