package TheNumberoftheSmallestUnoccupiedChar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class numberUnoccupiedChair {
    
    public static void main(String[] args) {
    
        System.out.println("Hello LeetCoder!!");
    
    }

    public int smallestChair(int[][] times, int targetFriend) {
     
        int len = times.length;

        PriorityQueue<Integer> freeChairs = new PriorityQueue<>();
        
        int[][] timesWithIndex = new int[len][3];  // Creamos una nueva matriz de 3 columnas
        for (int i = 0; i < len; i++) {
            timesWithIndex[i][0] = times[i][0];  // Copiamos el tiempo de llegada
            timesWithIndex[i][1] = times[i][1];  // Copiamos el tiempo de salida
            timesWithIndex[i][2] = i;            // Guardamos el índice original del amigo
        }
        
        Arrays.sort(timesWithIndex, (timeArrive1, timeArrive2) -> Integer.compare(timeArrive1[0], timeArrive2[0]));
        

        for (int i = 0; i < len; i++) {
        
            freeChairs.add(timesWithIndex[i][2]);

        }

        return 0;
    }
}
