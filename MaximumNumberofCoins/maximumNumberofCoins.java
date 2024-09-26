package MaximumNumberofCoins;

import java.util.Arrays;

public class maximumNumberofCoins {
    
    public static void main(String[] args) {
    
        System.out.println("Hello LeetCoder!!");
    
        System.out.println(maxCoins(new int[]{2,4,1,2,7,8}));

    }

    public static int maxCoins(int[] piles){

        Arrays.sort(piles);
        
        int result = 0;

        int len = piles.length;
        int count = len;
        for (int i = 0; i < len; i = i+3 ) {
        count = count -2;
        result += piles[count];
        
        }

        return result;
    }

}
