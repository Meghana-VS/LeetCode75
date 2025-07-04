package array_string;

//************************ TC(o(n)) ********************************

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars));
    }
    public static int compress(char[] chars) {
        int n= chars.length;
        int idx = 0;

        for (int i=0; i<n; i++){
            char ch = chars[i];
            int count = 0;

            while (i < n && chars[i] == ch){
                count++;
                i++;
            }

            if(count == 1) chars[idx++] = ch;
            else{
                chars[idx++] = ch;
                String str = String.valueOf(count);
                for(char digit : str.toCharArray()){
                    chars[idx++] = digit;
                }
            }
            i--;
        }
        return idx;
    }
}
