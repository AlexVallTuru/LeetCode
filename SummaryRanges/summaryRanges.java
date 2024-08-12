package SummaryRanges;

import java.util.ArrayList;
import java.util.List;

public class summaryRanges {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        List<String> result = summaryRangesX(new int[] { 0, 2, 4, 5, 6, 7 });

        for (String apareo : result) {
            System.out.println(apareo);
        }

    }

    public static List<String> summaryRangesX(int[] nums) {

        List<String> apareos = new ArrayList<>();

        if (nums.length == 0) {
            return apareos;
        }
        
        return apareos;

    }

}
