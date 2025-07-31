package hash_table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualRow_and_ColumnPairs {
    public static void main(String[] args) {
        int[][] grid = {
                {3,2,1},
                {1,7,6},
                {2,7,7}
        };
        System.out.println(equalPairs(grid));
    }
    public static int equalPairs(int[][] grid) {

        //***********************(TC - o(n^3), SC - o(1))*********************************
//        int n = grid.length;
//        int count = 0;
//
//        for(int i=0; i<n; i++){                     //loop over each row
//            for(int j=0; j<n; j++){                 //loop over each column
//                boolean match = true;
//                for(int k=0; k<n; k++){             //compare row i and column j
//                    if(grid[i][k] != grid[k][j]){
//                        match = false;
//                        break;
//                    }
//                }
//                if(match) count++;                   //found a matching row-column pair
//            }
//        }
//        return count;
//*******************************************************************************************

        //***********************(TC - o(n^2), SC - o(n^2))*********************************
        //Instead of String, we can use List<Integer> also(list.add(grid[i][j])), but SC will be same SC - o(n^2)

        int n = grid.length;
        int count = 0;
        Map<String, Integer> rowMap = new HashMap<>();

        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                sb.append(grid[i][j]).append(",");
            }
            rowMap.put(sb.toString(), rowMap.getOrDefault(sb.toString(), 0) + 1);
        }
        for(int j=0; j<n; j++){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<n; i++){
                sb.append(grid[i][j]).append(",");
            }
            count += rowMap.getOrDefault(sb.toString(), 0);
        }
        return count;
    }
}
