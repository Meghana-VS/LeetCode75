package stack;

import java.util.Stack;

public class RemovingStarsFrom_a_String {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
    public static String removeStars(String s) {
        //****************(TC - o(n), SC - o(n))**************************
//        Stack<Character> stack = new Stack<>();
//        StringBuilder sb = new StringBuilder();
//        for(char ch : s.toCharArray()){
//            if(ch == '*'){
//                stack.pop();
//            }else {
//                stack.push(ch);
//            }
//        }
//        for(int i=0; i<stack.size(); i++){
//            sb.append(stack.get(i));
//        }
//        return sb.toString();
        //****************(TC - o(n), SC - o(n))**************************
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '*'){
                sb.deleteCharAt(sb.length()-1);
            }else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
