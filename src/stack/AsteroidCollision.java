package stack;

import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = {5,10,-5};
        int[] res = asteroidCollision(asteroids);
        for(int num : res){
            System.out.print(num+" ");
        }
    }
    public static int[] asteroidCollision(int[] asteroids) {
//**************************(TC - o(n), SC - o(n))************************************
        Stack<Integer> stack = new Stack<>();

        for(int a : asteroids){
            boolean destroyed = false;
            while(!stack.isEmpty() && a<0 && stack.peek() > 0){
                int top = stack.peek();
                if(Math.abs(a) > top){
                    stack.pop();
                    continue;
                }else if(Math.abs(a) == top){
                    stack.pop();
                    destroyed = true;
                    break;
                }else{
                    destroyed = true;
                    break;
                }
            }
            if(!destroyed) stack.push(a);
        }
        int[] arr = new int[stack.size()];
        int i=0;
        for(int num : stack){
            arr[i++] = num;
        }
        return arr;
    }
}
