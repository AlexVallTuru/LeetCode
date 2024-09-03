//package WidestVerticalAreaBetween;

import java.util.Arrays;
import java.util.Comparator;

public class widestVerticalAreaBetween {
    
   public static void main(String[] args) {

       System.out.println("Hello LeetCoder!!");

       maxWidthOfVerticalArea(new int[][] {{3, 1},{9, 0},{1, 0},{1, 4},{5,3},{8,8}});

    }

   public static int maxWidthOfVerticalArea(int[][] points) {
    
    Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
    int maxDiff = 0;
    for (int i = 1; i < points.length; i++) {
        //System.out.println("Primer elemento de la fila " + i + ": " + points[i][0]);
        if((points[i][0] - points[i-1][0]) > maxDiff){
            maxDiff = points[i][0] - points[i-1][0];
        }
    }

    //System.out.println(maxDiff);

    return maxDiff;

   }

}
