package array_string;

public class Can_Place_Flowers {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n){
        int count = 0;
        for(int i=0; i< flowerbed.length; i++){
            if(flowerbed[i] == 0){
                int previous = (i==0 || flowerbed[i-1] == 0) ? 0 : 1;
                int next = (i == flowerbed.length-1 || flowerbed[i+1] == 0) ? 0 : 1;

                if(previous == 0 && next == 0){
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
//        return count==n;
        return count >= n;
    }
}
