//package SummaryRanges;

import java.util.ArrayList;
import java.util.List;

public class summaryRanges {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        List<String> result = summaryRangesX(new int[] { 0, 2, 4, 5, 6, 8 });

        for (String apareo : result) {
            System.out.println(apareo);
        }

    }

    public static List<String> summaryRangesX(int[] nums) {

        List<String> apareos = new ArrayList<>();

        if (nums.length == 0) {
            return apareos;
        }

        int start = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Si hay una discontinuidad
            if (nums[i] - nums[i - 1] != 1) {
                if (nums[i - 1] == start) {
                    // Si el rango solo tiene un número
                    apareos.add(Integer.toString(start));
                } else {
                    // Si el rango tiene más de un número
                    apareos.add(start + "->" + nums[i - 1]);
                }
                start = nums[i]; // Nuevo rango empieza desde el número actual
            }
        }

        // Añadir el último rango después de terminar el bucle
        if (nums[nums.length - 1] == start) {
            apareos.add(Integer.toString(start));
        } else {
            apareos.add(start + "->" + nums[nums.length - 1]);
        } 
        return apareos;
    }

}
