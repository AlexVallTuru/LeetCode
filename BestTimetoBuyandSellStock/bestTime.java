//package BestTimetoBuyandSellStock;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bestTime {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        int result = maxProfit(new int[] { 7, 1, 5, 3, 6, });

    }

    public static int maxProfit(int[] prices) {

        int minPrices = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i < prices.length; i++){

            if(prices[i] < minPrices){
                minPrices = prices[i];
            }

            if(prices[i] - minPrices > profit){
                profit = prices[i] - minPrices;
            }

        }
        return profit;
    }

}
